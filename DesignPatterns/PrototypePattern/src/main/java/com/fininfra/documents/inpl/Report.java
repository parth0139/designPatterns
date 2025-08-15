package com.fininfra.documents.inpl;

import com.fininfra.documents.intf.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class Report implements Document {
    private final String title;
    private final List<String> sections;

    public Report(String title, List<String> sections) {
        this.title = title;
        this.sections = sections;
    }

    @Override
    public Document clone() {
        //deep copy, so that all the prototypes have copy of original, not the actual reference
        logger.log(Level.INFO, "Cloning Report: {0}", this.title);
        return new Report(this.title, new ArrayList<>(this.sections));
    }

}
