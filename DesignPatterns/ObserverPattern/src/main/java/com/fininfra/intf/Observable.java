package com.fininfra.intf;

public interface Observable {
    void addObserver(String stockId, Observer observer);
    void removeObserver(String stockId, Observer observer);
    void notifyObservers(String stockId);
}
