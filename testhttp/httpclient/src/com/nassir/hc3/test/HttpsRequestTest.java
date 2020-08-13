/*
 * Copyright (c) 2012 by www.pfmalls.com
 * All rights reserved.
 */
package com.nassir.hc3.test;

import com.nassir.hc3.HttpsRequest;

/**
 * @Title: HttpsRequestTest.java
 * @author nassir.wen
 */
public class HttpsRequestTest {

    public static void main(String[] args) {
        System.out.println(HttpsRequest.post("https://www.alipay.com"));
    }
}
