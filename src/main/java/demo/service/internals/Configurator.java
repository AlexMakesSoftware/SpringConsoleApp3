package demo.service.internals;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import demo.service.MessageSender;

/** Provides a different implementation of MessageSender, based on which profile you're using.
 * NOTE: the use of 'file:' - this is important.
 */

@Configuration
@PropertySource("file:config/config.properties")
public class Configurator {

    //gets injected by the property source.
    @Value( "${scenario}" )
    private String scenario;

    //Give me a bean that fits the profile.
    @Bean(name = "postman")
    MessageSender messenger(){

        System.out.println("messager getting configured");

        if(scenario.equals("foo")) {
            System.out.println("'foo' detected, returning a FileImpl");
            return new FileImpl();
        } else {
            System.out.println("default: returning a StdOutImpl");
            return new StdOutImpl();
        }
    }
}