package service.internals;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.MessageSender;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

/** Provides a different implementation of MessageSender, based on which profile you're using.
 * NOTE: the use of 'file:' - this is important.
 */
@Configuration
@PropertySource("file:config/config.properties")
public class Configurator {

    //gets injected by the property source thing.
    @Value( "${scenario}" )
    private String scenario;

    @Bean    
    MessageSender messenger(){
        if(scenario.equals("foo")) {
            return new FileImpl();
        } else {
            return new StdOutImpl();
        }
    }
}