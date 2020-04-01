package cn.org.bnc.opsManager.entity;

import java.util.HashMap;
import java.util.Map;

public class TopologyEntity {
    Map<String, RouterEntity> routerEntityMap = new HashMap<>();
    Map<String, NetworkEntity> networkEntityMap = new HashMap<>();

    public Map<String, RouterEntity> getRouterEntityMap() {
        return routerEntityMap;
    }

    public void setRouterEntityMap(Map<String, RouterEntity> routerEntityMap) {
        this.routerEntityMap = routerEntityMap;
    }

    public Map<String, NetworkEntity> getNetworkEntityMap() {
        return networkEntityMap;
    }

    public void setNetworkEntityMap(Map<String, NetworkEntity> networkEntityMap) {
        this.networkEntityMap = networkEntityMap;
    }

    @Override
    public String toString() {
        return "TopologyEntity{" +
                "routerEntityMap=" + routerEntityMap +
                ", networkEntityMap=" + networkEntityMap +
                '}';
    }
}

