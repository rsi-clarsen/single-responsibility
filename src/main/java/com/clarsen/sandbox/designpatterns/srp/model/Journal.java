package com.clarsen.sandbox.designpatterns.srp.model;

import java.util.ArrayList;

/**
 * A class to manage journal entries
 *
 */
public class Journal extends ArrayList<String> {
    private static final long serialVersionUID = -5814343938564794413L;
    private static int nrOfEntries = 0;

    /**
     * Adds an entry to the Journal
     *
     * @param text - Text to save in the Journal
     */
    public void addEntry(String text) {
        this.add(String.format("%d: %s", ++nrOfEntries, text));
    }

    /**
     * Adds an entry to the Journal
     *
     * @param index - Position of the to remove in the Journal
     */
    public void removeEntry(int index) {
        this.remove(index);
    }

    /**
     * Prints the entries of the journal in a numerical list.
     *
     *@return The String representation of the Journal object
     */
    @Override
    public String toString() {
        return String.join(System.lineSeparator(), this);
    }

}
