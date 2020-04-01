package cn.org.bnc.opsManager.service;

import cn.org.bnc.opsManager.Response.QosResponse;
import cn.org.bnc.opsManager.controller.Controller;
import cn.org.bnc.opsManager.entity.*;
import cn.org.bnc.opsManager.manager.QosImpl;
import cn.org.bnc.opsManager.model.Policy;
import cn.org.bnc.opsManager.model.Rule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QosServiceImpl {
    public static QosServiceImpl qosService = new QosServiceImpl();
    String token = Controller.token;
    String tenantId = Controller.tenantId;

    public static QosServiceImpl getQosServiceImpl() {
        if (null == qosService) {
            qosService = new QosServiceImpl();
        }
        return qosService;
    }

    public QosResponse getQosResponse() {
        QosResponse response = new QosResponse();
        QosInfoEntity qosInfoEntity = new QosInfoEntity();
        response.setQosInfo(qosInfoEntity);
        List<QosListEntity> qosListEntitys = new ArrayList<>();
        qosInfoEntity.setQosList(qosListEntitys);
        QosListEntity qosListEntity;
        Map<String, Policy> policyMap = new HashMap<>();
        for (Policy policy : QosImpl.getQosPolicies(token).getPolicies()) {
            policyMap.put(policy.getId(), policy);
        }
        for (Map.Entry<String, RouterEntity> entry : TopoServiceImpl.getTopoServiceImpl().getTopologyEntity().getRouterEntityMap().entrySet()) {
            for (Map.Entry<String, NetworkEntity> networkEntry : entry.getValue().getNetworkEntityMap().entrySet()) {
                if ("vxlan".equals(networkEntry.getValue().getType())) {
                    for (Map.Entry<String, SubNetworkEntity> subnetEntry : networkEntry.getValue().getSubNetworkEntityMap().entrySet()) {
                        if ("4".equals(subnetEntry.getValue().getIp_version())) {
                            if (null != subnetEntry.getValue().getQos()) {
                                Policy policy = policyMap.get(subnetEntry.getValue().getQos());
                                qosListEntity = new QosListEntity();
                                qosListEntity.setName(subnetEntry.getValue().getIp());
                                qosListEntity.setType("switch");
                                List<DownRuleEntity> downRuleEntities = new ArrayList<>();
                                qosListEntity.setDownrule(downRuleEntities);
                                DownRuleEntity downRuleEntity;
                                List<UpRuleEntity> upRuleEntities = new ArrayList<>();
                                qosListEntity.setUprule(upRuleEntities);
                                UpRuleEntity upRuleEntity;
                                for (Rule rule : policy.getRules()) {
                                    if ("egress".equals(rule.getDirection())) {
                                        upRuleEntity = new UpRuleEntity();
                                        upRuleEntity.setIndex(upRuleEntities.size() + 1);
                                        upRuleEntity.setRule("direction: " + rule.getDirection() + "; max_kbps: " + rule.getMax_kbps() + "; max_burst_kbps: " + rule.getMax_burst_kbps());
                                        upRuleEntities.add(upRuleEntity);
                                    }
                                    if ("ingress".equals(rule.getDirection())) {
                                        downRuleEntity = new DownRuleEntity();
                                        downRuleEntity.setIndex(downRuleEntities.size() + 1);
                                        downRuleEntity.setRule("direction: " + rule.getDirection() + "; max_kbps: " + rule.getMax_kbps() + "; max_burst_kbps: " + rule.getMax_burst_kbps());
                                        downRuleEntities.add(downRuleEntity);
                                    }
                                }
                                qosListEntitys.add(qosListEntity);
                            }
                            for (ComputerEntity computer : subnetEntry.getValue().getComputerEntities()) {
                                if (null != computer.getQos()) {
                                    Policy policy = policyMap.get(computer.getQos());
                                    qosListEntity = new QosListEntity();
                                    qosListEntity.setName(computer.getIp());
                                    qosListEntity.setType("host");
                                    List<DownRuleEntity> downRuleEntities = new ArrayList<>();
                                    qosListEntity.setDownrule(downRuleEntities);
                                    DownRuleEntity downRuleEntity;
                                    List<UpRuleEntity> upRuleEntities = new ArrayList<>();
                                    qosListEntity.setUprule(upRuleEntities);
                                    UpRuleEntity upRuleEntity;
                                    for (Rule rule : policy.getRules()) {
                                        if ("egress".equals(rule.getDirection())) {
                                            upRuleEntity = new UpRuleEntity();
                                            upRuleEntity.setIndex(upRuleEntities.size() + 1);
                                            upRuleEntity.setRule("direction: " + rule.getDirection() + "; max_kbps: " + rule.getMax_kbps() + "; max_burst_kbps: " + rule.getMax_burst_kbps());
                                            upRuleEntities.add(upRuleEntity);
                                        }
                                        if ("ingress".equals(rule.getDirection())) {
                                            downRuleEntity = new DownRuleEntity();
                                            downRuleEntity.setIndex(downRuleEntities.size() + 1);
                                            downRuleEntity.setRule("direction: " + rule.getDirection() + "; max_kbps: " + rule.getMax_kbps() + "; max_burst_kbps: " + rule.getMax_burst_kbps());
                                            downRuleEntities.add(downRuleEntity);
                                        }
                                    }
                                    qosListEntitys.add(qosListEntity);
                                }
                            }
                        }
                    }
                }
            }
        }


        return response;
    }

}
