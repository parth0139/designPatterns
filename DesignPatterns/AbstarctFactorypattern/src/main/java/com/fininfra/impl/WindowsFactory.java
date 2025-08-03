package com.fininfra.impl;

import com.fininfra.impl.abstract_impl.file_system.WIndowsFileSystem;
import com.fininfra.impl.abstract_impl.notification_manager.WindowsNotificationManager;
import com.fininfra.impl.abstract_impl.terminal.WindowsTerminal;
import com.fininfra.intf.OsFactory;
import com.fininfra.intf.abstract_intf.FileSystem;
import com.fininfra.intf.abstract_intf.NotificationManager;
import com.fininfra.intf.abstract_intf.Terminal;

import java.util.logging.Level;

public class WindowsFactory implements OsFactory {
    public NotificationManager createNotificationManager() {
        logger.log(Level.INFO, "Creating Windows Notification Manager");
        return new WindowsNotificationManager();
    }
    public Terminal createTerminal() {
        logger.log(Level.INFO, "Creating Windows Terminal");
        return new WindowsTerminal();
    }
    public FileSystem createFileSystem() {
        logger.log(Level.INFO, "Creating Windows File System");
        return new WIndowsFileSystem();
    }
}
