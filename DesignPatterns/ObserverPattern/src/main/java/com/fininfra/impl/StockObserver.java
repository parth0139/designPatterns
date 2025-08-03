package com.fininfra.impl;

import com.fininfra.intf.Observer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StockObserver implements Observer {
    private static final Logger logger = Logger.getLogger(StockObserver.class.getName());

    String email;
    public StockObserver(String email){
        this.email = email;
    }
    @Override
    public void update(String stockId, int updatedPrice) {
        logger.log(Level.INFO, "Email:{0} received Stock update for {1}: {2}", new Object[]{email, stockId,updatedPrice});
    }
}
