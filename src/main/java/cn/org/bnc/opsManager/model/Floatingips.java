package cn.org.bnc.opsManager.model;

import java.util.List;

public class Floatingips {
    List<Floatingip> floatingips;

    public List<Floatingip> getFloatingips() {
        return floatingips;
    }

    public void setFloatingips(List<Floatingip> floatingips) {
        this.floatingips = floatingips;
    }

    @Override
    public String toString() {
        return "Floatingips{" +
                "floatingips=" + floatingips +
                '}';
    }
}
