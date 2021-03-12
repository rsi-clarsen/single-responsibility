package com.clarsen.sandbox.designpatterns.srp.repo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import com.clarsen.sandbox.designpatterns.srp.model.Journal;

// handles the persistance to disk for the Journal class
public class JournalRepository {
    public void saveToFile(Journal journal, String filename, boolean overwrite) throws FileNotFoundException {
        if(overwrite || new File(filename).exists()) {
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal.toString());
            }
        }
    }
}
