package cn.org.bnc.opsManager.entity;

public class FloatingNodeEntity {
    private String name;
    private String mac;
    private String originalIP;
    private String floatIP;

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getOriginalIP() {
        return originalIP;
    }

    public void setOriginalIP(String originalIP) {
        this.originalIP = originalIP;
    }

    public String getFloatIP() {
        return floatIP;
    }

    public void setFloatIP(String floatIP) {
        this.floatIP = floatIP;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FloatingNodeEntity{" +
                "name='" + name + '\'' +
                ", mac='" + mac + '\'' +
                ", originalIP='" + originalIP + '\'' +
                ", floatIP='" + floatIP + '\'' +
                '}';
    }
}
