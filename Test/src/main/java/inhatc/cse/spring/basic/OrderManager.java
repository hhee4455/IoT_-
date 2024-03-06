package inhatc.cse.spring.basic;

import inhatc.cse.spring.basic.Maker;

public class OrderManager {
    private Maker maker;

    public OrderManager(Maker maker) {
        this.maker = maker;
    }

    public void order(int don) {
        Money money = new Money(don);
        Car car = maker.sell(money);
        System.out.println("자동차 인수 : " + car.getName());
    }
}
