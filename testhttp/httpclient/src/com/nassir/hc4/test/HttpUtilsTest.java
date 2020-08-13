/*
 * Copyright (c) 2012 by www.pfmalls.com
 * All rights reserved.
 */
package com.nassir.hc4.test;

import java.io.IOException;

import com.nassir.hc4.HttpUtils;

/**
 * @Title: HttpUtilsTest.java
 * @author nassir.wen
 */
public class HttpUtilsTest {
    public static void main(String[] args) throws IOException {
        System.out.println(HttpUtils.get("http://www.baidu.com", null));
    }
}
