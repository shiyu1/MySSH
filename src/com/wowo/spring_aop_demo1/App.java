package com.wowo.spring_aop_demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Car car=(Car) context.getBean("car");
        car.go();
    }
}