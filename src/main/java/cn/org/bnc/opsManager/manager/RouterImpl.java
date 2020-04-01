package cn.org.bnc.opsManager.manager;

import cn.org.bnc.opsManager.controller.Controller;
import cn.org.bnc.opsManager.model.Routers;
import com.alibaba.fastjson.JSON;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RouterImpl {
    public static Routers getRouters(String token) {
        Routers routers = new Routers();
        String ip = Controller.ip;
        HttpClient httpClient = new HttpClient();
        httpClient.getParams().setContentCharset("UTF-8");
        try {
            String urlRouters = "http://" + ip + ":9696/v2.0/routers";
            GetMethod getMethod = new GetMethod(urlRouters);
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
            routers = JSON.parseObject(result, Routers.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return routers;
    }
}
