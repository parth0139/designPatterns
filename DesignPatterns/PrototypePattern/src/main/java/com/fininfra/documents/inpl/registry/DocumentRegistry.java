package com.fininfra.documents.inpl.registry;

import com.fininfra.documents.inpl.Resume;
import com.fininfra.documents.intf.Document;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DocumentRegistry {
    private static final Logger logger = Logger.getLogger(DocumentRegistry.class.getName());
    public static final String RESUME = "resume";
    public static final String REPORT = "report";

    private static final Map<String, Document> documentMap = new HashMap<>();
    public static final DocumentRegistry instance = new DocumentRegistry();

    private DocumentRegistry(){
        documentMap.put(RESUME,new Resume("sample resume", List.of("contact", "experience", "education")));
        documentMap.put(REPORT,new com.fininfra.documents.inpl.Report("sample report", List.of("introduction", "analysis", "conclusion")));
        logger.log(Level.INFO, "DocumentRegistry initialized with prototypes.");
    }

    public static Document getPrototype(String type) {
        Document document = documentMap.get(type);
        if (document == null) {
            throw new IllegalArgumentException("No prototype found for type: " + type);
        }
        logger.log(Level.INFO,"Returning clone of type: {0}" ,type);
        return document.clone();
    }

}
