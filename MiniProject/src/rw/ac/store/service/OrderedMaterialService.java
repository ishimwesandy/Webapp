/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.ac.store.service;

import java.util.List;
import rw.ac.store.Domain.OrderedMaterial;

/**
 *
 * @author steven
 */
public interface OrderedMaterialService {
     public void createOrderedMaterialDao(OrderedMaterial orde) throws Exception;
    public void UpdateOrderedMaterialDao(OrderedMaterial orde)throws Exception;
    public void deleteOrderedMaterialDao(OrderedMaterial orde)throws Exception;
    public OrderedMaterial getOrderedMaterialDao(int id)throws Exception;
    public List<OrderedMaterial> getAllOrderedMaterialDao()throws Exception;
}
