package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


/**
 * Simple example of a configurable spring console application.
 */
@SpringBootApplication(scanBasePackages = {"demo", "service"} )//start scanning from this point in the classpath.
public class App implements CommandLineRunner {   

    @Autowired
    ThirdParty sender;

    public static void main( String[] args ) {
        new SpringApplicationBuilder()                    
            .sources(App.class)
            .run(args);
    }    

    @Override
    public void run(String... args) {
        
        System.out.println("run");
        sender.doYourThing();
    }
}
