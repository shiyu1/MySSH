package bean;  

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;

  
public class BeanFactoryTest {  
  
public static void main(String[] args) {  
  
	 ApplicationContext ct=new ClassPathXmlApplicationContext("spring-beans.xml");  
	 SpringTestBean sf=(SpringTestBean) ct.getBean("springTestBean");  
}  
}  