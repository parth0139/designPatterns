package com.fininfra.intf.abstract_intf;

import java.util.logging.Logger;

public interface Terminal {
    Logger logger = Logger.getLogger(Terminal.class.getName());
    void open();
    void close();
    void executeCommand(String command);
}
