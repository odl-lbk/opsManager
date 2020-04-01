package cn.org.bnc.opsManager.model;

import java.util.Date;
import java.util.List;

public class Port {
    private List<String> allowed_address_pairs;
    private List<String> extra_dhcp_opts;
    private Date updated_at;
    private String device_owner;
    private int revision_number;
    private boolean port_security_enabled;
    private List<FixedIps> fixed_ips;
    private String id;
    private List<String> security_groups;
    private String vif_type;
    private String mac_address;
    private String project_id;
    private String status;
    private String host_id;
    private String description;
    private List<String> tags;
    private String qos_policy_id;
    private String name;
    private boolean admin_state_up;
    private String network_id;
    private String tenant_id;
    private Date created_at;
    private String vnic_type;
    private String device_id;

    public List<String> getAllowed_address_pairs() {
        return allowed_address_pairs;
    }

    public void setAllowed_address_pairs(List<String> allowed_address_pairs) {
        this.allowed_address_pairs = allowed_address_pairs;
    }

    public List<String> getExtra_dhcp_opts() {
        return extra_dhcp_opts;
    }

    public void setExtra_dhcp_opts(List<String> extra_dhcp_opts) {
        this.extra_dhcp_opts = extra_dhcp_opts;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getDevice_owner() {
        return device_owner;
    }

    public void setDevice_owner(String device_owner) {
        this.device_owner = device_owner;
    }

    public int getRevision_number() {
        return revision_number;
    }

    public void setRevision_number(int revision_number) {
        this.revision_number = revision_number;
    }

    public boolean isPort_security_enabled() {
        return port_security_enabled;
    }

    public void setPort_security_enabled(boolean port_security_enabled) {
        this.port_security_enabled = port_security_enabled;
    }

    public List<FixedIps> getFixed_ips() {
        return fixed_ips;
    }

    public void setFixed_ips(List<FixedIps> fixed_ips) {
        this.fixed_ips = fixed_ips;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getSecurity_groups() {
        return security_groups;
    }

    public void setSecurity_groups(List<String> security_groups) {
        this.security_groups = security_groups;
    }

    public String getVif_type() {
        return vif_type;
    }

    public void setVif_type(String vif_type) {
        this.vif_type = vif_type;
    }

    public String getMac_address() {
        return mac_address;
    }

    public void setMac_address(String mac_address) {
        this.mac_address = mac_address;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHost_id() {
        return host_id;
    }

    public void setHost_id(String host_id) {
        this.host_id = host_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getQos_policy_id() {
        return qos_policy_id;
    }

    public void setQos_policy_id(String qos_policy_id) {
        this.qos_policy_id = qos_policy_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdmin_state_up() {
        return admin_state_up;
    }

    public void setAdmin_state_up(boolean admin_state_up) {
        this.admin_state_up = admin_state_up;
    }

    public String getNetwork_id() {
        return network_id;
    }

    public void setNetwork_id(String network_id) {
        this.network_id = network_id;
    }

    public String getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(String tenant_id) {
        this.tenant_id = tenant_id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getVnic_type() {
        return vnic_type;
    }

    public void setVnic_type(String vnic_type) {
        this.vnic_type = vnic_type;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    @Override
    public String toString() {
        return "Port{" +
                "allowed_address_pairs=" + allowed_address_pairs +
                ", extra_dhcp_opts=" + extra_dhcp_opts +
                ", updated_at=" + updated_at +
                ", device_owner='" + device_owner + '\'' +
                ", revision_number=" + revision_number +
                ", port_security_enabled=" + port_security_enabled +
                ", fixed_ips=" + fixed_ips +
                ", id='" + id + '\'' +
                ", security_groups=" + security_groups +
                ", vif_type='" + vif_type + '\'' +
                ", mac_address='" + mac_address + '\'' +
                ", project_id='" + project_id + '\'' +
                ", status='" + status + '\'' +
                ", host_id='" + host_id + '\'' +
                ", description='" + description + '\'' +
                ", tags=" + tags +
                ", qos_policy_id='" + qos_policy_id + '\'' +
                ", name='" + name + '\'' +
                ", admin_state_up=" + admin_state_up +
                ", network_id='" + network_id + '\'' +
                ", tenant_id='" + tenant_id + '\'' +
                ", created_at=" + created_at +
                ", vnic_type='" + vnic_type + '\'' +
                ", device_id='" + device_id + '\'' +
                '}';
    }
}
