package com.fininfra.intf;

import java.util.logging.Logger;

public interface Text {
    Logger logger = Logger.getLogger(Text.class.getName());
    void render();
    String getText();
}
