package cn.org.bnc.opsManager.service;

import cn.org.bnc.opsManager.Response.FloatingResponse;
import cn.org.bnc.opsManager.controller.Controller;
import cn.org.bnc.opsManager.entity.FloatingInfoEntity;
import cn.org.bnc.opsManager.entity.FloatingNodeEntity;
import cn.org.bnc.opsManager.manager.ComputerImpl;
import cn.org.bnc.opsManager.manager.FloatingipImpl;
import cn.org.bnc.opsManager.model.Address;
import cn.org.bnc.opsManager.model.Floatingip;
import cn.org.bnc.opsManager.model.Servers;

import java.util.ArrayList;
import java.util.List;

public class FloatingServiceImpl {
    static FloatingServiceImpl floatingService = new FloatingServiceImpl();
    String token = Controller.token;
    String tenantId = Controller.tenantId;

    public static FloatingServiceImpl getFloatingServiceImpl() {
        if (null == floatingService) {
            floatingService = new FloatingServiceImpl();
        }
        return floatingService;
    }

    public FloatingResponse getFloatingResponse() {
        FloatingResponse floatingResponse = new FloatingResponse();
        FloatingInfoEntity floatingInfoEntity = new FloatingInfoEntity();
        floatingResponse.setFloatInfo(floatingInfoEntity);
        List<FloatingNodeEntity> nodes = new ArrayList<>();
        List<String> floatingIps = new ArrayList<>();
        floatingInfoEntity.setNodes(nodes);
        FloatingNodeEntity floatingNodeEntity;
        for (Servers server : ComputerImpl.getComputers(token).getServers()) {
            if (null != server.getAddresses().getTest() && server.getAddresses().getTest().size() > 1) {
                floatingNodeEntity = new FloatingNodeEntity();
                floatingNodeEntity.setName(server.getName());
                for (Address address : server.getAddresses().getTest()) {
                    if ("fixed".equals(address.getType())) {
                        floatingNodeEntity.setOriginalIP(address.getAddr());
                        floatingNodeEntity.setMac(address.getMac_addr());
                    }
                    if ("floating".equals(address.getType())) {
                        floatingNodeEntity.setFloatIP(address.getAddr());
                        floatingIps.add(address.getAddr());
                    }
                }
                nodes.add(floatingNodeEntity);
            }
        }
        for (Floatingip floatingip : FloatingipImpl.getFloatingips(token).getFloatingips()) {
            if (!floatingIps.contains(floatingip.getFloating_ip_address())) {
                floatingNodeEntity = new FloatingNodeEntity();
                floatingNodeEntity.setFloatIP(floatingip.getFloating_ip_address());
                nodes.add(floatingNodeEntity);
            }
        }
        return floatingResponse;
    }
}
