package cn.org.bnc.opsManager.entity;

import java.util.ArrayList;
import java.util.List;

public class SubNetworkEntity {
    private String id;
    private String name;
    private String max;
    private String min;
    private String ip_version;
    private String ip;
    private String mac;
    private String qos;

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

    private List<ComputerEntity> computerEntities = new ArrayList<>();

    public String getIp_version() {
        return ip_version;
    }

    public void setIp_version(String ip_version) {
        this.ip_version = ip_version;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getId() {
        return id;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
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

    public List<ComputerEntity> getComputerEntities() {
        return computerEntities;
    }

    public void setComputerEntities(List<ComputerEntity> computerEntities) {
        this.computerEntities = computerEntities;
    }

    @Override
    public String toString() {
        return "SubNetworkEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", max='" + max + '\'' +
                ", min='" + min + '\'' +
                ", ip_version='" + ip_version + '\'' +
                ", ip='" + ip + '\'' +
                ", mac='" + mac + '\'' +
                ", qos='" + qos + '\'' +
                ", computerEntities=" + computerEntities +
                '}';
    }
}
