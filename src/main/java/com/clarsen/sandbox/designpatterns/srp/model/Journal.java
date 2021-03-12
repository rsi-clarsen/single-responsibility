package com.clarsen.sandbox.designpatterns.srp.model;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

//
//
/**
 * A class to hold thought entries the journal class will be the container to
 * hold all the entries - addEntry(String): add entry to entries list - add
 * entry - increament number of entries - removeEntry(int) - remove entry at
 * index - decreament number of entries
 */
public class Journal {
    private final List<String> entries = new ArrayList<>();
    private static int nrOfEntries = 0;

    public void addEntry(String text) {
        entries.add(String.format("%d: %s", ++nrOfEntries, text));
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    // violates the single responsibility principle since the journal is now handling the 'saving' of the journal
    // this method is better moved to its own class inorder to seperate concerns
    // public void save(String filenam) throws FileNotFoundException {
    //     try (PrintStream out = new PrintStream(filenam)) {
    //         out.println(toString());
    //     }
    // }

}
