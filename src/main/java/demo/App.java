package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.ApplicationContext;

import service.MessageSender;

/**
 * Simple example of a configurable spring console application.
 */
@SpringBootApplication
@ComponentScan("service")
public class App implements CommandLineRunner {
    
    @Autowired
    private MessageSender sender;
    
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("====================================================================");        
        sender.send("Hello World!");
        sender.close();
    }
    
}
