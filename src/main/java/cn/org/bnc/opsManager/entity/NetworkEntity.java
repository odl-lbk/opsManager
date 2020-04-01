package cn.org.bnc.opsManager.entity;

import java.util.HashMap;
import java.util.Map;

public class NetworkEntity {
    private String name;
    private String id;
    private String type;
    private Map<String,SubNetworkEntity> SubNetworkEntityMap =new HashMap<>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Map<String, SubNetworkEntity> getSubNetworkEntityMap() {
        return SubNetworkEntityMap;
    }

    public void setSubNetworkEntityMap(Map<String, SubNetworkEntity> subNetworkEntityMap) {
        this.SubNetworkEntityMap = subNetworkEntityMap;
    }

    @Override
    public String toString() {
        return "NetworkEntity{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", SubNetworkEntityMap=" + SubNetworkEntityMap +
                '}';
    }
}
