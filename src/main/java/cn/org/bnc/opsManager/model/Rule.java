package cn.org.bnc.opsManager.model;

public class Rule {
    private long max_kbps;
    private String direction;
    private String qos_policy_id;
    private String type;
    private String id;
    private long max_burst_kbps;

    public long getMax_kbps() {
        return max_kbps;
    }

    public void setMax_kbps(long max_kbps) {
        this.max_kbps = max_kbps;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getQos_policy_id() {
        return qos_policy_id;
    }

    public void setQos_policy_id(String qos_policy_id) {
        this.qos_policy_id = qos_policy_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getMax_burst_kbps() {
        return max_burst_kbps;
    }

    public void setMax_burst_kbps(long max_burst_kbps) {
        this.max_burst_kbps = max_burst_kbps;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "max_kbps=" + max_kbps +
                ", direction='" + direction + '\'' +
                ", qos_policy_id='" + qos_policy_id + '\'' +
                ", type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", max_burst_kbps=" + max_burst_kbps +
                '}';
    }
}
