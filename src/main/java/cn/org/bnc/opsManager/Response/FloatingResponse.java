package cn.org.bnc.opsManager.Response;

import cn.org.bnc.opsManager.entity.FloatingInfoEntity;

public class FloatingResponse {
    private FloatingInfoEntity floatInfo;

    public FloatingInfoEntity getFloatInfo() {
        return floatInfo;
    }

    public void setFloatInfo(FloatingInfoEntity floatInfo) {
        this.floatInfo = floatInfo;
    }

    @Override
    public String toString() {
        return "FloatingResponse{" +
                "floatInfo=" + floatInfo +
                '}';
    }
}
