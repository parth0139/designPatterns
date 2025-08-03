package com.fininfra.impl;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum EnumFinalSingleton {
    INSTANCE;
    private static final Logger logger= Logger.getLogger(EnumSingleton.class.getName());
    private String dbUrl;
    private int maxConnections;
    private AtomicBoolean initialized = new AtomicBoolean(false);

    public void setValues(String dbUrl, int maxConnections){
        if(!initialized.compareAndExchange(false,true)){
            this.dbUrl = dbUrl;
            this.maxConnections = maxConnections;
            logger.log(Level.INFO, "EnumSingleton instance values set: dbUrl={0}, maxConnections={1}", new Object[]{dbUrl, maxConnections});

        }else {
            logger.log(Level.WARNING, "EnumFinalSingleton instance is already initialized. Cannot set values again.");
        }
    }
    public String getDbUrl() {
        return dbUrl;
    }

    public int getMaxConnections() {
        return maxConnections;
    }
}
