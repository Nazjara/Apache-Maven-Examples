import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void getHello() {
        HelloWorld helloWorld = new HelloWorld();

        assertEquals(helloWorld.getHello(), "Hello World");
    }
}