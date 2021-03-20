# Single Responsibility Principle

The ***single responsibility principle*** states that an object should only have one reason to change.  Meaning a single class has only 1 primary responsibility instead of taking on many responsibilities.

[Journal](src/main/java/com/clarsen/designpatterns/srp/model/Journal.java)
- maintains the code that manages a list of entries

[JournalRepository](src/main/java/com/clarsen/designpatterns/srp/repo/JournalRepository.java)
- maintains the code to save `Journal`s to disk

The `Journal` class is what manages the state of the journal by adding journal entries.  It would be really easy to simply add the ability to save the `Journal` object to itself, but that would violate the Single Responsibility Principle.  Since managing state and writing a file are two different behaviors, it is better to keep them separated.

## To Run
This command will write a file `test.txt` to the root.
```
mvn test
```
`test.txt` will contain:
```
1: Ran a test today.
2: Wrote a file today.
```