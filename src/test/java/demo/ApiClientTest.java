package demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ApiClientTest {

    @Test
    public void systemTest() {
        String actual = new ApiClient().apiInterface("This is an API call from a 3rd party.");
        String expected = "result is set and everything is ok";
        assertEquals(expected, actual);
    }

}