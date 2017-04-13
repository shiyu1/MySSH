package com.undergrowth.imple;  
  
import com.undergrowth.Student;  
import com.undergrowth.hibernate.utils.HibernateUtils;  
import com.undergrowth.inter.StudentDaoInter;  
  
public class StudentDaoImp implements StudentDaoInter {  
  
    @Override  
    public void saveStudent(Student student) {  
        // TODO Auto-generated method stub  
        HibernateUtils.add(student);  
    }  
  
    @Override  
    public void updateStudent(Student student) {  
        // TODO Auto-generated method stub  
        HibernateUtils.update(student);  
    }  
  
    @Override  
    public void deleteStudent(Student student) {  
        // TODO Auto-generated method stub  
        HibernateUtils.delete(student);  
    }  
  
    @Override  
    public Student findIdStudent(int id) {  
        // TODO Auto-generated method stub  
        return (Student) HibernateUtils.get(Student.class, id);  
    }  
  
    @Override  
    public Student findNameStudent(String name) {  
        // TODO Auto-generated method stub  
        return (Student) HibernateUtils.get(name);  
    }  
  
}  
