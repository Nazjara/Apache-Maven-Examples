package com.nazjara;

import org.apache.commons.lang3.StringUtils;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println(StringUtils.capitalize("hello World!"));
    }

    public String getHello() {
        return "Hello World!";
    }
}
