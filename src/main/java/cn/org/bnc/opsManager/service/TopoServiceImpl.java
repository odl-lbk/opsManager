package cn.org.bnc.opsManager.service;

import cn.org.bnc.opsManager.Response.TopoResponse;
import cn.org.bnc.opsManager.controller.Controller;
import cn.org.bnc.opsManager.entity.*;
import cn.org.bnc.opsManager.manager.*;
import cn.org.bnc.opsManager.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopoServiceImpl {
    static TopoServiceImpl topoService = new TopoServiceImpl();
    String token = Controller.token;
    String tenantId = Controller.tenantId;
    Map<String, Map<String, String>> mapMap = new HashMap<>();
    List<Floatingip> floatingips;
    Map<String, String> map;

    public static TopoServiceImpl getTopoServiceImpl() {
        if (null == topoService) {
            topoService = new TopoServiceImpl();
        }
        return topoService;
    }

    public String getIndex(String str1, String str2) {
        String index;
        if (mapMap.containsKey(str1)) {
            if (mapMap.get(str1).containsKey(str2)) {
            } else {
                mapMap.get(str1).put(str2, "p" + (mapMap.get(str1).size() + 1));
            }
            index = mapMap.get(str1).get(str2);
        } else {
            Map<String, String> map = new HashMap<>();
            map.put(str2, "p" + 1);
            mapMap.put(str1, map);
            index = map.get(str2);
        }
        return index;
    }


    public TopologyEntity getTopologyEntity() {
        TopologyEntity topologyEntity = new TopologyEntity();
        Routers routers = RouterImpl.getRouters(token);
        Map<String, RouterEntity> routerEntityMap = new HashMap<>();
        RouterEntity routerEntity;
        Map<String, ComputerEntity> computerEntityMap = new HashMap<>();
        Map<String, NetworkEntity> networkEntityMap = new HashMap<>();
        NetworkEntity networkEntity;
        ComputerEntity computerEntity;
        for (Servers computer : ComputerImpl.getComputers(token).getServers()) {
            if (tenantId.equals(computer.getTenant_id())) {
                computerEntity = new ComputerEntity();
                computerEntity.setName(computer.getName());
                computerEntity.setId(computer.getId());
                computerEntityMap.put(computer.getId(), computerEntity);
            }
        }
        SubNetworkEntity subNetworkEntity;
        for (Router router : routers.getRouters()) {
            if (tenantId.equals(router.getTenant_id())) {
                routerEntity = new RouterEntity();
                routerEntity.setId(router.getId());
                routerEntity.setName(router.getName());
                if (null != router.getExternal_gateway_info()) {
                    routerEntity.setNat(router.getExternal_gateway_info().isEnable_snat());
                } else {
                    routerEntity.setNat(false);
                }
                routerEntityMap.put(router.getId(), routerEntity);
            }
        }
        topologyEntity.setRouterEntityMap(routerEntityMap);

        for (Network network : NetworkImpl.getNetWorks(token).getNetworks()) {
            if (tenantId.equals(network.getTenant_id())) {
                networkEntity = new NetworkEntity();
                networkEntity.setId(network.getId());
                networkEntity.setName(network.getName());
                networkEntity.setType(network.getNetwork_type());
                networkEntityMap.put(network.getId(), networkEntity);
            }
        }
        for (Subnet subnet : SubnetWorkImpl.getSubnets(token).getSubnets()) {
            if (tenantId.equals(subnet.getTenant_id())) {
                subNetworkEntity = new SubNetworkEntity();
                subNetworkEntity.setId(subnet.getId());
                subNetworkEntity.setName(subnet.getName());
                subNetworkEntity.setIp_version(subnet.getIp_version() + "");
                subNetworkEntity.setIp(subnet.getGateway_ip());
                if (networkEntityMap.containsKey(subnet.getNetwork_id())) {
                    networkEntityMap.get(subnet.getNetwork_id()).getSubNetworkEntityMap().put(subnet.getId(), subNetworkEntity);
                }
            }
        }
        for (Port port : PortImpl.getPorts(token).getPorts()) {
            if ("network:router_interface".equals(port.getDevice_owner()) || ("network:router_gateway").equals(port.getDevice_owner())) {
                if (topologyEntity.getRouterEntityMap().containsKey(port.getDevice_id())) {
                    if (("network:router_gateway").equals(port.getDevice_owner())) {
                        topologyEntity.getRouterEntityMap().get(port.getDevice_id()).setIp(port.getFixed_ips().get(0).getIp_address());
                        topologyEntity.getRouterEntityMap().get(port.getDevice_id()).setMac(port.getMac_address());
                    }
                    if (tenantId.equals(port.getTenant_id())) {
                        if (topologyEntity.getRouterEntityMap().get(port.getDevice_id()).getNetworkEntityMap().containsKey(port.getNetwork_id())) {
                        } else {
                            if (networkEntityMap.containsKey(port.getNetwork_id())) {
                                topologyEntity.getRouterEntityMap().get(port.getDevice_id()).getNetworkEntityMap().put
                                        (port.getNetwork_id(), networkEntityMap.get(port.getNetwork_id()));
                            }
                        }
                    }
                }
            }
            if ("network:router_interface".equals(port.getDevice_owner())) {
                if (tenantId.equals(port.getTenant_id())) {
                    networkEntityMap.get(port.getNetwork_id()).getSubNetworkEntityMap().get(port.getFixed_ips()
                            .get(0).getSubnet_id()).setMac(port.getMac_address());
                    networkEntityMap.get(port.getNetwork_id()).getSubNetworkEntityMap().get(port.getFixed_ips()
                            .get(0).getSubnet_id()).setQos(port.getQos_policy_id());
                }
            }
            if ("compute:nova".equals(port.getDevice_owner())) {
                if (tenantId.equals(port.getTenant_id())) {
                    if (networkEntityMap.containsKey(port.getNetwork_id())) {
                        computerEntity = computerEntityMap.get(port.getDevice_id());
                        computerEntity.setMac(port.getMac_address());
                        if (port.getSecurity_groups().size() > 0) {
                            computerEntity.setSecurityGroupId(port.getSecurity_groups().get(0));
                        }
                        computerEntity.setQos(port.getQos_policy_id());
                        computerEntity.setIp(port.getFixed_ips().get(0).getIp_address());
                        networkEntityMap.get(port.getNetwork_id()).getSubNetworkEntityMap().get(port.getFixed_ips()
                                .get(0).getSubnet_id()).getComputerEntities().add(computerEntity);
                    }
                }
            }
        }
        return topologyEntity;
    }

    public boolean isfloatingIp(String ip) {
        boolean flag = false;
        if (map.containsKey(ip)) {
            flag = true;
        }
        return flag;
    }

    public TopoResponse getTopoResponse() {
        TopoResponse topoResponse = new TopoResponse();
        TopoEntity topoEntity = new TopoEntity();
        topoResponse.setTopo(topoEntity);
        List<NodeEntity> nodes = new ArrayList<>();
        List<NodeEntity> switchNodes = new ArrayList<>();
        List<LinksEntity> links = new ArrayList<>();
        topoEntity.setNodes(nodes);
        topoEntity.setLinks(links);
        NodeEntity nodeEntity;
        NodeEntity node;
        NodeEntity routerNode;
        LinksEntity linksEntity;
        floatingips = FloatingipImpl.getFloatingips(token).getFloatingips();
        map = new HashMap<>();
        for (Floatingip floatingip : floatingips) {
            map.put(floatingip.getFixed_ip_address(), floatingip.getFloating_ip_address());
        }
        for (Map.Entry<String, RouterEntity> entry : getTopologyEntity().getRouterEntityMap().entrySet()) {
            routerNode = new NodeEntity();
            routerNode.setNode_type("router");
            routerNode.setNode_ip(entry.getValue().getIp());
            routerNode.setMac(entry.getValue().getMac());
            routerNode.setNat(entry.getValue().isNat());
            nodes.add(routerNode);
            for (Map.Entry<String, NetworkEntity> networkEntry : entry.getValue().getNetworkEntityMap().entrySet()) {
                if ("vxlan".equals(networkEntry.getValue().getType())) {
                    for (Map.Entry<String, SubNetworkEntity> subnetEntry : networkEntry.getValue().getSubNetworkEntityMap().entrySet()) {
                        if ("4".equals(subnetEntry.getValue().getIp_version())) {
                            nodeEntity = new NodeEntity();
                            nodeEntity.setNode_type("switch");
                            nodeEntity.setNode_ip(subnetEntry.getValue().getIp());
                            nodeEntity.setMac(subnetEntry.getValue().getMac());
                            nodes.add(nodeEntity);
                            switchNodes.add(nodeEntity);
                            linksEntity = new LinksEntity();
                            linksEntity.setDst_ip(entry.getValue().getIp());
                            linksEntity.setSrc_ip(subnetEntry.getValue().getIp());
                            linksEntity.setQos(subnetEntry.getValue().getQos());
                            linksEntity.setSrc_port("p0");
                            linksEntity.setDst_port(getIndex(entry.getValue().getIp(), subnetEntry.getValue().getIp()));
                            links.add(linksEntity);
                            if (subnetEntry.getValue().getName().contains("sdn") || subnetEntry.getValue().getName().
                                    contains("SDN") || subnetEntry.getValue().getName().contains("Sdn")) {
                                for (int i = 1; i < 5; i++) {
                                    node = new NodeEntity();
                                    node.setNode_type("host");
                                    node.setNode_ip("10.0.0.1" + i);
                                    node.setId("cdd40890-d06a-4283-8556-579a6a581ce" + i);
                                    node.setName("sdn" + i);
                                    node.setMac("fa:16:3e:2e:b6:1" + i);
                                    nodes.add(node);
                                    linksEntity = new LinksEntity();
                                    linksEntity.setDst_ip(subnetEntry.getValue().getIp());
                                    linksEntity.setSrc_ip("10.0.0.1" + i);
                                    linksEntity.setSrc_port("p0");
                                    linksEntity.setDst_port(getIndex(subnetEntry.getValue().getIp(), "10.0.0.1" + i));
                                    if (null == nodeEntity.getPort_list()) {
                                        nodeEntity.setPort_list(linksEntity.getDst_port() + ":" + "sdn" + i);
                                    } else {
                                        nodeEntity.setPort_list(nodeEntity.getPort_list() + " \n " + linksEntity.getDst_port() + ":" + "sdn" + i);
                                    }
                                    links.add(linksEntity);
                                }
                            } else {
                                for (ComputerEntity computer : subnetEntry.getValue().getComputerEntities()) {
                                    node = new NodeEntity();
                                    node.setNode_type("host");
                                    node.setNode_ip(computer.getIp());
                                    node.setId(computer.getId());
                                    node.setSecurity_group(computer.getSecurityGroupId());
                                    node.setName(computer.getName());
                                    node.setMac(computer.getMac());
                                    node.setFloating_ip(isfloatingIp(computer.getIp()));
                                    nodes.add(node);
                                    linksEntity = new LinksEntity();
                                    linksEntity.setDst_ip(subnetEntry.getValue().getIp());
                                    linksEntity.setSrc_ip(computer.getIp());
                                    linksEntity.setSrc_port("p0");
                                    linksEntity.setDst_port(getIndex(subnetEntry.getValue().getIp(), computer.getIp()));
                                    if (null == nodeEntity.getPort_list()) {
                                        nodeEntity.setPort_list(linksEntity.getDst_port() + ":" + computer.getName());
                                    } else {
                                        nodeEntity.setPort_list(nodeEntity.getPort_list() + " \n " + linksEntity.getDst_port() + ":" + computer.getName());
                                    }
                                    linksEntity.setQos(computer.getQos());
                                    links.add(linksEntity);
                                }
                            }

                        }
                    }
                }
            }
        }
        return topoResponse;
    }
}
