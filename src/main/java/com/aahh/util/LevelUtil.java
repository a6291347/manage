package com.aahh.util;

import org.apache.commons.lang3.StringUtils;


/*生成对应的lever*/
public class LevelUtil {

    public final static String SEPARATOR = ".";

    public final static String ROOT = "0";


    /*
     * @Author aahh
     * @param parentLevel :上级lever
     * @param parentId :自身的id
     * @return java.lang.String
     * @throws
     * @Date 2020/2/8 15:43
     */
    public static String calculateLevel(String parentLevel, int parentId) {
        if (StringUtils.isBlank(parentLevel)) {
            return ROOT;
        } else {
            return StringUtils.join(parentLevel, SEPARATOR, parentId);
        }
    }
}
