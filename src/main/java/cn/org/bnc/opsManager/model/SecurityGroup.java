package cn.org.bnc.opsManager.model;

import java.util.Date;
import java.util.List;

public class SecurityGroup {
    private String description;
    private List<String> tags;
    private String tenant_id;
    private Date created_at;
    private Date updated_at;
    private List<SecurityGroupRule> security_group_rules;
    private int revision_number;
    private String project_id;
    private String id;
    private String name;

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

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public List<SecurityGroupRule> getSecurity_group_rules() {
        return security_group_rules;
    }

    public void setSecurity_group_rules(List<SecurityGroupRule> security_group_rules) {
        this.security_group_rules = security_group_rules;
    }

    public int getRevision_number() {
        return revision_number;
    }

    public void setRevision_number(int revision_number) {
        this.revision_number = revision_number;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SecurityGroup{" +
                "description='" + description + '\'' +
                ", tags=" + tags +
                ", tenant_id='" + tenant_id + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", security_group_rules=" + security_group_rules +
                ", revision_number=" + revision_number +
                ", project_id='" + project_id + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
