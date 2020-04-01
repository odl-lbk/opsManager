package cn.org.bnc.opsManager.model;

import java.util.List;

public class Subnets {
    List<Subnet> subnets;

    public List<Subnet> getSubnets() {
        return subnets;
    }

    public void setSubnets(List<Subnet> subnets) {
        this.subnets = subnets;
    }

    @Override
    public String toString() {
        return "Subnets{" +
                "subnets=" + subnets +
                '}';
    }
}
