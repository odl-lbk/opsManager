package cn.org.bnc.opsManager.entity;

public class ComputerEntity {
    private String mac;
    private String ip;
    private String name;
    private String id;
    private String qos;
    private String securityGroupId;

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getQos() {
        return qos;
    }

    public void setQos(String qos) {
        this.qos = qos;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ComputerEntity{" +
                "mac='" + mac + '\'' +
                ", ip='" + ip + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", qos='" + qos + '\'' +
                ", securityGroupId='" + securityGroupId + '\'' +
                '}';
    }
}
