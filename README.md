# Spring configuration test POC.

## Dusting off my Spring knowledge, part 2.

Aim: demonstrate how a component (MessageSender) can be configured (*1) by spring to suit different system profiles without any 'external knowledge' but this time not using Spring profiles.

I'm using a properties files in the config directory, which I inject with the handy @PropertySource annotation into the Configurator. If you set the 'scenario' value to 'foo' you get a FileImpl implementation, otherwise you get a StdOutImpl version.

Note that if you specify 'file:' in the path for the property source, it will look on the file system, rather than serching the classpath - that was the missing part of the puzzle.

(*1) Details of the Configuration class of Spring can be found here:
https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Configuration.html

(*2) See @PropertySource https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/PropertySource.html

