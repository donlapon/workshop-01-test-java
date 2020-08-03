import org.junit.Test;

import static org.junit.Assert.*;

public class hello_worldTest {

    @Test
    public void sayHi_should_return_Hello_world(){
        hello_world h = new hello_world();
        String result = h.sayHi("Donlaporn");
        assertEquals("Hello World", result);
    }

    @Test
    public void sayHi_with_Donlaporn_should_return_Hello_world(){
        hello_world h = new hello_world();
        String result = h.sayHi("Donlaporn");
        assertEquals("Hello Donlaporn", result);
    }

    @Test
    public void sayHi_with_Nam_should_return_Hello_world(){
        hello_world h = new hello_world();
        String result = h.sayHi("Nam");
        assertEquals("Hello Nam", result);
    }

}