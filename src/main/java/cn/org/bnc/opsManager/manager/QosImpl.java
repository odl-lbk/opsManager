package cn.org.bnc.opsManager.manager;

import cn.org.bnc.opsManager.controller.Controller;
import cn.org.bnc.opsManager.model.QosPolicies;
import com.alibaba.fastjson.JSON;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class QosImpl {
    public static QosPolicies getQosPolicies(String token) {
        QosPolicies qosPolicies = new QosPolicies();
        String ip = Controller.ip;
        HttpClient httpClient = new HttpClient();
        httpClient.getParams().setContentCharset("UTF-8");
        try {
            String urlQosPolicy = "http://" + ip + ":9696/v2.0/qos/policies";
            GetMethod getMethod = new GetMethod(urlQosPolicy);
            List<Header> headers = new ArrayList<>();
            headers.add(new Header("X-Auth-Token", token));
            httpClient.getHostConfiguration().getParams().setParameter("http.default-headers", headers);
            httpClient.executeMethod(getMethod);
            InputStream in = getMethod.getResponseBodyAsStream();
            StringBuffer sb1 = new StringBuffer();
            InputStreamReader isr = new InputStreamReader(in, "UTF-8");
            char[] b1 = new char[4096];
            for (int n; (n = isr.read(b1)) != -1; ) {
                sb1.append(new String(b1, 0, n));
            }
            String result = sb1.toString();
            qosPolicies = JSON.parseObject(result, QosPolicies.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return qosPolicies;
    }
}
