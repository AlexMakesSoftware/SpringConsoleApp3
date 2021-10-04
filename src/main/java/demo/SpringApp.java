package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import demo.service.MessageSender;

@SpringBootApplication
public class SpringApp {
    @Autowired
    private MessageSender sender;
}