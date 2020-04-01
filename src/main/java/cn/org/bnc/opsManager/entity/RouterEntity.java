package cn.org.bnc.opsManager.entity;

import java.util.HashMap;
import java.util.Map;

public class RouterEntity {
    private String name;
    private String id;
    private String ip;
    private String mac;
    private String qos;
    private boolean nat;
    private Map<String, NetworkEntity> networkEntityMap = new HashMap<>();

    @Override
    public String toString() {
        return "RouterEntity{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", ip='" + ip + '\'' +
                ", mac='" + mac + '\'' +
                ", qos='" + qos + '\'' +
                ", nat=" + nat +
                ", networkEntityMap=" + networkEntityMap +
                '}';
    }

    public String getQos() {
        return qos;
    }

    public void setQos(String qos) {
        this.qos = qos;
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

    public Map<String, NetworkEntity> getNetworkEntityMap() {
        return networkEntityMap;
    }

    public void setNetworkEntityMap(Map<String, NetworkEntity> networkEntityMap) {
        this.networkEntityMap = networkEntityMap;
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

}
