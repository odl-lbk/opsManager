package cn.org.bnc.opsManager.Response;

import cn.org.bnc.opsManager.entity.QosInfoEntity;

public class QosResponse {
    private QosInfoEntity qosInfo;

    public QosInfoEntity getQosInfo() {
        return qosInfo;
    }

    public void setQosInfo(QosInfoEntity qosInfo) {
        this.qosInfo = qosInfo;
    }

    @Override
    public String toString() {
        return "QosResponse{" +
                "qosInfo=" + qosInfo +
                '}';
    }
}
