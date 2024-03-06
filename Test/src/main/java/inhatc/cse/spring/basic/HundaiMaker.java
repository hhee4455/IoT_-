package inhatc.cse.spring.basic;

public class HundaiMaker implements Maker{

        @Override
        public Car sell(Money money) {
            System.out.println("현대 자동차(수금) : " + money.getAmount() + "원");
            Car car = new Car("그랜져");
            return car;
        }
}
