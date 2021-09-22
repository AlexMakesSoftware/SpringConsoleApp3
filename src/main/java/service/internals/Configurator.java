package service.internals;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import service.MessageSender;

/** Provides a different implementation of MessageSender, based on which profile you're using. */
@Configuration
public class Configurator {
    @Bean
    @Profile("usefiles")
    MessageSender config1(){
        System.out.println("usefiles being called!!!");
        return new FileImpl();
    }

    @Bean
    @Profile("useStdio")
    MessageSender config2(){
        System.out.println("useStdio being called!!!");
        return new StdOutImpl();
    }
}