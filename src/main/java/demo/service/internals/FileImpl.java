package demo.service.internals;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import demo.service.MessageSender;

public class FileImpl implements MessageSender {

    FileOutputStream fos;

    public FileImpl() {
        try {
            fos = new FileOutputStream("messageSender.txt", true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void send(String message) {
        try {
            fos.write(message.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void close() {
        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}