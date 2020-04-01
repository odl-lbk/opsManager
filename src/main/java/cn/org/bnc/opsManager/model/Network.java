package cn.org.bnc.opsManager.model;

import java.util.Date;
import java.util.List;

public class Network {
    private String physical_network;
    private String ipv6_address_scope;
    private int revision_number;
    private boolean port_security_enabled;
    private int mtu;
    private String id;
    private boolean external;
    private List<String> availability_zone_hints;
    private List<String> availability_zones;
    private String ipv4_address_scope;
    private boolean shared;
    private String project_id;
    private String status;
    private List<String> subnets;
    private String description;
    private List<String> tags;
    private Date updated_at;
    private boolean is_default;
    private String segmentation_id;
    private String name;
    private boolean admin_state_up;
    private String tenant_id;
    private Date created_at;
    private String network_type;

    @Override
    public String toString() {
        return "Network{" +
                "physical_network='" + physical_network + '\'' +
                ", ipv6_address_scope='" + ipv6_address_scope + '\'' +
                ", revision_number=" + revision_number +
                ", port_security_enabled=" + port_security_enabled +
                ", mtu=" + mtu +
                ", id='" + id + '\'' +
                ", external=" + external +
                ", availability_zone_hints=" + availability_zone_hints +
                ", availability_zones=" + availability_zones +
                ", ipv4_address_scope='" + ipv4_address_scope + '\'' +
                ", shared=" + shared +
                ", project_id='" + project_id + '\'' +
                ", status='" + status + '\'' +
                ", subnets=" + subnets +
                ", description='" + description + '\'' +
                ", tags=" + tags +
                ", updated_at=" + updated_at +
                ", is_default=" + is_default +
                ", segmentation_id='" + segmentation_id + '\'' +
                ", name='" + name + '\'' +
                ", admin_state_up=" + admin_state_up +
                ", tenant_id='" + tenant_id + '\'' +
                ", created_at=" + created_at +
                ", network_type='" + network_type + '\'' +
                '}';
    }

    public String getPhysical_network() {
        return physical_network;
    }

    public void setPhysical_network(String physical_network) {
        this.physical_network = physical_network;
    }

    public String getIpv6_address_scope() {
        return ipv6_address_scope;
    }

    public void setIpv6_address_scope(String ipv6_address_scope) {
        this.ipv6_address_scope = ipv6_address_scope;
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

    public int getMtu() {
        return mtu;
    }

    public void setMtu(int mtu) {
        this.mtu = mtu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isExternal() {
        return external;
    }

    public void setExternal(boolean external) {
        this.external = external;
    }

    public List<String> getAvailability_zone_hints() {
        return availability_zone_hints;
    }

    public void setAvailability_zone_hints(List<String> availability_zone_hints) {
        this.availability_zone_hints = availability_zone_hints;
    }

    public List<String> getAvailability_zones() {
        return availability_zones;
    }

    public void setAvailability_zones(List<String> availability_zones) {
        this.availability_zones = availability_zones;
    }

    public String getIpv4_address_scope() {
        return ipv4_address_scope;
    }

    public void setIpv4_address_scope(String ipv4_address_scope) {
        this.ipv4_address_scope = ipv4_address_scope;
    }

    public boolean isShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
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

    public List<String> getSubnets() {
        return subnets;
    }

    public void setSubnets(List<String> subnets) {
        this.subnets = subnets;
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

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public boolean isIs_default() {
        return is_default;
    }

    public void setIs_default(boolean is_default) {
        this.is_default = is_default;
    }

    public String getSegmentation_id() {
        return segmentation_id;
    }

    public void setSegmentation_id(String segmentation_id) {
        this.segmentation_id = segmentation_id;
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

    public String getNetwork_type() {
        return network_type;
    }

    public void setNetwork_type(String network_type) {
        this.network_type = network_type;
    }
}
