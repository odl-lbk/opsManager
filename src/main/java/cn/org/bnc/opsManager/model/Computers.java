package cn.org.bnc.opsManager.model;

import java.util.List;

public class Computers {
    List<Servers> servers;

    public List<Servers> getServers() {
        return servers;
    }

    public void setServers(List<Servers> servers) {
        this.servers = servers;
    }

    @Override
    public String toString() {
        return "Computers{" +
                "servers=" + servers +
                '}';
    }
}
