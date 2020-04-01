package cn.org.bnc.opsManager.entity;


import java.util.List;

public class DeviceSubnetEntity {
    private String subnet_name;
    private List<DeviceEntity> device;

    public String getSubnet_name() {
        return subnet_name;
    }

    public void setSubnet_name(String subnet_name) {
        this.subnet_name = subnet_name;
    }

    public List<DeviceEntity> getDevice() {
        return device;
    }

    public void setDevice(List<DeviceEntity> device) {
        this.device = device;
    }

    @Override
    public String toString() {
        return "DeviceSubnetEntity{" +
                "subnet_name='" + subnet_name + '\'' +
                ", device=" + device +
                '}';
    }
}
