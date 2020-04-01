package cn.org.bnc.opsManager.entity;

import java.util.List;

public class DeviceRouteEntity {
    private String router_ip;
    private String router_mac;
    private String tenant;
    private List<DeviceSubnetEntity> subnet;

    public String getRouter_ip() {
        return router_ip;
    }

    public void setRouter_ip(String router_ip) {
        this.router_ip = router_ip;
    }

    public String getRouter_mac() {
        return router_mac;
    }

    public void setRouter_mac(String router_mac) {
        this.router_mac = router_mac;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public List<DeviceSubnetEntity> getSubnet() {
        return subnet;
    }

    public void setSubnet(List<DeviceSubnetEntity> subnet) {
        this.subnet = subnet;
    }

    @Override
    public String toString() {
        return "DeviceRouteEntity{" +
                "router_ip='" + router_ip + '\'' +
                ", router_mac='" + router_mac + '\'' +
                ", tenant='" + tenant + '\'' +
                ", subnet=" + subnet +
                '}';
    }
}
