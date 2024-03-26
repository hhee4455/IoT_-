package inhatc.cse.spring.di.properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainConstructor {
    public static void main(String[] args) {
        String location = "classpath:properties/constructorCTX.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(location);

        MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
        double weight = myInfo.getWeight();
        double height = myInfo.getHeight();

        // BMICalc 빈을 직접 생성하지 않고, 스프링 컨테이너에서 가져와서 사용
        BMICalc bmiCalc = ctx.getBean("bmiCalc", BMICalc.class);
        bmiCalc.bmiCalc(weight, height);

        ctx.close(); // 애플리케이션 컨텍스트 종료
    }
}
