
package rw.ac.store.service;

import java.util.List;
import rw.ac.store.Domain.Category;
import rw.ac.store.Domain.Euser;
import rw.ac.store.GenericDao.GenericDao;
import rw.ac.store.GenericDao.GenericDaoImpl;


public class EuserServiceImpl implements EuserService{
private final GenericDao<Euser> ServiceDao = new GenericDaoImpl<>();
    @Override
    public void createEuser(Euser us) throws Exception {
         ServiceDao.create(us);
    }

    @Override
    public void UpdateEuser(Euser us) throws Exception {
    ServiceDao.update(us);
    }

    @Override
    public void deleteEuser(Euser us) throws Exception {
    ServiceDao.delete(us);
    }

@Override
    public Euser getEuser(int id) throws Exception {
   return ServiceDao.get(Euser.class, id);
    
    }

    @Override
    public List<Euser> getAllEuser() throws Exception {
    return ServiceDao.getAll("Euser");
    
    }
    
}
