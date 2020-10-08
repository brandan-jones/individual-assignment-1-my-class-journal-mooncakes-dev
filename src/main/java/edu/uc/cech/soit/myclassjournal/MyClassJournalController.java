package edu.uc.cech.soit.myclassjournal;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.web.bind.annotation.RequestMapping;

public class MyClassJournalController {
    /**
     * Handle the / endpoint
     * @return
     */
    @RequestMapping("/index")
    public String index() {
        JournalEntry journalEntry = new JournalEntry();
        journalEntry.setNotes("My first entry!");
        journalEntry.setDate("October 2021");
        return "index";
    }


}
