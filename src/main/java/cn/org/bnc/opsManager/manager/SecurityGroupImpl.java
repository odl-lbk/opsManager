package cn.org.bnc.opsManager.manager;

import cn.org.bnc.opsManager.controller.Controller;
import cn.org.bnc.opsManager.model.SecurityGroups;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import com.alibaba.fastjson.JSON;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SecurityGroupImpl {
    public static SecurityGroups getSecurityGroups(String token) {
        SecurityGroups securityGroups = new SecurityGroups();
        String ip = Controller.ip;
        HttpClient httpClient = new HttpClient();
        httpClient.getParams().setContentCharset("UTF-8");
        try {
            String urlPorts = "http://" + ip + ":9696/v2.0/security-groups";
            GetMethod getMethod = new GetMethod(urlPorts);
            List<Header> headers = new ArrayList<>();
            headers.add(new Header("X-Auth-Token", token));
            httpClient.getHostConfiguration().getParams().setParameter("http.default-headers", headers);
            httpClient.executeMethod(getMethod);
            InputStream in = getMethod.getResponseBodyAsStream();
            StringBuffer sb = new StringBuffer();
            InputStreamReader isr = new InputStreamReader(in, "UTF-8");
            char[] b = new char[4096];
            for (int n; (n = isr.read(b)) != -1; ) {
                sb.append(new String(b, 0, n));
            }
            String result = sb.toString();
            securityGroups = JSON.parseObject(result, SecurityGroups.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return securityGroups;
    }
}
