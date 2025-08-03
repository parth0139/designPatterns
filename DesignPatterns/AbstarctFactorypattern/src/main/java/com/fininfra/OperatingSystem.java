package com.fininfra;

import com.fininfra.intf.OsFactory;
import com.fininfra.intf.abstract_intf.FileSystem;
import com.fininfra.intf.abstract_intf.NotificationManager;
import com.fininfra.intf.abstract_intf.Terminal;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OperatingSystem {
    private static final Logger logger = Logger.getLogger(OperatingSystem.class.getName());
    private final FileSystem fileSystem;
    private final Terminal terminal;
    private final NotificationManager notificationManager;

    public OperatingSystem(OsFactory factory){
        this.fileSystem = factory.createFileSystem();
        this.terminal = factory.createTerminal();
        this.notificationManager = factory.createNotificationManager();
    }

    public FileSystem getFileSystem() {
        return fileSystem;
    }
    public Terminal getTerminal() {
        return terminal;
    }

    public NotificationManager getNotificationManager() {
        return notificationManager;
    }

    public void runAll(){
        logger.log(Level.INFO, "Running all components of the operating system");

        logger.log(Level.INFO, "Running File System");
        logger.log(Level.INFO,fileSystem.readFile("example.txt"));
        fileSystem.writeFile("example.txt", "Hello, World!");

        logger.log(Level.INFO, "Running Terminal");
        terminal.open();
        terminal.executeCommand("ls -l");
        terminal.close();

        logger.log(Level.INFO, "Running Notification Manager");
        notificationManager.notification("Welcome to the Operating System!");

        logger.log(Level.INFO, "All components of Os been run successfully. \n");
    }

}
