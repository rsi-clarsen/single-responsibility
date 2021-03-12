# Single Responsibility Principle

The ***single responsibility principle*** states that an object should only have one reason to change.  Meaning a single class has only 1 primary responsibility instead of taking on many responsibilities.

The `Journal` class maintains the code that manages a list of entries while the `JournalRepository` maintains the code to save and/or load `Journal`s from disk.  This seperates concerns and maintains a single responsibilty between the saving and state management behaviors.

The `Journal` class is what manages the state of the journal by adding and removing journal entries.  It would be really easy to simply add the ability to save the the `Journal` object itself, but that would violate the Single Responsibility Principle.  Since managing state and writing to a file are two different processes, it is better to keep them sperated.

## To Run
This command will write a file `main.txt` to the root of the project
```
mvn spring-boot:run
```

This command will write a file `test.txt` to the root of the project
```
mvn test
```