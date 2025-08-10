package com.wipro.hibernate.hibernatedemo.repo;

import java.util.Scanner;
import java.util.List;


import com.wipro.hibernate.hibernatedemo.entity.Pan;
import com.wipro.hibernate.hibernatedemo.util.HibernateUtil;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class PanRepo {
	public static void updatePan()
    {
    	
    	Scanner sc= new Scanner(System.in); 
    	
    	System.out.println("Please enter Pan id");
    	int id= sc.nextInt();
    	
    	System.out.println("Please enter pan holder name");
    	String panHolderName= sc.next();
    	
    	System.out.println("Please enter pan number");
    	String panNumber= sc.next();
    	
    	
    	Pan m= new Pan(id, panHolderName, panNumber);
    	save(m);
    }
    
 public static void createPan()
    {
    	Scanner sc= new Scanner(System.in); 
    	
    	System.out.println("Please enter Pan Holder name");
    	String  panHolderName= sc.next();
    	
    	System.out.println("Please enter Pan number");
    	String panNumber= sc.next();
    	

    	Pan m= new Pan(panHolderName, panNumber);
    	save(m);
    	   	
    }
 
 
//insert and update
 public static void save(Pan m)
    {
    	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
    	Transaction transaction=session.beginTransaction();
    	
    	if(m.getId()!=0)//update
    	{
    		Pan m1 = findById(m.getId());
    		m1.setPanHolderName(m.getPanHolderName());
    		m1.setPanNumber(m.getPanNumber());
    		session.persist(m1);
    	}
    	else {//insert
    	   	session.persist(m);
    	}
    	transaction.commit();     	
    	
    }
    
    	
	 public static Pan findById(int id)
	 {
	  	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
	 	Transaction transaction=session.beginTransaction();
	 	Pan m=session.find(Pan.class, id);
	 	return m;
	 	
	 }
	
	public static Pan deleteById(int id)
	 {
	  	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		    	Transaction transaction=session.beginTransaction();
		    	Pan m=session.find(Pan.class, id);
		    	session.remove(m);
		    	transaction.commit();
		    	return m;
	 	
	 }
			
    
	 public static List<Pan> findAll()
	    {
	    	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
	    	Transaction transaction=session.beginTransaction();
	    	//sql=>db tables
	    	//hql->java entities
	    	String hqlQuery="from Pan";//select * from movie
	    	Query query=session.createQuery(hqlQuery);
	    	List<Pan> list=query.list();
	    	return list;
	    	
	    	
	    	
	    }
    
	 public static List<String> findAllPanHolderName()
	    {
	    	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
	    	Transaction transaction=session.beginTransaction();
	    	//sql=>db tables
	    	//hql->java entities
	    	String hqlQuery="SELECT panHolderName from Pan";//select movie_name from movie
	    	Query query=session.createQuery(hqlQuery);
	    	List<String> list=query.list();
	    	return list;   	
	    	
	    	
	    }
	    
	 public static List<Pan> findByPanNumber(String panNumber) {
		    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		    Transaction transaction = session.beginTransaction();
		    
		    String hqlQuery = "from Pan where panNumber = :panNumberParam";
		    Query<Pan> query = session.createQuery(hqlQuery, Pan.class);
		    query.setParameter("panNumberParam", panNumber);
		    
		    List<Pan> list = query.list();
		    transaction.commit();
		    return list;
		}
}
