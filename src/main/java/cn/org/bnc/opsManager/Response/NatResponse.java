package cn.org.bnc.opsManager.Response;

import cn.org.bnc.opsManager.entity.NatInfoEntity;

public class NatResponse {
    private NatInfoEntity natInfo;

    public NatInfoEntity getNatInfo() {
        return natInfo;
    }

    public void setNatInfo(NatInfoEntity natInfo) {
        this.natInfo = natInfo;
    }

    @Override
    public String toString() {
        return "NatResponse{" +
                "natInfo=" + natInfo +
                '}';
    }
}
