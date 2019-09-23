package com.demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCo = context.getBean("mycoach", Coach.class);
        System.out.println(theCo.getDailyWorkout());
        System.out.println(theCo.getDailyFortune());
        context.close();
    }
}
