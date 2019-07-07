/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.ac.store.dao;

import java.util.List;
import rw.ac.store.Domain.OrderedDetails;
import rw.ac.store.GenericDao.GenericDao;
import rw.ac.store.GenericDao.GenericDaoImpl;

/**
 *
 * @author steven
 */
public class OrderedDetailsDaoImpl implements OrderedDetailsDao{
    GenericDao<OrderedDetails>GeneDao=new GenericDaoImpl<>();

    @Override
    public void createOrderedDetails(OrderedDetails de) throws Exception {
    GeneDao.create(de);
    }

    @Override
    public void UpdateOrderedDetails(OrderedDetails de) throws Exception {
    
    GeneDao.update(de);
    }

    @Override
    public void deleteOrderedDetails(OrderedDetails de) throws Exception {
    
    GeneDao.delete(de);
    }

    @Override
    public OrderedDetails getOrderedDetails(int id) throws Exception {
    
    
    return GeneDao.get(OrderedDetails.class, id);
    }

    @Override
    public List<OrderedDetails> getAllOrderedDetails() throws Exception {
    return GeneDao.getAll("OrderedDetails");
    }

   
}
