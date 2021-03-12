package com.clarsen.sandbox.designpatterns.srp;

import com.clarsen.sandbox.designpatterns.srp.model.Journal;
import com.clarsen.sandbox.designpatterns.srp.repo.JournalRepository;

import org.junit.jupiter.api.Test;

class SrpApplicationTests {

    private JournalRepository repo = new JournalRepository();

    @Test
    void testSRP() throws Exception{
        Journal j = new Journal();

        j.addEntry("Ran a test today.");
        j.addEntry("Wrote a file today.");

        repo.saveToFile(j, "test.txt", true);
    }

}
