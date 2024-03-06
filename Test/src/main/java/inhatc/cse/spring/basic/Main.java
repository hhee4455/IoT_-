package inhatc.cse.spring.basic;

public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager(new HundaiMaker());
        orderManager.order(2000);
    }
}
