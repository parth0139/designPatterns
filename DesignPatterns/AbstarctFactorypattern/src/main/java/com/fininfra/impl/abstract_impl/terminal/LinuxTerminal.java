package com.fininfra.impl.abstract_impl.terminal;

import com.fininfra.intf.abstract_intf.Terminal;

import java.util.logging.Level;

public class LinuxTerminal implements Terminal {
    public void open(){
        logger.log(Level.INFO, "Opening Linux terminal");
    }
    public void close() {
        logger.log(Level.INFO, "Closing Linux terminal");
    }
    public void executeCommand(String command) {
        logger.log(Level.INFO, "Executing command in Linux terminal: " + command);
    }
}
