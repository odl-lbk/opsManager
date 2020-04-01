package cn.org.bnc.opsManager.Response;

import cn.org.bnc.opsManager.entity.NetInfEntity;

public class ElementResponse {
    private NetInfEntity netInfo;

    public NetInfEntity getNetInfo() {
        return netInfo;
    }

    public void setNetInfo(NetInfEntity netInfo) {
        this.netInfo = netInfo;
    }

    @Override
    public String toString() {
        return "ElementResponse{" +
                "netInfo=" + netInfo +
                '}';
    }
}
