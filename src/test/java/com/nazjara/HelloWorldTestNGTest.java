package com.nazjara;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTestNGTest {

    @Test
    public void testGetHello() {
        HelloWorld helloWorld = new HelloWorld();

        Assert.assertEquals(helloWorld.getHello(), "Hello World!");
    }
}