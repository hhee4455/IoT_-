package inhatc.cse.spring;

public class KiaMaker implements Maker {

    @Override
    public Car sell(Money money) {
        System.out.println("기아 자동차(수금) : " + money.getAmount() + "원");
        Car car = new Car("쏘렌토");
        return car;
    }
}
