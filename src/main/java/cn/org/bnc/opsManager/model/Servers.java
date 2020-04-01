package cn.org.bnc.opsManager.model;

import java.util.Date;
import java.util.List;

public class Servers {
    private Addresses addresses;
    private String vm_state;
    private String instance_name;
    private String id;
    private List<SecurityGroupsComputer> security_groups;
    private String user_id;
    private String accessIPv4;
    private String accessIPv6;
    private int progress;
    private String config_drive;
    private String status;
    private Date updated;
    private String hostId;
    private String key_name;
    private String name;
    private Date created;
    private String tenant_id;

    public Addresses getAddresses() {
        return addresses;
    }

    public void setAddresses(Addresses addresses) {
        this.addresses = addresses;
    }

    public String getVm_state() {
        return vm_state;
    }

    public void setVm_state(String vm_state) {
        this.vm_state = vm_state;
    }

    public String getInstance_name() {
        return instance_name;
    }

    public void setInstance_name(String instance_name) {
        this.instance_name = instance_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<SecurityGroupsComputer> getSecurity_groups() {
        return security_groups;
    }

    public void setSecurity_groups(List<SecurityGroupsComputer> security_groups) {
        this.security_groups = security_groups;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getAccessIPv4() {
        return accessIPv4;
    }

    public void setAccessIPv4(String accessIPv4) {
        this.accessIPv4 = accessIPv4;
    }

    public String getAccessIPv6() {
        return accessIPv6;
    }

    public void setAccessIPv6(String accessIPv6) {
        this.accessIPv6 = accessIPv6;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getConfig_drive() {
        return config_drive;
    }

    public void setConfig_drive(String config_drive) {
        this.config_drive = config_drive;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public String getKey_name() {
        return key_name;
    }

    public void setKey_name(String key_name) {
        this.key_name = key_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(String tenant_id) {
        this.tenant_id = tenant_id;
    }

    @Override
    public String toString() {
        return "Servers{" +
                "addresses=" + addresses +
                ", vm_state='" + vm_state + '\'' +
                ", instance_name='" + instance_name + '\'' +
                ", id='" + id + '\'' +
                ", security_groups=" + security_groups +
                ", user_id='" + user_id + '\'' +
                ", accessIPv4='" + accessIPv4 + '\'' +
                ", accessIPv6='" + accessIPv6 + '\'' +
                ", progress=" + progress +
                ", config_drive='" + config_drive + '\'' +
                ", status='" + status + '\'' +
                ", updated=" + updated +
                ", hostId='" + hostId + '\'' +
                ", key_name='" + key_name + '\'' +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", tenant_id='" + tenant_id + '\'' +
                '}';
    }
}
