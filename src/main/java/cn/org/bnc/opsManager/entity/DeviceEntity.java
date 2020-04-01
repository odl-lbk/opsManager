package cn.org.bnc.opsManager.entity;

public class DeviceEntity {
    private String device_type;
    private String device_id;
    private String ip;
    private String mac;

    public String getDevice_type() {
        return device_type;
    }

    public void setDevice_type(String device_type) {
        this.device_type = device_type;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "DeviceEntity{" +
                "device_type='" + device_type + '\'' +
                ", device_id='" + device_id + '\'' +
                ", ip='" + ip + '\'' +
                ", mac='" + mac + '\'' +
                '}';
    }
}
