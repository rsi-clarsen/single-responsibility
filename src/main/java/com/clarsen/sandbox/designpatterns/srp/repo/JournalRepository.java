package com.clarsen.sandbox.designpatterns.srp.repo;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import com.clarsen.sandbox.designpatterns.srp.model.Journal;

/**
 *  Writes a Journal object to disk
 */
public class JournalRepository {

    /**
     * Writes the Journal object to disk
     *
     * @param journal to write
     * @param filename name of the file to write
     * @throws FileNotFoundException
     */
    public void saveToFile(Journal journal, String filename) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(filename)) {
            out.println(journal.toString());
        }
    }

}
