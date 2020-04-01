package cn.org.bnc.opsManager.service;

import cn.org.bnc.opsManager.Response.NatResponse;
import cn.org.bnc.opsManager.controller.Controller;
import cn.org.bnc.opsManager.entity.NatInfoEntity;
import cn.org.bnc.opsManager.entity.NatNodeEntity;
import cn.org.bnc.opsManager.manager.NatImpl;
import cn.org.bnc.opsManager.manager.PortImpl;
import cn.org.bnc.opsManager.manager.RouterImpl;
import cn.org.bnc.opsManager.model.Port;
import cn.org.bnc.opsManager.model.Router;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NatServiceImpl {
    static NatServiceImpl natService = new NatServiceImpl();
    String token = Controller.token;
    String tenantId = Controller.tenantId;

    public static NatServiceImpl getNatServiceImpl() {
        if (null == natService) {
            natService = new NatServiceImpl();
        }
        return natService;
    }

    public NatResponse getNatResponse() {
        NatResponse natResponse = new NatResponse();
        NatInfoEntity natInfoEntity = new NatInfoEntity();
        natResponse.setNatInfo(natInfoEntity);
        List<NatNodeEntity> nodes = new ArrayList<>();
        natInfoEntity.setNodes(nodes);
        NatNodeEntity natNodeEntity;
        Map<String, Port> map = new HashMap<>();
        for (Port port : PortImpl.getPorts(token).getPorts()) {
            if (("network:router_gateway").equals(port.getDevice_owner())) {
                if (("network:router_gateway").equals(port.getDevice_owner())) {
                    map.put(port.getDevice_id(), port);
                }
            }
        }
        for (Router router : RouterImpl.getRouters(token).getRouters()) {
            if (tenantId.equals(router.getTenant_id())) {
                natNodeEntity = new NatNodeEntity();
                natNodeEntity.setName(router.getName());
                natNodeEntity.setId(router.getId());
                if (null != router.getExternal_gateway_info()) {
                    boolean nat = router.getExternal_gateway_info().isEnable_snat();
                    natNodeEntity.setNat(nat);
                    natNodeEntity.setNetwork_id(router.getExternal_gateway_info().getNetwork_id());
                    natNodeEntity.setIp(router.getExternal_gateway_info().getExternal_fixed_ips().get(0).getIp_address());
                }
                if (map.containsKey(router.getId())) {
                    Port port = map.get(router.getId());
                    natNodeEntity.setMac(port.getMac_address());
                }
                nodes.add(natNodeEntity);
            }
        }
        return natResponse;
    }

    public String modifyNat(String id, String network_id, boolean snat, String token) {
        return NatImpl.natModify(id, network_id, snat, token);
    }
}
