/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.ac.store.dao;

import java.util.List;
import rw.ac.store.Domain.Euser;
import rw.ac.store.Domain.OrderedMaterial;
import rw.ac.store.GenericDao.GenericDao;
import rw.ac.store.GenericDao.GenericDaoImpl;

/**
 *
 * @author steven
 */
public class OrderedMaterialDaoImpl implements OrderedMaterialDao{
GenericDao<OrderedMaterial> GeneDao = new GenericDaoImpl<>();

    @Override
    public void createOrderedMaterialDao(OrderedMaterial orde) throws Exception {
    
    GeneDao.create(orde);
    }

    @Override
    public void UpdateOrderedMaterialDao(OrderedMaterial orde) throws Exception {
      GeneDao.update(orde);
    
    }

    @Override
    public void deleteOrderedMaterialDao(OrderedMaterial orde) throws Exception {
    
      GeneDao.delete(orde);
    }

    @Override
    public OrderedMaterial getOrderedMaterialDao(int id) throws Exception {
       
    return GeneDao.get(OrderedMaterial.class, id);
    }

    @Override
    public List<OrderedMaterial> getAllOrderedMaterialDao() throws Exception {
    
    return GeneDao.getAll("OrderedMaterial");
    }      

    
}
