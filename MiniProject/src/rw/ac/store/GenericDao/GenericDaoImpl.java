/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.ac.store.GenericDao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import rw.ac.store.util.HibernateUtil;

/**
 *
 * @author steven
 * @param <T>
 */
public class GenericDaoImpl<T extends Serializable> implements GenericDao<T>{

 
    @Override
    public void create(T x) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(x);
        session.getTransaction().commit();
        session.close();  
    }
          

    @Override
    public List<T> getAll(String tableName) {
    
    Session session=HibernateUtil.getSessionFactory().openSession();
List<T> All =session.createQuery("from "+tableName).list();
    session.clear();
    return All;
    }
      
    @Override
 public T get(Class<T> t,int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        //This is method is used for getting a single element using it primary key 
        T s = (T)session.get(t,id );
        session.close();
        return s;
    }
    @Override
    public void delete(T x){
//        Session ss = HibernateUtil.getSessionFactory().openSession(); 
//        //This is to create a transaction to allow query and commit it;
//        Transaction tx = ss.beginTransaction();
//        //This is the actual delete the any row you want
//        //Query query=session.createQuery("delete from Emp where id=100");  
//     Criteria q =ss.createCriteria("delete from x where id= :id");
//       // Query query = ss.createQuery( x);
//        //query.executeUpdate();
//        //This is to commit the change made
//        ss.update(q);
//        tx.commit();
//        //This is to close the connection
//        ss.close();
////        String deleteQuery = "delete from students where joinDate= :joinDate";
////      Query query = session.createQuery(deleteQuery);
////      query.setString("joinDate", "2014-03-08"); //convert date from string
////      query.executeUpdate()

Session ss = HibernateUtil.getSessionFactory().openSession(); 
        //This is to create a transaction to allow query and commit it;
        Transaction tx = ss.beginTransaction();
        //This is the actual delete the faculty
        ss.delete(x);
        //This is to commit the change made
        tx.commit();
        //This is to close the connection
        ss.close();

        
        
    }
       
    @Override
    public void update(T x){
         Session ss = HibernateUtil.getSessionFactory().openSession(); 
        //This is to create a transaction to allow query and commit it;
        Transaction tx = ss.beginTransaction();
        //This is the actual update the select ed row
        ss.update(x);
        
           
        //This is to commit the change made
        tx.commit();
     
        //This is to close the connection
        ss.close();
    }
 
    
    
                
                
    
}
