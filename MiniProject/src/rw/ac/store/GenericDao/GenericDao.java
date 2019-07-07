
package rw.ac.store.GenericDao;

import java.io.Serializable;
import java.util.List;


public interface GenericDao<T extends Serializable>{
   
    public void create(T x); 

    public List<T> getAll(String tableName);
     public T get(Class<T> t,int id) ;
    public void delete(T x); 
       
    public void update(T x); 
    
 
    
    
    
}
