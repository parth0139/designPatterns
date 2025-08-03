package com.fininfra.intf.abstract_intf;

import java.util.logging.Logger;

public interface FileSystem {
    Logger logger = Logger.getLogger(FileSystem.class.getName());
    String readFile(String filePath);
    void writeFile(String filePath, String content);
}
