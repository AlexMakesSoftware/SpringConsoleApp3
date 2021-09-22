package service.internals;

import service.MessageSender;

public class StdOutImpl implements MessageSender{
    
    public void send(String message) {
        System.out.println(message);
    }
    
    public void close() {
        System.out.println("Bye.");
    }
}