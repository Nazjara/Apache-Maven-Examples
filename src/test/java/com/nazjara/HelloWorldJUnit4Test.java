package com.nazjara;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldJUnit4Test {

    @Test
    public void getHello() {
        HelloWorld helloWorld = new HelloWorld();

        assertEquals(helloWorld.getHello(), "Hello World!");
    }
}
