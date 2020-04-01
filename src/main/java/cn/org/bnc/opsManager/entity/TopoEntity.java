package cn.org.bnc.opsManager.entity;

import java.util.List;

public class TopoEntity {
    private List<NodeEntity> nodes;
    private List<LinksEntity> links;

    public List<LinksEntity> getLinks() {
        return links;
    }

    public void setLinks(List<LinksEntity> links) {
        this.links = links;
    }

    public List<NodeEntity> getNodes() {
        return nodes;
    }

    public void setNodes(List<NodeEntity> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return "TopoEntity{" +
                "nodes=" + nodes +
                ", links=" + links +
                '}';
    }
}
