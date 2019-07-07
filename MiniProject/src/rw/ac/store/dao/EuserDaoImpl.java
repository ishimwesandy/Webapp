
package rw.ac.store.dao;

import java.util.List;
import rw.ac.store.Domain.Euser;
import rw.ac.store.GenericDao.GenericDao;
import rw.ac.store.GenericDao.GenericDaoImpl;


public abstract class EuserDaoImpl implements EuserDao{
    GenericDao<Euser>gdao=new GenericDaoImpl<>();
    @Override
    public void createEuser(Euser us) throws Exception {
        gdao.create(us);
    
    }

    @Override
    public void UpdateEuser(Euser us) throws Exception {
    
    gdao.update(us);
    }
    @Override
    public void deleteEuser(Euser us) throws Exception {
   gdao.delete(us);
    
    }
    @Override
    public Euser getEuser(int id) throws Exception {
    return gdao.get(Euser.class, id);
    
    }

    @Override
    public List<Euser> getAllEuser() throws Exception {
    return gdao.getAll("Euser");
    }

    
}
