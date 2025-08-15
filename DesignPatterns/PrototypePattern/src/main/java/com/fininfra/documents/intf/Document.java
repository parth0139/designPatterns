package com.fininfra.documents.intf;

import java.util.List;
import java.util.logging.Logger;

public interface Document extends Cloneable {
    Logger logger = Logger.getLogger(Document.class.getName());
    Document clone();
}
