package com.undergrowth.inter;  
  
import com.undergrowth.Student;  
  
public interface StudentDaoInter {  
      public void saveStudent(Student student);  
      public void updateStudent(Student student);  
      public void deleteStudent(Student student);  
      public Student findIdStudent(int id);  
      public Student findNameStudent(String name);  
} 