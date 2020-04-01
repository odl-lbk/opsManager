package cn.org.bnc.opsManager.model;

import java.util.Date;
import java.util.List;

public class SecurityGroupRule {

    private String direction;
    private String protocol;
    private String description;
    private List<String> tags;
    private String port_range_max;
    private Date updated_at;
    private int revision_number;
    private String id;
    private String remote_group_id;
    private String remote_ip_prefix;
    private Date created_at;
    private String security_group_id;
    private String tenant_id;
    private String port_range_min;
    private String ethertype;
    private String project_id;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
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

    public String getPort_range_max() {
        return port_range_max;
    }

    public void setPort_range_max(String port_range_max) {
        this.port_range_max = port_range_max;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public int getRevision_number() {
        return revision_number;
    }

    public void setRevision_number(int revision_number) {
        this.revision_number = revision_number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRemote_group_id() {
        return remote_group_id;
    }

    public void setRemote_group_id(String remote_group_id) {
        this.remote_group_id = remote_group_id;
    }

    public String getRemote_ip_prefix() {
        return remote_ip_prefix;
    }

    public void setRemote_ip_prefix(String remote_ip_prefix) {
        this.remote_ip_prefix = remote_ip_prefix;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getSecurity_group_id() {
        return security_group_id;
    }

    public void setSecurity_group_id(String security_group_id) {
        this.security_group_id = security_group_id;
    }

    public String getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(String tenant_id) {
        this.tenant_id = tenant_id;
    }

    public String getPort_range_min() {
        return port_range_min;
    }

    public void setPort_range_min(String port_range_min) {
        this.port_range_min = port_range_min;
    }

    public String getEthertype() {
        return ethertype;
    }

    public void setEthertype(String ethertype) {
        this.ethertype = ethertype;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    @Override
    public String toString() {
        return "SecurityGroupRule{" +
                "direction='" + direction + '\'' +
                ", protocol='" + protocol + '\'' +
                ", description='" + description + '\'' +
                ", tags=" + tags +
                ", port_range_max='" + port_range_max + '\'' +
                ", updated_at=" + updated_at +
                ", revision_number=" + revision_number +
                ", id='" + id + '\'' +
                ", remote_group_id='" + remote_group_id + '\'' +
                ", remote_ip_prefix='" + remote_ip_prefix + '\'' +
                ", created_at=" + created_at +
                ", security_group_id='" + security_group_id + '\'' +
                ", tenant_id='" + tenant_id + '\'' +
                ", port_range_min='" + port_range_min + '\'' +
                ", ethertype='" + ethertype + '\'' +
                ", project_id='" + project_id + '\'' +
                '}';
    }
}
