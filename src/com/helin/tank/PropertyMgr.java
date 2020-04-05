package com.helin.tank;

import java.io.IOException;
import java.util.Properties;

/**
 * @author 何林
 * @version V1.0
 * @Package com.helin.tank
 * @date 2020/4/5 20:27
 * @Copyright © 新点软件股份有限公司
 */
public class PropertyMgr {
    static Properties prop = new Properties();

    static {
        try {
            prop.load(PropertyMgr.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object get(String key) {
        if (prop == null) {
            return null;
        }
        return prop.get(key);
    }

    public static void main(String[] args) {

    }



}
