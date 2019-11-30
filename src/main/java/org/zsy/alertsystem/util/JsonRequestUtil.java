package org.zsy.alertsystem.util;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author allenzsy
 * @date 2019/11/29
 * @time 16:03
 */
public class JsonRequestUtil {

    public static <T> T getPostJson(HttpServletRequest request, Class<T> tClass) {
        String jsonString = getJsonString(request);
        JSONObject jsonObject = JSONObject.parseObject(jsonString);
        if(jsonString == null) {
            return null;
        }
        return jsonObject.toJavaObject(tClass);
    }

    private static String getJsonString(HttpServletRequest request) {
        StringBuffer jb = new StringBuffer();
        String line = null;
        try {
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null) {
                jb.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return jb.toString();
    }
}
