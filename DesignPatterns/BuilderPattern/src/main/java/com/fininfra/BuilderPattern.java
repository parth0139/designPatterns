package com.fininfra;

import com.fininfra.impl.DatabaseConfig;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 Builder Pattern is used when we want immutable objects and all the fields are
 not mandatory. By using builder, the client code doesn't have to pass null for the
 fields which they don't want to provide.
 */

public class BuilderPattern {
    private static final Logger logger = Logger.getLogger(BuilderPattern.class.getName());

    private BuilderPattern(){}
    public static void run() {
        logger.log(Level.INFO, "Starting Strategy Pattern demonstration...");

        DatabaseConfig.Builder builder= new DatabaseConfig.Builder();
        DatabaseConfig config = builder
                .setUrl("jdbc:mysql://localhost:3306/mydb")
                .setUsername("user")
                .setPassword("password")
                .setDriverClassName("com.mysql.cj.jdbc.Driver")
                .setConnectionPoolSize("10")
                .setConnectionTimeout("30000")
                .setIdleTimeout("600000")
                .build();

        logger.log(Level.INFO, "Database Config created: {0} ", config);

        logger.log(Level.INFO, "Builder Pattern demonstration completed");
        logger.log(Level.INFO,"\n--------------------------------");

    }
}