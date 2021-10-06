package demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

import demo.service.MessageSender;

@SpringBootApplication
@EnableSpringConfigured
public class SpringApp {

    //Autowire your stuff first...
    @Autowired
    private MessageSender sender;

    //then call post construct...
    @PostConstruct
    public void init() {
        sender.send("@PostConstruct - Calling SpringApp init().");
    }
}