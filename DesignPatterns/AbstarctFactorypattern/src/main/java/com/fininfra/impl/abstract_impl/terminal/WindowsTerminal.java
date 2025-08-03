package com.fininfra.impl.abstract_impl.terminal;

import com.fininfra.intf.abstract_intf.Terminal;

import java.util.logging.Level;

public class WindowsTerminal implements Terminal {
    public void open(){
        logger.log(Level.INFO, "Opening Windows terminal");
    }
    public void close() {
        logger.log(Level.INFO, "Closing Windows terminal");
    }
    public void executeCommand(String command) {
        logger.log(Level.INFO, "Executing command in Windows terminal: " + command);
    }
}
