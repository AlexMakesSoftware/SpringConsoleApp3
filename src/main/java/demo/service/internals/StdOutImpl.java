package demo.service.internals;

import demo.service.MessageSender;

public class StdOutImpl implements MessageSender{
    
    public void send(String message) {
        System.out.println(message);
    }
    
    public void close() {
        System.out.println("Bye.");
    }
}