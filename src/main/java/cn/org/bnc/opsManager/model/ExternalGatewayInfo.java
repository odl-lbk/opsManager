package cn.org.bnc.opsManager.model;

import java.util.List;

public class ExternalGatewayInfo {
    private String network_id;
    private boolean enable_snat;
    private List<ExternalFixedIp> external_fixed_ips;

    public String getNetwork_id() {
        return network_id;
    }

    public void setNetwork_id(String network_id) {
        this.network_id = network_id;
    }

    public boolean isEnable_snat() {
        return enable_snat;
    }

    public void setEnable_snat(boolean enable_snat) {
        this.enable_snat = enable_snat;
    }

    public List<ExternalFixedIp> getExternal_fixed_ips() {
        return external_fixed_ips;
    }

    public void setExternal_fixed_ips(List<ExternalFixedIp> external_fixed_ips) {
        this.external_fixed_ips = external_fixed_ips;
    }

    @Override
    public String toString() {
        return "ExternalGatewayInfo{" +
                "network_id='" + network_id + '\'' +
                ", enable_snat=" + enable_snat +
                ", external_fixed_ips=" + external_fixed_ips +
                '}';
    }
}
