package cn.org.bnc.opsManager.Response;

import cn.org.bnc.opsManager.entity.SecurityInfoEntity;

public class SecurityGroupResponse {
    private SecurityInfoEntity securityInfo;

    public SecurityInfoEntity getSecurityInfo() {
        return securityInfo;
    }

    public void setSecurityInfo(SecurityInfoEntity securityInfo) {
        this.securityInfo = securityInfo;
    }

    @Override
    public String toString() {
        return "SecurityGroupResponse{" +
                "securityInfo=" + securityInfo +
                '}';
    }
}
