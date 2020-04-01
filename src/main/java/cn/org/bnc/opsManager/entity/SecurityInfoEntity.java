package cn.org.bnc.opsManager.entity;

import java.util.List;

public class SecurityInfoEntity {
    private List<GroupEntity> groups;

    public List<GroupEntity> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupEntity> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "SecurityInfoEntity{" +
                "groups=" + groups +
                '}';
    }
}
