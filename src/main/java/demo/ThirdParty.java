package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import service.MessageSender;

@Component
public class ThirdParty {
    
    public ThirdParty() {
        System.out.println("ThirdParty constructed");
    }

    @Autowired
    private MessageSender sender;

    public void doYourThing() {
        sender.send("I'm doing my thing");
        sender.close();
    }

}