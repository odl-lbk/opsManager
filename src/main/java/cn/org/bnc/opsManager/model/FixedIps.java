package cn.org.bnc.opsManager.model;

public class FixedIps {
    private String subnet_id;
    private String ip_address;

    public String getSubnet_id() {
        return subnet_id;
    }

    public void setSubnet_id(String subnet_id) {
        this.subnet_id = subnet_id;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    @Override
    public String toString() {
        return "FixedIps{" +
                "subnet_id='" + subnet_id + '\'' +
                ", ip_address='" + ip_address + '\'' +
                '}';
    }
}
