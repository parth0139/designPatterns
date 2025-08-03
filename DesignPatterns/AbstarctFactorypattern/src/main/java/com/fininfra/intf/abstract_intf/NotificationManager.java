package com.fininfra.intf.abstract_intf;

import java.util.logging.Logger;

public interface NotificationManager {
    Logger logger = Logger.getLogger(NotificationManager.class.getName());
    void notification(String message);
}
