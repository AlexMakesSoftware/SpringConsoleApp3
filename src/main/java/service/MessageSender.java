package service;

public interface MessageSender {
    public void send(String message);
    public void close();
}