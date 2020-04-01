package cn.org.bnc.opsManager.model;

import java.util.List;

public class SecurityGroups {
    private List<SecurityGroup> security_groups;

    public List<SecurityGroup> getSecurity_groups() {
        return security_groups;
    }

    public void setSecurity_groups(List<SecurityGroup> security_groups) {
        this.security_groups = security_groups;
    }

    @Override
    public String toString() {
        return "SecurityGroups{" +
                "security_groups=" + security_groups +
                '}';
    }
}
