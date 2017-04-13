package com.undergrowth;  
  
import java.util.Date;
public class Student {  
    private int id;    
    public int getId() {  
        return id;  
    }  

    public void setId(int id) {  
        this.id = id;  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public Date getBirthday() {  
        return birthday;  
    }  
    public void setBirthday(Date birthday) {  
        this.birthday = birthday;  
    }  
    public String getMajor() {  
        return major;  
    }  
    public void setMajor(String major) {  
        this.major = major;  
    }  
    private String name;  
    private Date birthday;  
    private String major;  
    public Student(String name, Date birthday, String major) {  
        this.name = name;  
        this.birthday = birthday;  
        this.major = major;  
    }  
      
    public Student(){}  //用于给hibernate的反射使用  
    @Override  
    public String toString() {  
        return "Student [id=" + id + ", name=" + name + ", birthday="  
                + birthday + ", major=" + major + "]";  
    }  
      
      
}  