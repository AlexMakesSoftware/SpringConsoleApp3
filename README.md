# Spring configuration test POC.

## Dusting off my Spring knowledge, part 1.

Aim: demonstrate how a component (MessageSender) can be configured (*1) by spring to suit different system profiles without any 'external knowledge'. In other words, things that use that component only get the interface and have no idea which implementation is being used, only that it fullfills it's contract in some way and that's enough.

In this demo I'm (ab)using Spring profiles to do this.
That is, the profile name set in spring.profiles.active determines the classes created by the configuration class.
Note that the property spring.profiles.active could be set in src/resources/application.properties(*2) but that's not really configurable enough. We want to read this from some file or something outside of the jar.

As I say above, using profiles for this is probably an abuse of that mechanism, or at least an unintended use of it. Maybe that's not a good thing. The next demo should try to move away from Spring profiles and read a configuration from disc instead but I'm keeping this demo in case I ever need to know how to configure my environment differently for different release environments.

(*2) Typically profiles are used as fairly static environments like testinfg, qa, production, development, etc. Maven can be used to filter the application configuration files and inject the appropraite settings but that's not what I was aiming for here.

(*1) Details of the Configuration class of Spring can be found here:
https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Configuration.html

