/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.ac.store.dao;

import java.util.List;
import rw.ac.store.Domain.Euser;
import rw.ac.store.GenericDao.GenericDao;


public interface EuserDao extends GenericDao<Euser>{
    public void createEuser(Euser us) throws Exception;
    public void UpdateEuser(Euser us)throws Exception;
    public void deleteEuser(Euser us)throws Exception;
    public Euser getEuser(int id)throws Exception;
    public List<Euser> getAllEuser()throws Exception;
    
}
