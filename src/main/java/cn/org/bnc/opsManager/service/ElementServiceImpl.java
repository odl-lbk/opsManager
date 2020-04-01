package cn.org.bnc.opsManager.service;

import cn.org.bnc.opsManager.Response.ElementResponse;
import cn.org.bnc.opsManager.controller.Controller;
import cn.org.bnc.opsManager.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ElementServiceImpl {
    static ElementServiceImpl elementService = new ElementServiceImpl();

    public static ElementServiceImpl getElementServiceImpl() {
        if (null == elementService) {
            elementService = new ElementServiceImpl();
        }
        return elementService;
    }

    public ElementResponse getElementResponse() {
        ElementResponse elementResponse = new ElementResponse();
        TopologyEntity topologyEntity = TopoServiceImpl.getTopoServiceImpl().getTopologyEntity();
        NetInfEntity netInfEntity = new NetInfEntity();
        elementResponse.setNetInfo(netInfEntity);
        List<DeviceRouteEntity> route = new ArrayList<>();
        DeviceSubnetEntity deviceSubnetEntity;
        List<DeviceEntity> device;
        DeviceEntity deviceEntity;
        for (Map.Entry<String, RouterEntity> entry : topologyEntity.getRouterEntityMap().entrySet()) {
            DeviceRouteEntity deviceRouteEntity = new DeviceRouteEntity();
            route.add(deviceRouteEntity);
            netInfEntity.setRoute(route);
            deviceRouteEntity.setRouter_ip(entry.getValue().getIp());
            deviceRouteEntity.setRouter_mac(entry.getValue().getMac());
            deviceRouteEntity.setTenant(Controller.tenantId);
            List<DeviceSubnetEntity> subnet = new ArrayList<>();
            deviceRouteEntity.setSubnet(subnet);
            for (Map.Entry<String, NetworkEntity> networkEntry : entry.getValue().getNetworkEntityMap().entrySet()) {
                if ("vxlan".equals(networkEntry.getValue().getType())) {
                    for (Map.Entry<String, SubNetworkEntity> subnetEntry : networkEntry.getValue().getSubNetworkEntityMap().entrySet()) {
                        if ("4".equals(subnetEntry.getValue().getIp_version())) {
                            deviceSubnetEntity = new DeviceSubnetEntity();
                            deviceSubnetEntity.setSubnet_name(subnetEntry.getValue().getName());
                            device = new ArrayList<>();
                            deviceEntity = new DeviceEntity();
                            deviceEntity.setDevice_id(subnetEntry.getValue().getId());
                            deviceEntity.setDevice_type("交换机");
                            deviceEntity.setIp(subnetEntry.getValue().getIp());
                            deviceEntity.setMac(subnetEntry.getValue().getMac());
                            device.add(deviceEntity);
                            if (subnetEntry.getValue().getName().contains("sdn") || subnetEntry.getValue().getName().
                                    contains("SDN") || subnetEntry.getValue().getName().contains("Sdn")) {
                                for (int i = 1; i < 5; i++) {
                                    deviceEntity = new DeviceEntity();
                                    deviceEntity.setDevice_id("cdd40890-d06a-4283-8556-579a6a581ce" + i);
                                    deviceEntity.setDevice_type("主机");
                                    deviceEntity.setIp("10.0.0.1" + i);
                                    deviceEntity.setMac("fa:16:3e:2e:b6:1" + i);
                                    device.add(deviceEntity);
                                }
                            } else {
                                for (ComputerEntity computer : subnetEntry.getValue().getComputerEntities()) {
                                    deviceEntity = new DeviceEntity();
                                    deviceEntity.setDevice_id(computer.getId());
                                    deviceEntity.setDevice_type("主机");
                                    deviceEntity.setIp(computer.getIp());
                                    deviceEntity.setMac(computer.getMac());
                                    device.add(deviceEntity);
                                }
                            }
                            deviceSubnetEntity.setDevice(device);
                            subnet.add(deviceSubnetEntity);
                        }
                    }
                }
            }
        }
        return elementResponse;
    }
}
