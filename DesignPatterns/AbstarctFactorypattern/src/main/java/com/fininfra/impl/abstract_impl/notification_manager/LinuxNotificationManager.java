package com.fininfra.impl.abstract_impl.notification_manager;

import com.fininfra.intf.abstract_intf.NotificationManager;

import java.util.logging.Level;

public class LinuxNotificationManager implements NotificationManager {
    public void notification(String message) {
        logger.log(Level.INFO, "Linux Notification: " + message);
    }
}
