
package rw.ac.store.service;

import java.util.List;
import rw.ac.store.Domain.Category;
import rw.ac.store.Domain.Euser;


public interface EuserService {
     public void createEuser(Euser us) throws Exception;
    public void UpdateEuser(Euser us)throws Exception;
    public void deleteEuser(Euser us)throws Exception;
    public Euser getEuser(int id)throws Exception;
    public List<Euser> getAllEuser()throws Exception;
    
}
