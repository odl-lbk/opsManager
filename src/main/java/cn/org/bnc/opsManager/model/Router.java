package cn.org.bnc.opsManager.model;

import java.util.Date;
import java.util.List;

public class Router {
    private String status;
    private ExternalGatewayInfo external_gateway_info;
    private List<String> availability_zone_hints;
    private List<String> availability_zones;
    private String description;
    private List<String> tags;
    private String tenant_id;
    private Date created_at;
    private boolean admin_state_up;
    private boolean distributed;
    private Date updated_at;
    private String project_id;
    private String flavor_id;
    private int revision_number;
    private List<String> routes;
    private boolean ha;
    private String id;
    private String name;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ExternalGatewayInfo getExternal_gateway_info() {
        return external_gateway_info;
    }

    public void setExternal_gateway_info(ExternalGatewayInfo external_gateway_info) {
        this.external_gateway_info = external_gateway_info;
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

    public boolean isAdmin_state_up() {
        return admin_state_up;
    }

    public void setAdmin_state_up(boolean admin_state_up) {
        this.admin_state_up = admin_state_up;
    }

    public boolean isDistributed() {
        return distributed;
    }

    public void setDistributed(boolean distributed) {
        this.distributed = distributed;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getFlavor_id() {
        return flavor_id;
    }

    public void setFlavor_id(String flavor_id) {
        this.flavor_id = flavor_id;
    }

    public int getRevision_number() {
        return revision_number;
    }

    public void setRevision_number(int revision_number) {
        this.revision_number = revision_number;
    }

    public List<String> getRoutes() {
        return routes;
    }

    public void setRoutes(List<String> routes) {
        this.routes = routes;
    }

    public boolean isHa() {
        return ha;
    }

    public void setHa(boolean ha) {
        this.ha = ha;
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
        return "Router{" +
                "status='" + status + '\'' +
                ", external_gateway_info=" + external_gateway_info +
                ", availability_zone_hints=" + availability_zone_hints +
                ", availability_zones=" + availability_zones +
                ", description='" + description + '\'' +
                ", tags=" + tags +
                ", tenant_id='" + tenant_id + '\'' +
                ", created_at=" + created_at +
                ", admin_state_up=" + admin_state_up +
                ", distributed=" + distributed +
                ", updated_at=" + updated_at +
                ", project_id='" + project_id + '\'' +
                ", flavor_id='" + flavor_id + '\'' +
                ", revision_number=" + revision_number +
                ", routes=" + routes +
                ", ha=" + ha +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
