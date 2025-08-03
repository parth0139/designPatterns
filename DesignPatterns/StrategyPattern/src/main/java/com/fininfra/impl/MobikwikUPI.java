package com.fininfra.impl;

import com.fininfra.intf.PaymentsStrategy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MobikwikUPI implements PaymentsStrategy {
    private static Logger logger = Logger.getLogger(MobikwikUPI.class.getName());
    @Override
    public void pay(int amount) {
        logger.log(Level.INFO,"Payment done using Mobikwik UPI of amount: {0}", amount);
    }
}
