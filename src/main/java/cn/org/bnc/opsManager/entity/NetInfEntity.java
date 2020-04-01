package cn.org.bnc.opsManager.entity;

import java.util.List;

public class NetInfEntity {
    private List<DeviceRouteEntity> route;

    public List<DeviceRouteEntity> getRoute() {
        return route;
    }

    public void setRoute(List<DeviceRouteEntity> route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "NetInfEntity{" +
                "route=" + route +
                '}';
    }
}
