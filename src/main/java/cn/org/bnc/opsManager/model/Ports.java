package cn.org.bnc.opsManager.model;

import java.util.List;

public class Ports {
    List<Port> ports;

    public List<Port> getPorts() {
        return ports;
    }

    public void setPorts(List<Port> ports) {
        this.ports = ports;
    }

    @Override
    public String toString() {
        return "Ports{" +
                "ports=" + ports +
                '}';
    }
}
