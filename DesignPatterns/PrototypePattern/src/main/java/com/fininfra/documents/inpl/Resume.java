package com.fininfra.documents.inpl;

import com.fininfra.documents.intf.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class Resume implements Document {
    private final String title;
    private final List<String> sections;

    public Resume(String title, List<String> sections) {
        this.title = title;
        this.sections = sections;
    }

    @Override
    public Document clone() {
        //deep copy, so that all the prototypes have copy of original, not the actual reference
        logger.log(Level.INFO, "Cloning Resume: {0}", this.title);
        return new Resume(this.title, new ArrayList<>(this.sections));
    }
}
