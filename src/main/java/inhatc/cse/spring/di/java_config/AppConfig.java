package inhatc.cse.spring.di.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class AppConfig {
    @Bean
    public Student student1() {
        ArrayList<String> hobbies = new ArrayList<String>();
        hobbies.add("축구");
        hobbies.add("야구");
        hobbies.add("농구");

        hobbies.forEach(System.out::println);
        Student student = new Student("홍길동", 20, hobbies);
        student.setHeight(183.4);
        student.setWeight(78.2);
        return student;
    }

    @Bean
    public Student student2() {
        ArrayList<String> hobbies = new ArrayList<String>();
        hobbies.add("독서");
        hobbies.add("시 감상");

        hobbies.forEach(System.out::println);
        Student s = new Student("홍아빠", 50, hobbies);
        s.setHeight(183);
        s.setWeight(78.2);
        return s;
    }
}
