package com.nazjara;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldJUnit5Test {

    @Test
    public void getHello() {
        HelloWorld helloWorld = new HelloWorld();

        assertEquals(helloWorld.getHello(), "Hello World!");
    }
}
