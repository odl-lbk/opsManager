package cn.org.bnc.opsManager.entity;

public class RuleListEntity {
    private int index;
    private String rule;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    @Override
    public String toString() {
        return "RuleListEntity{" +
                "index=" + index +
                ", rule='" + rule + '\'' +
                '}';
    }
}
