package demo;

import org.springframework.boot.builder.SpringApplicationBuilder;


public class ApiClient {

    private static String result = "not set";

    //this would be called from another applicaiton written in a different language potentially.
    public String apiInterface(String message) {
        //This is where we're going to have to create Spring, where the languages 'join'.
        SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringApp.class);
        builder.run();
        System.out.println("Running legacy code...");
        LegacyCode oldCode = new LegacyCode();
        result = oldCode.doLegacyStuff("hello world");
        
        return result;
    }

}