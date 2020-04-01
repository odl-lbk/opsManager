package cn.org.bnc.opsManager.model;

import java.util.List;

public class QosPolicies {
    List<Policy> policies;

    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    @Override
    public String toString() {
        return "QosPolicies{" +
                "policies=" + policies +
                '}';
    }
}
