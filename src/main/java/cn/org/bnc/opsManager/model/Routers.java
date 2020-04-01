package cn.org.bnc.opsManager.model;


import java.util.List;

public class Routers {
    List<Router> routers;

    public List<Router> getRouters() {
        return routers;
    }

    public void setRouters(List<Router> routers) {
        this.routers = routers;
    }

    @Override
    public String toString() {
        return "Routers{" +
                "routers=" + routers +
                '}';
    }
}
