package cn.org.bnc.opsManager.entity;

public class NatNodeEntity {
    private String name;
    private String ip;
    private String mac;
    private boolean nat;
    private String network_id;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNetwork_id() {
        return network_id;
    }

    public void setNetwork_id(String network_id) {
        this.network_id = network_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public boolean isNat() {
        return nat;
    }

    public void setNat(boolean nat) {
        this.nat = nat;
    }

    @Override
    public String toString() {
        return "NatNodeEntity{" +
                "name='" + name + '\'' +
                ", ip='" + ip + '\'' +
                ", mac='" + mac + '\'' +
                ", nat=" + nat +
                ", network_id='" + network_id + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
