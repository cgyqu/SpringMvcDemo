package com.my.common;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by cgy6094 on 2017/3/7.
 */
public class PropertyHelper {
    public static String getPropValue(String fileName, String key) throws IOException {
        if (StringUtils.isBlank(fileName)) {
            return "";
        }
        if (StringUtils.isBlank(key)) {
            return "";
        }
        if (!fileName.endsWith(".properties")) {
            fileName += ".properties";
        }
        Properties prop = new Properties();
        InputStream stream = PropertyHelper.class.getClassLoader().getResourceAsStream(fileName);
        prop.load(stream);
        return prop.getProperty(key);
    }
}
