package cn.org.bnc.opsManager.entity;

import java.util.List;

public class FloatingInfoEntity {
    private List<FloatingNodeEntity> nodes;

    public List<FloatingNodeEntity> getNodes() {
        return nodes;
    }

    public void setNodes(List<FloatingNodeEntity> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return "FloatingInfoEntity{" +
                "nodes=" + nodes +
                '}';
    }
}
