package com.fininfra.impl;

import com.fininfra.intf.PaymentsStrategy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PhonePeUPI implements PaymentsStrategy {
    private static Logger logger = Logger.getLogger(PhonePeUPI.class.getName());
    @Override
    public void pay(int amount) {
        logger.log(Level.INFO, "Payment done using PhonePe UPI of amount: {0}", amount);
    }
}
