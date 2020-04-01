package cn.org.bnc.opsManager.model;


import java.util.Date;
import java.util.List;

public class Subnet {
    private List<String> service_types;
    private String description;
    private boolean enable_dhcp;
    private List<String> tags;
    private String network_id;
    private String tenant_id;
    private Date created_at;
    private List<String> dns_nameservers;
    private Date updated_at;
    private String ipv6_ra_mode;
    private List<AllocationPools> allocation_pools;
    private String gateway_ip;
    private int revision_number;
    private String ipv6_address_mode;
    private int ip_version;
    private List<String> host_routes;
    private String cidr;
    private String project_id;
    private String id;
    private String subnetpool_id;
    private String name;

    public List<String> getService_types() {
        return service_types;
    }

    public void setService_types(List<String> service_types) {
        this.service_types = service_types;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEnable_dhcp() {
        return enable_dhcp;
    }

    public void setEnable_dhcp(boolean enable_dhcp) {
        this.enable_dhcp = enable_dhcp;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
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

    public List<String> getDns_nameservers() {
        return dns_nameservers;
    }

    public void setDns_nameservers(List<String> dns_nameservers) {
        this.dns_nameservers = dns_nameservers;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getIpv6_ra_mode() {
        return ipv6_ra_mode;
    }

    public void setIpv6_ra_mode(String ipv6_ra_mode) {
        this.ipv6_ra_mode = ipv6_ra_mode;
    }

    public List<AllocationPools> getAllocation_pools() {
        return allocation_pools;
    }

    public void setAllocation_pools(List<AllocationPools> allocation_pools) {
        this.allocation_pools = allocation_pools;
    }

    public String getGateway_ip() {
        return gateway_ip;
    }

    public void setGateway_ip(String gateway_ip) {
        this.gateway_ip = gateway_ip;
    }

    public int getRevision_number() {
        return revision_number;
    }

    public void setRevision_number(int revision_number) {
        this.revision_number = revision_number;
    }

    public String getIpv6_address_mode() {
        return ipv6_address_mode;
    }

    public void setIpv6_address_mode(String ipv6_address_mode) {
        this.ipv6_address_mode = ipv6_address_mode;
    }

    public int getIp_version() {
        return ip_version;
    }

    public void setIp_version(int ip_version) {
        this.ip_version = ip_version;
    }

    public List<String> getHost_routes() {
        return host_routes;
    }

    public void setHost_routes(List<String> host_routes) {
        this.host_routes = host_routes;
    }

    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
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

    public String getSubnetpool_id() {
        return subnetpool_id;
    }

    public void setSubnetpool_id(String subnetpool_id) {
        this.subnetpool_id = subnetpool_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subnet{" +
                "service_types=" + service_types +
                ", description='" + description + '\'' +
                ", enable_dhcp=" + enable_dhcp +
                ", tags=" + tags +
                ", network_id='" + network_id + '\'' +
                ", tenant_id='" + tenant_id + '\'' +
                ", created_at=" + created_at +
                ", dns_nameservers=" + dns_nameservers +
                ", updated_at=" + updated_at +
                ", ipv6_ra_mode='" + ipv6_ra_mode + '\'' +
                ", allocation_pools=" + allocation_pools +
                ", gateway_ip='" + gateway_ip + '\'' +
                ", revision_number=" + revision_number +
                ", ipv6_address_mode='" + ipv6_address_mode + '\'' +
                ", ip_version=" + ip_version +
                ", host_routes=" + host_routes +
                ", cidr='" + cidr + '\'' +
                ", project_id='" + project_id + '\'' +
                ", id='" + id + '\'' +
                ", subnetpool_id='" + subnetpool_id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
