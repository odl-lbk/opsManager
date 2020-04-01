package cn.org.bnc.opsManager.entity;

import java.util.List;

public class GroupEntity {
    private String id;
    private List<RuleListEntity> rulelist;
    private List<UserListEntity> userlist;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<RuleListEntity> getRulelist() {
        return rulelist;
    }

    public void setRulelist(List<RuleListEntity> rulelist) {
        this.rulelist = rulelist;
    }

    public List<UserListEntity> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<UserListEntity> userlist) {
        this.userlist = userlist;
    }

    @Override
    public String toString() {
        return "GroupEntity{" +
                "id='" + id + '\'' +
                ", rulelist=" + rulelist +
                ", userlist=" + userlist +
                '}';
    }
}
