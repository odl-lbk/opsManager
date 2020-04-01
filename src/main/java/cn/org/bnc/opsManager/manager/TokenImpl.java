package cn.org.bnc.opsManager.manager;

import cn.org.bnc.opsManager.controller.Controller;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;

public class TokenImpl {
    public static String getToken() {
        String token = "";
        try {
            String url = "http://" + Controller.ip + ":5000/v3/auth/tokens";
            HttpClient httpClient = new HttpClient();
            httpClient.getParams().setContentCharset("UTF-8");
            PostMethod method = new PostMethod(url);
            String str = "{ \"auth\": {\n" +
                    "    \"identity\": {\n" +
                    "      \"methods\": [\"password\"],\n" +
                    "      \"password\": {\n" +
                    "        \"user\": {\n" +
                    "          \"id\": \"f270b674c4604e4ab491abb4b5618ccb\",\n" +
                    "          \"password\": \"password\"\n" +
                    "        }\n" +
                    "      }\n" +
                    "    },\n" +
                    "            \"scope\": {\n" +
                    "            \"project\": {\n" +
                    "                \"id\": \"" + Controller.tenantId + "\"\n" +
                    "            }\n" +
                    "        }\n" +
                    "  }\n" +
                    "}";
            RequestEntity entity;
            entity = new StringRequestEntity(str, "application/json", "UTF-8");
            method.setRequestEntity(entity);
            httpClient.executeMethod(method);
            token = method.getResponseHeader("X-Subject-Token").getValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return token;
    }
}
