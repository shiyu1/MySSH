package com;  
  
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.undergrowth.FirstSpring;
import com.undergrowth.Student;  
import com.undergrowth.imple.StudentDaoImp;  
  
public class HibernateTest {  
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        StudentDaoImp imp=new StudentDaoImp();  
        //添加  
        Student student=new Student("under", new Date(), "计算机");  
        System.out.println(student);  
        imp.saveStudent(student);  
        //查询  
        student=imp.findNameStudent("under");  
        System.out.println(student);  
        //修改  
        student.setMajor("电信");  
        imp.updateStudent(student);  
        //查询  
        student=imp.findNameStudent("under");  
        System.out.println(student);  
        //删除  
        imp.deleteStudent(student);  
          
        
        //
        ApplicationContext ct=new ClassPathXmlApplicationContext("beans.xml");  
        FirstSpring sf=(FirstSpring) ct.getBean("firstSpring");  
        sf.first();  
    }  
  
}  