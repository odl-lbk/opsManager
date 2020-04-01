package cn.org.bnc.opsManager.controller;

import cn.org.bnc.opsManager.Response.*;
import cn.org.bnc.opsManager.entity.NetworkEntity;
import cn.org.bnc.opsManager.entity.SubNetworkEntity;
import cn.org.bnc.opsManager.entity.TopologyEntity;
import cn.org.bnc.opsManager.manager.TokenImpl;
import cn.org.bnc.opsManager.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class Controller {
    public static String ip = "172.16.38.69";
    public static String tenantId = "27cb90eb26fa46d39aef07d81e29866e";
    public static String token;

    @RequestMapping(value = "/network", method = RequestMethod.GET)
    public NetworkEntity getNetwork() {
        NetworkEntity networkEntity = new NetworkEntity();
        return networkEntity;
    }

    @RequestMapping(value = "/subnet", method = RequestMethod.GET)
    public SubNetworkEntity getSubnet() {
        SubNetworkEntity subNetworkEntity = new SubNetworkEntity();
        return subNetworkEntity;
    }

    @RequestMapping(value = "/topology", method = RequestMethod.GET)
    public TopologyEntity getTopology() {
        TopologyEntity topologyEntity = new TopologyEntity();
        return topologyEntity;
    }

    @RequestMapping(value = "/topo", method = RequestMethod.GET)
    public TopoResponse getTopo() {
        token = TokenImpl.getToken();
        TopoResponse topoResponse;
        topoResponse = TopoServiceImpl.getTopoServiceImpl().getTopoResponse();
        return topoResponse;
    }

    @RequestMapping(value = "/element", method = RequestMethod.GET)
    public ElementResponse getElement() {
        token = TokenImpl.getToken();
        ElementResponse elementResponse;
        elementResponse = ElementServiceImpl.getElementServiceImpl().getElementResponse();
        return elementResponse;
    }

    @RequestMapping(value = "/security", method = RequestMethod.GET)
    public SecurityGroupResponse getSecurity() {
        token = TokenImpl.getToken();
        return SecurityGroupSeviceImpl.getSecurityGroupSeviceImpl().getSecurityGroupResponse();
    }

    @RequestMapping(value = "/nat", method = RequestMethod.GET)
    public NatResponse getNat() {
        token = TokenImpl.getToken();
        return NatServiceImpl.getNatServiceImpl().getNatResponse();
    }

    @RequestMapping(value = "/nat", method = RequestMethod.PUT)
    public String modifyNat(@RequestParam String id, @RequestParam String network_id, @RequestParam boolean snat) {
        token = TokenImpl.getToken();
        return NatServiceImpl.getNatServiceImpl().modifyNat(id, network_id, snat, token);
    }

    @RequestMapping(value = "/floating", method = RequestMethod.GET)
    public FloatingResponse getFloating() {
        token = TokenImpl.getToken();
        return FloatingServiceImpl.getFloatingServiceImpl().getFloatingResponse();
    }

    @RequestMapping(value = "/qos", method = RequestMethod.GET)
    public QosResponse getQos() {
        token = TokenImpl.getToken();
        return QosServiceImpl.getQosServiceImpl().getQosResponse();
    }

}
