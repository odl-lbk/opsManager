package cn.org.bnc.opsManager.entity;

import java.util.List;

public class NatInfoEntity {
    private List<NatNodeEntity> nodes;

    public List<NatNodeEntity> getNodes() {
        return nodes;
    }

    public void setNodes(List<NatNodeEntity> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return "NatInfoEntity{" +
                "nodes=" + nodes +
                '}';
    }
}
