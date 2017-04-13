package com.undergrowth.hibernate.utils; 
  
import java.io.Serializable;  
  
  
  
import org.hibernate.HibernateException;  
import org.hibernate.Query;  
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
  
public class HibernateUtils {  
    private static SessionFactory sf;  
      
    static{  
        Configuration cfg=new Configuration();  
        cfg.configure();  
        sf= cfg.buildSessionFactory();  
    }  
      
    public static Session getSession()  
    {  
        return sf.openSession();  
    }  
      
    public static void add(Object entity)  
    {  
        Session session=null;  
        Transaction tx=null;  
        try {  
            session=HibernateUtils.getSession();  
            tx=session.beginTransaction();  
            session.save(entity);  
            tx.commit();  
        } catch (HibernateException e) {  
            throw e;  
        }finally{  
            if(session!=null)  
                session.close();  
        }  
    }  
      
    public static void delete(Object entity)  
    {  
        Session session=null;  
        Transaction tx=null;  
        try {  
            session=HibernateUtils.getSession();  
            tx=session.beginTransaction();  
            session.delete(entity);  
            tx.commit();  
        } catch (HibernateException e) {  
            throw e;  
        }finally{  
            if(session!=null)  
                session.close();  
        }  
    }  
      
    public static void update(Object entity)  
    {  
        Session session=null;  
        Transaction tx=null;  
        try {  
            session=HibernateUtils.getSession();  
            tx=session.beginTransaction();  
            session.update(entity);  
            tx.commit();  
        } catch (HibernateException e) {  
            throw e;  
        }finally{  
            if(session!=null)  
                session.close();  
        }  
    }  
      
      
    public static Object get(Class clazz,Serializable id)  
    {  
        Session session=null;  
        try {  
            session=HibernateUtils.getSession();  
            Object obj=session.get(clazz, id);  
            return obj;  
        } catch (HibernateException e) {  
            throw e;  
        }finally{  
            if(session!=null)  
                session.close();  
        }  
    }  
      
    public static Object get(String name)  
    {  
        Session session=null;  
        try {  
            session=HibernateUtils.getSession();  
            Query query=session.createQuery("from Student as student where name=:name");  
            query.setParameter("name", name);  
            Object obj=query.uniqueResult();  
            return obj;  
        } catch (HibernateException e) {  
            throw e;  
        }finally{  
            if(session!=null)  
                session.close();  
        }  
    }  
}  