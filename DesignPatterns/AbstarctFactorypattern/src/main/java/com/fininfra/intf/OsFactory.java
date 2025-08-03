package com.fininfra.intf;

import com.fininfra.intf.abstract_intf.FileSystem;
import com.fininfra.intf.abstract_intf.NotificationManager;
import com.fininfra.intf.abstract_intf.Terminal;

import java.util.logging.Logger;

public interface OsFactory {
    Logger logger = Logger.getLogger(OsFactory.class.getName());
    FileSystem createFileSystem();
    Terminal createTerminal();
    NotificationManager createNotificationManager();
}
