/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.ac.store.GenericDao;

import org.hibernate.Session;
import rw.ac.store.util.HibernateUtil;

/**
 *
 * @author steven
 * @param <T>
 */
public class GenericDao1 <T>{
        public void create(T x){
    
    Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(x);
        session.getTransaction().commit();
        session.close();  
    
}}
