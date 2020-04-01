package cn.org.bnc.opsManager.Response;

import cn.org.bnc.opsManager.entity.TopoEntity;

public class TopoResponse {
    private TopoEntity topo;

    public TopoEntity getTopo() {
        return topo;
    }

    public void setTopo(TopoEntity topo) {
        this.topo = topo;
    }

    @Override
    public String toString() {
        return "TopoResponse{" +
                "topo=" + topo +
                '}';
    }
}
