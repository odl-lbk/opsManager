package cn.org.bnc.opsManager.entity;

public class LinksEntity {
    private String src_ip;
    private String src_port;
    private String dst_port;
    private String dst_ip;
    private String qos;

    public String getSrc_ip() {
        return src_ip;
    }

    public void setSrc_ip(String src_ip) {
        this.src_ip = src_ip;
    }

    public String getDst_port() {
        return dst_port;
    }

    public void setDst_port(String dst_port) {
        this.dst_port = dst_port;
    }

    public String getQos() {
        return qos;
    }

    public void setQos(String qos) {
        this.qos = qos;
    }

    public String getSrc_port() {

        return src_port;
    }

    public void setSrc_port(String src_port) {
        this.src_port = src_port;
    }

    public String getDst_ip() {
        return dst_ip;
    }

    public void setDst_ip(String dst_ip) {
        this.dst_ip = dst_ip;
    }

    @Override
    public String toString() {
        return "LinksEntity{" +
                "src_ip='" + src_ip + '\'' +
                ", src_port='" + src_port + '\'' +
                ", dst_port='" + dst_port + '\'' +
                ", dst_ip='" + dst_ip + '\'' +
                ", qos='" + qos + '\'' +
                '}';
    }
}
