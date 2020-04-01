package cn.org.bnc.opsManager.manager;

import cn.org.bnc.opsManager.controller.Controller;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PutMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;

import java.util.ArrayList;
import java.util.List;

public class NatImpl {
    public static String natModify(String id, String network_id, boolean snat, String token) {
        String str1 = "";
        try {
            String url = "http://" + Controller.ip + ":9696/v2.0/routers/" + id;
            HttpClient httpClient = new HttpClient();
            httpClient.getParams().setContentCharset("UTF-8");
            PutMethod method = new PutMethod(url);
            List<Header> headers = new ArrayList<>();
            headers.add(new Header("X-Auth-Token", token));
            httpClient.getHostConfiguration().getParams().setParameter("http.default-headers", headers);
            String str = "{\n" +
                    "  \"router\": {\n" +
                    "    \"external_gateway_info\": {\n" +
                    "    \"network_id\": \"" + network_id + "\",\n" +
                    "      \"enable_snat\": " + snat + "\n" +
                    "    }\n" +
                    "  }\n" +
                    "}";
            RequestEntity entity;
            entity = new StringRequestEntity(str, "application/json", "UTF-8");
            method.setRequestEntity(entity);
            int response = httpClient.executeMethod(method);
            if (200 == response) {
                str1 = "success";
            } else {
                str1 = "failure";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str1;
    }
}
