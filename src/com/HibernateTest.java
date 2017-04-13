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
        //���  
        Student student=new Student("under", new Date(), "�����");  
        System.out.println(student);  
        imp.saveStudent(student);  
        //��ѯ  
        student=imp.findNameStudent("under");  
        System.out.println(student);  
        //�޸�  
        student.setMajor("����");  
        imp.updateStudent(student);  
        //��ѯ  
        student=imp.findNameStudent("under");  
        System.out.println(student);  
        //ɾ��  
        imp.deleteStudent(student);  
          
        
        //
        ApplicationContext ct=new ClassPathXmlApplicationContext("beans.xml");  
        FirstSpring sf=(FirstSpring) ct.getBean("firstSpring");  
        sf.first();  
    }  
  
}  