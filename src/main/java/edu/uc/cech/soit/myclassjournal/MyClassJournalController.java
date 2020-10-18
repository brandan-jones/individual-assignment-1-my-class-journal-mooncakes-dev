package edu.uc.cech.soit.myclassjournal;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import edu.uc.cech.soit.myclassjournal.service.IJournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class MyClassJournalController {

    @Autowired
    IJournalService journalService;
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
