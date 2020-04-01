package cn.org.bnc.opsManager.service;

import cn.org.bnc.opsManager.Response.SecurityGroupResponse;
import cn.org.bnc.opsManager.controller.Controller;
import cn.org.bnc.opsManager.entity.*;
import cn.org.bnc.opsManager.manager.ComputerImpl;
import cn.org.bnc.opsManager.manager.PortImpl;
import cn.org.bnc.opsManager.manager.SecurityGroupImpl;
import cn.org.bnc.opsManager.model.*;

import java.util.ArrayList;
import java.util.List;

public class SecurityGroupSeviceImpl {
    static SecurityGroupSeviceImpl securityGroupSevice = new SecurityGroupSeviceImpl();
    String token = Controller.token;
    String tenantId = Controller.tenantId;

    public static SecurityGroupSeviceImpl getSecurityGroupSeviceImpl() {
        if (null == securityGroupSevice) {
            securityGroupSevice = new SecurityGroupSeviceImpl();
        }
        return securityGroupSevice;
    }

    public SecurityGroupResponse getSecurityGroupResponse() {
        SecurityGroupResponse securityGroupResponse = new SecurityGroupResponse();
        SecurityInfoEntity securityInfo = new SecurityInfoEntity();
        securityGroupResponse.setSecurityInfo(securityInfo);
        List<GroupEntity> groups = new ArrayList<>();
        securityInfo.setGroups(groups);
        GroupEntity groupEntity;
        List<RuleListEntity> rulelist = new ArrayList<>();
        List<UserListEntity> userlist = new ArrayList<>();
        RuleListEntity ruleListEntity;
        UserListEntity userListEntity;
        List<SecurityGroup> securityGroups = SecurityGroupImpl.getSecurityGroups(token).getSecurity_groups();
        for (SecurityGroup securityGroup : securityGroups) {
            if (tenantId.equals(securityGroup.getTenant_id())) {
                groupEntity = new GroupEntity();
                groupEntity.setId(securityGroup.getId());
                String protocol;
                String port_range_min;
                String port_range_max;
                String port_range;
                for (int i = 0; i < securityGroup.getSecurity_group_rules().size(); i++) {
                    SecurityGroupRule securityGroupRule = securityGroup.getSecurity_group_rules().get(i);
                    if ("IPv4".equals(securityGroupRule.getEthertype())) {
                        ruleListEntity = new RuleListEntity();
                        ruleListEntity.setIndex(rulelist.size()+1);
                        protocol = securityGroupRule.getProtocol();
                        if (null == protocol) {
                            protocol = "any";
                        }
                        port_range_min = securityGroupRule.getPort_range_min();
                        if (null == port_range_min) {
                            port_range_min = "any";
                        }
                        port_range_max = securityGroupRule.getPort_range_max();
                        if (null == port_range_max) {
                            port_range_max = "any";
                        }
                        port_range = port_range_min + "-" + port_range_max;
                        if (port_range.contains("any")) {
                            port_range = "any";
                        }
                        ruleListEntity.setRule("direction: " + securityGroupRule.getDirection() + "; protocol: " + protocol + "; port_range: "
                                + port_range);
                        rulelist.add(ruleListEntity);
                    }
                }
                groupEntity.setRulelist(rulelist);
                groupEntity.setUserlist(userlist);
                groups.add(groupEntity);
            }
        }
        for (Port port : PortImpl.getPorts(token).getPorts()) {
            if (tenantId.equals(port.getTenant_id()) && port.getSecurity_groups().size() > 0 && ("compute:nova").equals(port.getDevice_owner())) {
                for (int i = 0; i < groups.size(); i++) {
                    groupEntity = groups.get(i);
                    if (groupEntity.getId().equals(port.getSecurity_groups().get(0))) {
                        userListEntity = new UserListEntity();
                        userListEntity.setIndex(groupEntity.getUserlist().size() + 1);
                        userListEntity.setUser(port.getFixed_ips().get(0).getIp_address());
                        groupEntity.getUserlist().add(userListEntity);
                    }
                }
            }
        }
        return securityGroupResponse;
    }


}
