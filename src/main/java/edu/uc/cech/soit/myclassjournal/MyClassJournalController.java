package edu.uc.cech.soit.myclassjournal;

import org.springframework.web.bind.annotation.RequestMapping;

public class MyClassJournalController {
    /**
     * Handle the / endpoint
     * @return
     */
    @RequestMapping("/index")
    public String index() {
        return "index";
    }


}
