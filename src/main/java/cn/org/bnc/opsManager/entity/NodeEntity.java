package cn.org.bnc.opsManager.entity;

public class NodeEntity {
    private String node_ip;
    private String node_type;
    private String id;
    private String name;
    private String mac;
    private String security_group;
    private boolean floating_ip;
    private boolean nat;
    private String port_list;

    public String getPort_list() {
        return port_list;
    }

    public void setPort_list(String port_list) {
        this.port_list = port_list;
    }

    public String getNode_type() {
        return node_type;
    }

    public void setNode_type(String node_type) {
        this.node_type = node_type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getSecurity_group() {
        return security_group;
    }

    public void setSecurity_group(String security_group) {
        this.security_group = security_group;
    }

    public boolean isFloating_ip() {
        return floating_ip;
    }

    public void setFloating_ip(boolean floating_ip) {
        this.floating_ip = floating_ip;
    }

    public boolean isNat() {
        return nat;
    }

    public void setNat(boolean nat) {
        this.nat = nat;
    }

    public String getNode_ip() {
        return node_ip;
    }

    public void setNode_ip(String node_ip) {
        this.node_ip = node_ip;
    }

    @Override
    public String toString() {
        return "NodeEntity{" +
                "node_ip='" + node_ip + '\'' +
                ", node_type='" + node_type + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", mac='" + mac + '\'' +
                ", security_group='" + security_group + '\'' +
                ", floating_ip=" + floating_ip +
                ", nat=" + nat +
                ", port_list='" + port_list + '\'' +
                '}';
    }
}
