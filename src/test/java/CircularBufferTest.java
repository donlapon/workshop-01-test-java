import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {

    @Test
    public void create_new_buffer_should_empty() {
        CircularBuffer cb = new CircularBuffer();
        boolean result = cb.isEmpty();
        assertTrue("Buffer ไม่ว่างนะ", result);
    }

    @Test
    public void create_new_buffer_with_default_size_should_10() {
        CircularBuffer cb = new CircularBuffer();
        for(int i=0; i< 10; i++) {
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        assertTrue("Buffer ไม่เต็มนะ", result);
    }

    @Test
    public void write_A_B_to_buffer_should_read_A_B_from_buffer() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
    }

    @Test
    public void write_new_data_to_full_buffer_new_data_should_replace_first_data(){
        CircularBuffer cb = new CircularBuffer();
        int size = cb.bufferSize;
        for(int i=0; i<size; i++){
            cb.writeData("A"+i);
        }
        cb.writeData("B");
        assertEquals("B", cb.readData());
        assertEquals("A1",cb.readData());
    }
    @Test
    public void read_before_write_data_should_be_null(){
        CircularBuffer cb = new CircularBuffer();
        assertNull("No value in buffer", cb.readData());
    }
}