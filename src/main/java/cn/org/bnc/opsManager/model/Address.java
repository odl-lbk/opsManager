package cn.org.bnc.opsManager.model;

public class Address {
    private String mac_addr;
    private int version;
    private String addr;
    private String type;

    public String getMac_addr() {
        return mac_addr;
    }

    public void setMac_addr(String mac_addr) {
        this.mac_addr = mac_addr;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Address{" +
                "mac_addr='" + mac_addr + '\'' +
                ", version=" + version +
                ", addr='" + addr + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
