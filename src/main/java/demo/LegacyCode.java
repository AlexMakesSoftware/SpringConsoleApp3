package demo;

import demo.service.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable(preConstruction = true)
public class LegacyCode {
    @Autowired
    MessageSender sender; //let's pretend we Spring-fied this bit of code but not the Legacy code that uses it.

    public String doLegacyStuff(String message) {        
        sender.send(message);
        sender.close();       
        
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return "interupted";
        }

        return "ok";
    }
}