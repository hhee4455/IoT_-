package inhatc.cse.spring.interfaces;

import inhatc.cse.spring.basic.Car;
import inhatc.cse.spring.basic.Money;

public interface Maker {
    public Car sell(Money money);
}
