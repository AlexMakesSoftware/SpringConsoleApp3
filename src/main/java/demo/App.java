package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

/**
 * Simple example of a configurable spring console application.
 */
@SpringBootApplication(scanBasePackages = {"demo", "service"} )//start scanning from this point in the classpath.
public class App implements CommandLineRunner {   
    
    @Autowired
    private ApplicationContext context;

    public static void main( String[] args ) {
        new SpringApplicationBuilder()                    
            .sources(App.class)
            .run(args);
    }    

    @Override
    public void run(String... args) {
        
        System.out.println("run");
        
        //n.b. Autowiring this doesn't work.
        ThirdParty sender = context.getBean(ThirdParty.class);
        sender.doYourThing();
    }
}
