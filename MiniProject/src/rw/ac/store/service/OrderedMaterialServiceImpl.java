/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.ac.store.service;

import java.util.List;
import rw.ac.store.Domain.OrderedMaterial;
import rw.ac.store.dao.OrderedMaterialDao;
import rw.ac.store.dao.OrderedMaterialDaoImpl;

/**
 *
 * @author steven
 */
public class OrderedMaterialServiceImpl implements OrderedMaterialService{
    OrderedMaterialDao ServiceDao= new OrderedMaterialDaoImpl();
    @Override
    public void createOrderedMaterialDao(OrderedMaterial orde) throws Exception {
    
    ServiceDao.createOrderedMaterialDao(orde);
    
    }

    @Override
    public void UpdateOrderedMaterialDao(OrderedMaterial orde) throws Exception {
    
    ServiceDao.UpdateOrderedMaterialDao(orde);
    }

    @Override
    public void deleteOrderedMaterialDao(OrderedMaterial orde) throws Exception {
    ServiceDao.deleteOrderedMaterialDao(orde);
    }

    @Override
    public OrderedMaterial getOrderedMaterialDao(int id) throws Exception {
    return ServiceDao.getOrderedMaterialDao(id);
    
    }

    @Override
    public List<OrderedMaterial> getAllOrderedMaterialDao() throws Exception {
    
    return ServiceDao.getAllOrderedMaterialDao();
    }
    
}
