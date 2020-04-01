package cn.org.bnc.opsManager.manager;

import cn.org.bnc.opsManager.controller.Controller;
import cn.org.bnc.opsManager.model.Computers;
import com.alibaba.fastjson.JSON;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ComputerImpl {
    public static Computers getComputers(String token) {
        Computers computers = new Computers();
        String ip = Controller.ip;
        HttpClient httpClient = new HttpClient();
        httpClient.getParams().setContentCharset("UTF-8");
        try {
            String computers_detail = "http://" + ip + ":8774/v2.1/servers/detail";
            GetMethod getMethod = new GetMethod(computers_detail);
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
            String computer = result.replace("OS-EXT-IPS-MAC:", "");
            computer = computer.replace("OS-EXT-IPS:", "");
            computer = computer.replace("OS-EXT-STS:", "");
            computer = computer.replace("OS-EXT-SRV-ATTR:", "");
            computers = JSON.parseObject(computer, Computers.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return computers;
    }
}
