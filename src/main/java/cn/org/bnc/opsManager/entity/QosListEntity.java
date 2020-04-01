package cn.org.bnc.opsManager.entity;

import java.util.List;

public class QosListEntity {
    private String name;
    private String type;
    private List<DownRuleEntity> downrule;
    private List<UpRuleEntity> uprule;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<DownRuleEntity> getDownrule() {
        return downrule;
    }

    public void setDownrule(List<DownRuleEntity> downrule) {
        this.downrule = downrule;
    }

    public List<UpRuleEntity> getUprule() {
        return uprule;
    }

    public void setUprule(List<UpRuleEntity> uprule) {
        this.uprule = uprule;
    }

    @Override
    public String toString() {
        return "QosListEntity{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", downrule=" + downrule +
                ", uprule=" + uprule +
                '}';
    }
}
