package com.fininfra;

import com.fininfra.impl.StockID;
import com.fininfra.impl.StockObserver;
import com.fininfra.impl.StockPriceManager;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ObserverPattern {
    /**
        * This is the main method to run the Observer Pattern example.
        * It creates a StockPriceManager and several StockObservers,
        * adds observers to specific stocks, and updates stock prices.
        * Observers will be notified of price changes.
     **/

    private ObserverPattern(){}
    private static final Logger logger= Logger.getLogger(ObserverPattern.class.getName());

    public static void run(){

        logger.log(Level.INFO, "Running Observer Pattern Example...");

        StockPriceManager manager = new StockPriceManager();
        manager.setPrice(StockID.STOCK_ID_AAPL, 5000);

        StockObserver parth = new StockObserver("parth@gmail.com");
        StockObserver sagar = new StockObserver("sagar@email.com");
        StockObserver aayush = new StockObserver("aayush@gamil.com");

        manager.addObserver(StockID.STOCK_ID_GOOG, parth);
        manager.addObserver(StockID.STOCK_ID_GOOG, sagar);

        manager.addObserver(StockID.STOCK_ID_AAPL, aayush);
        manager.addObserver(StockID.STOCK_ID_AAPL, parth);

        manager.setPrice(StockID.STOCK_ID_GOOG, 1000);
        manager.setPrice(StockID.STOCK_ID_GOOG, 1000);

        manager.removeObserver(StockID.STOCK_ID_GOOG, parth);
        manager.setPrice(StockID.STOCK_ID_GOOG, 2000);

        manager.setPrice(StockID.STOCK_ID_AAPL, 3000);

        logger.log(Level.INFO, "Observer Pattern demonstration completed");
        logger.log(Level.INFO,"\n--------------------------------");
    }
}
