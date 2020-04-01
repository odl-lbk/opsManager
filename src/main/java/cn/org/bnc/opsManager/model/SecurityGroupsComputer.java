package cn.org.bnc.opsManager.model;

public class SecurityGroupsComputer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SecurityGroupsComputer{" +
                "name='" + name + '\'' +
                '}';
    }
}
