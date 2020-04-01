package cn.org.bnc.opsManager.model;


import cn.org.bnc.opsManager.model.Network;

import java.util.List;


public class Networks {
    List<Network> networks;

    @Override
    public String toString() {
        return "Networks{" +
                "networks=" + networks +
                '}';
    }

    public List<Network> getNetworks() {
        return networks;
    }

    public void setNetworks(List<Network> networks) {
        this.networks = networks;
    }
}
