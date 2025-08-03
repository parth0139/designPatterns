package com.fininfra.impl;

import com.fininfra.impl.abstract_impl.file_system.LinuxFileSystem;
import com.fininfra.impl.abstract_impl.notification_manager.LinuxNotificationManager;
import com.fininfra.impl.abstract_impl.terminal.LinuxTerminal;
import com.fininfra.intf.OsFactory;
import com.fininfra.intf.abstract_intf.FileSystem;
import com.fininfra.intf.abstract_intf.NotificationManager;
import com.fininfra.intf.abstract_intf.Terminal;

import java.util.logging.Level;

public class LinuxFactory implements OsFactory{
    public NotificationManager createNotificationManager() {
        logger.log(Level.INFO, "Creating Linux Notification Manager");
        return new LinuxNotificationManager();
    }
    public Terminal createTerminal() {
        logger.log(Level.INFO, "Creating Linux Terminal");
        return new LinuxTerminal();
    }
    public FileSystem createFileSystem() {
        logger.log(Level.INFO, "Creating Linux File System");
        return new LinuxFileSystem();
    }
}
