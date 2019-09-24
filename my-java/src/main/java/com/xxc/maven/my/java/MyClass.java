package com.xxc.maven.my.java;

import com.google.gson.Gson;

/**
 * 测试类
 */
public class MyClass {

    /**
     * 转成json字符串
     *
     * @param object 对象
     * @return 字符串
     */
    public static String toJson(Object object) {
        return new Gson().toJson(object);
    }

}
