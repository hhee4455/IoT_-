package inhatc.cse.spring.di.lifecycle;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student2 {
    private String name;
    private int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @PostConstruct
    public void start() {
        System.out.println("start() 호출");
    }

    /**
     * 객체 소멸시 호출되는 메소드
     */
    @PreDestroy
    public void end() {
        System.out.println("end() 호출");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
