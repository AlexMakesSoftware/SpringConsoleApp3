package demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.ApplicationContext;
import service.MessageSender;

/**
 * Simple example of a configurable spring console application.
 */
@SpringBootApplication
@ComponentScan("service") //start scanning from this point in the classpath.
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
        MessageSender sender = context.getBean(MessageSender.class);
        sender.send("Hello World!");
        sender.close();
    }
    
}
