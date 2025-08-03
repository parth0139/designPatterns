package com.fininfra;

import com.fininfra.intf.PaymentsStrategy;

public class PaymentContext {
    PaymentsStrategy strategy;
    public PaymentContext(PaymentsStrategy strategy){
        this.strategy = strategy;
    }

    public void pay(int amount){
        strategy.pay(amount);
    }
}
