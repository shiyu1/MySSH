package com.junit;  
  

import org.junit.BeforeClass;  
import org.junit.Test;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
import com.undergrowth.FirstSpring;  
  
public class Junit {  
  
    @BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
    }  
  
    @Test  
    public void test() {  
        ApplicationContext ct=new ClassPathXmlApplicationContext("first.xml");  
        FirstSpring sf=(FirstSpring) ct.getBean("firstSpring");  
        sf.first();  
    }  
  
}  