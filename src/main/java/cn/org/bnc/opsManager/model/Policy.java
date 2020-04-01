package cn.org.bnc.opsManager.model;

import java.util.Date;
import java.util.List;

public class Policy {
    private String name;
    private List<String> tags;
    private List<Rule> rules;
    private String tenant_id;
    private Date created_at;
    private Date updated_at;
    private boolean is_default;
    private int revision_number;
    private boolean shared;
    private String project_id;
    private String id;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
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

    public boolean isIs_default() {
        return is_default;
    }

    public void setIs_default(boolean is_default) {
        this.is_default = is_default;
    }

    public int getRevision_number() {
        return revision_number;
    }

    public void setRevision_number(int revision_number) {
        this.revision_number = revision_number;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "name='" + name + '\'' +
                ", tags=" + tags +
                ", rules=" + rules +
                ", tenant_id='" + tenant_id + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", is_default=" + is_default +
                ", revision_number=" + revision_number +
                ", shared=" + shared +
                ", project_id='" + project_id + '\'' +
                ", id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
