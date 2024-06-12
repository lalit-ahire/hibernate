package com.demo;

import com.model.Employee;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        
    	  Configuration con=new Configuration().configure();
          SessionFactory sf=con.buildSessionFactory();
          Session session=sf.openSession();
          Transaction tx= session.beginTransaction();
          Employee e= new Employee();
          e.setEname("rishbh dube");
          e.setEcompany("tcs");
          e.setEdesignation("ui developer");
          e.setEsalary(18000);
          session.save(e);   
          tx.commit();
          session.close();
      
    }
}
