package com.wowo.spring_aop_demo1;

public class CarLogger {

    public void beforeRun(){
        System.out.println("car is going to run");
    }

    public void afterRun(){
        System.out.println("car is running");
    }
}