/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.ac.store.service;

import java.util.List;
import rw.ac.store.Domain.OrderedDetails;
import rw.ac.store.dao.OrderedDetailsDao;
import rw.ac.store.dao.OrderedDetailsDaoImpl;

/**
 *
 * @author steven
 */
public class OrderedDetailsServiceImpl implements OrderedDetailsService{
    OrderedDetailsDao ServiceDao=new OrderedDetailsDaoImpl();

    @Override
    public void createOrderedDetails(OrderedDetails de) throws Exception {
    ServiceDao.createOrderedDetails(de);
    
    }

    @Override
    public void UpdateOrderedDetails(OrderedDetails de) throws Exception {
    ServiceDao.UpdateOrderedDetails(de);
    }

    @Override
    public void deleteOrderedDetails(OrderedDetails de) throws Exception {
    ServiceDao.deleteOrderedDetails(de);
    }

    @Override
    public OrderedDetails getOrderedDetails(int id) throws Exception {
    
    return ServiceDao.getOrderedDetails(id);
    }

    @Override
    public List<OrderedDetails> getAllOrderedDetails() throws Exception {
    
    return ServiceDao.getAllOrderedDetails();
    }
    
}
