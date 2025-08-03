package com.fininfra.impl;

import com.fininfra.intf.Observable;
import com.fininfra.intf.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StockPriceManager implements Observable{
    private static final Logger logger = Logger.getLogger(StockPriceManager.class.getName());
    private final Map<String,List<Observer>> subscribers = new HashMap<>();

    Map<String,Integer> stockPrices = new HashMap<>();
    public void addObserver(String stockId ,Observer observer) {
        if(subscribers.containsKey(stockId)){
            subscribers.get(stockId).add(observer);
        }else {
            subscribers.put(stockId, new ArrayList<>(List.of(observer)));
        }
    }

    public void removeObserver(String stockId, Observer observer) {
        if(subscribers.containsKey(stockId)){
            subscribers.get(stockId).remove(observer);
        }
    }

    public void setPrice(String stockId, int updatedPrice) {
        if((!stockPrices.containsKey(stockId)) || stockPrices.get(stockId)!=updatedPrice){
            stockPrices.put(stockId, updatedPrice);
            notifyObservers(stockId);
        }else {
            logger.log(Level.WARNING, "Stock price same, no need to notify observers: {0} - {1} ", new Object[]{stockId, updatedPrice});
        }
    }

    public void notifyObservers(String stockId){
        if(subscribers.containsKey(stockId)) {
            subscribers.get(stockId).forEach(observer ->
                    observer.update(stockId, stockPrices.get(stockId))
            );
        }
    }

}
