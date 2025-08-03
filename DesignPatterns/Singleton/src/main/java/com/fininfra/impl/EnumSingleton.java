package com.fininfra.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

public enum EnumSingleton {
    //enum values are always singleton and threadSafe.
    INSTANCE;
    private static final Logger logger= Logger.getLogger(EnumSingleton.class.getName());
    private String dbUrl;
    private int maxConnections;

    public void setValues(String dbUrl, int maxConnections){
        this.dbUrl = dbUrl;
        this.maxConnections = maxConnections;
        logger.log(Level.INFO, "EnumSingleton instance values set: dbUrl={0}, maxConnections={1}", new Object[]{dbUrl, maxConnections});
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public int getMaxConnections() {
        return maxConnections;
    }
}
