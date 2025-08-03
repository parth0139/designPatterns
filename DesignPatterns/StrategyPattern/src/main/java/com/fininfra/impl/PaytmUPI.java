package com.fininfra.impl;

import com.fininfra.intf.PaymentsStrategy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PaytmUPI implements PaymentsStrategy {
    private static Logger logger = Logger.getLogger(PaytmUPI.class.getName());
    @Override
    public void pay(int amount) {
        logger.log(Level.INFO, "Payment done using Paytm UPI of amount: {0}", amount);
    }
}
