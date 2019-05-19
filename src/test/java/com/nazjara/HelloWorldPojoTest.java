package com.nazjara;

public class HelloWorldPojoTest {

    // POJO test name should start with 'test'
    public void testGetHelloPojo() {
        HelloWorld helloWorld = new HelloWorld();

        assert(helloWorld.getHello().equals("Hello World!"));
    }
}