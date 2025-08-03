package com.fininfra;

import com.fininfra.impl.GpayUPI;
import com.fininfra.impl.MobikwikUPI;
import com.fininfra.impl.PaytmUPI;
import com.fininfra.impl.PhonePeUPI;

import java.util.logging.Level;
import java.util.logging.Logger;

// Strategy pattern is used when there is multiple ways of doing same thing with different
// functionality. And we want to decide at run time which one to use.
// Like cost calculation method based on different modes selected.
// Area calculation based on different shapes created.

public class StrategyPattern {
    private static final Logger logger = Logger.getLogger(StrategyPattern.class.getName());
    
    public static void run(){
        logger.log(Level.INFO, "Starting Strategy Pattern demonstration...");

        PaymentContext bill1 = new PaymentContext(new GpayUPI());
        bill1.pay(1000);

        PaymentContext bill2 = new PaymentContext(new MobikwikUPI());
        bill2.pay(2000);

        PaymentContext bill3 = new PaymentContext(new PaytmUPI());
        bill3.pay(3000);

        PaymentContext bill4 = new PaymentContext(new PhonePeUPI());
        bill4.pay(4000);
        
        logger.log(Level.INFO, "Strategy Pattern demonstration completed");
        logger.log(Level.INFO,"\n--------------------------------");
    }
}
