package demo;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;

import demo.service.MessageSender;


public class ApiClient {

    private static String result = "not set";

    //this would be called from another applicaiton written in a different language potentially.
    public String apiInterface(String message) {
        //This is where we're going to have to create Spring, where the languages 'join'.
        SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringApp.class);
        
        builder.listeners(new ApplicationListener<ApplicationReadyEvent>() {

            @Override
            public void onApplicationEvent(ApplicationReadyEvent event) {
                
                ApplicationContext context = event.getApplicationContext();
                MessageSender sender = (MessageSender)context.getBean("postman");

                sender.send(message);
                sender.close();       
                
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                result = "result is set and everything is ok";
            }
                    
        });

        builder.run();
        
        return result;
    }

}