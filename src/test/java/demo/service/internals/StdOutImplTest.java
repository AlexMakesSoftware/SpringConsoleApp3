package demo.service.internals;

import org.junit.Before;
import org.junit.Test;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;

public class StdOutImplTest {

    //private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    StdOutImpl printer;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        printer = new StdOutImpl();
    }

    @Test
    public void testSend() {
        printer.send("test");
        assertEquals("test", outputStreamCaptor.toString().trim());
    }
}