# Spring configuration test POC.

## Dusting off my Spring knowledge, part 3.

Invoking the app in different ways.
- As an API from an entirely different app.
In which case we are not invoking the app from a main method and so not using CommandLineRunner.
- From a main() method.
Normally we'd use a CommandLineRunner but we can't or it'll mess up the API call path into the app.

Note the use of @PostConstruct to do legacy 'non-spring' things. This was one of the key things I was looking for, to help introduce Spring gradually into a non-Spring app.

Testing - unit and system.
- system test from maven using junit
- regular junit tests.

