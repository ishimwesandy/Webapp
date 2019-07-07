
package rw.ac.store.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import rw.ac.store.Domain.Category;
import rw.ac.store.Domain.Customer;
import rw.ac.store.Domain.Euser;
import rw.ac.store.Domain.Person;
import rw.ac.store.util.HibernateUtil;










public class Mainclass {
    
    
    
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory().openSession();
//       Person p=new Person();
//        Customer c=new Customer();
//        Category cat=new Category();
//        cat.setCat_id("CAT0090");
//        cat.setName("Phoneee");
//        c.setEmail("sadd@gff");
//        c.setAddress("muganvbza");
//        c.setLname("sandvv");
//        c.setFname("ishivvmwe");
//c.setPhone("0877887987r");
//        Euser us=new Euser();
//       
//        us.setEmail("sadd@ffggh");
//        us.setName("mukama");
//        us.setPass("d2344");
//        us.setUname("sando");
//         us.setPhone("0879788787"); 
//         us.setuType("user");
//        SessionFactory ss=new Configuration().configure().buildSessionFactory();
//    Session sss=ss.openSession();
//    sss.beginTransaction();
//    sss.save(c);
//    sss.save(cat);
//  
//    sss.save(us);
//     sss.save(p);
//    sss.getTransaction().commit();
//    sss.close();
    }

}