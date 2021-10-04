package demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import demo.service.MessageSender;

@SpringBootApplication
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