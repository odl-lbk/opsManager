package cn.org.bnc.opsManager.entity;

import java.util.List;

public class QosInfoEntity {
    private List<QosListEntity> qosList;

    public List<QosListEntity> getQosList() {
        return qosList;
    }

    public void setQosList(List<QosListEntity> qosList) {
        this.qosList = qosList;
    }

    @Override
    public String toString() {
        return "QosInfoEntity{" +
                "qosList=" + qosList +
                '}';
    }
}
