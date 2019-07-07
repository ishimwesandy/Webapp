/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.ac.store.dao;

import java.util.List;
import rw.ac.store.Domain.OrderedDetails;

/**
 *
 * @author steven
 */
public interface OrderedDetailsDao {
    
     public void createOrderedDetails(OrderedDetails de) throws Exception;
    public void UpdateOrderedDetails(OrderedDetails de)throws Exception;
    public void deleteOrderedDetails(OrderedDetails de)throws Exception;
    public OrderedDetails getOrderedDetails(int id)throws Exception;
    public List<OrderedDetails> getAllOrderedDetails()throws Exception;
    
}
