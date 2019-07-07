
package rw.ac.store.dao;

import java.util.List;
import rw.ac.store.Domain.OrderedMaterial;


public interface OrderedMaterialDao{
    public void createOrderedMaterialDao(OrderedMaterial orde) throws Exception;
    public void UpdateOrderedMaterialDao(OrderedMaterial orde)throws Exception;
    public void deleteOrderedMaterialDao(OrderedMaterial orde)throws Exception;
    public OrderedMaterial getOrderedMaterialDao(int id)throws Exception;
    public List<OrderedMaterial> getAllOrderedMaterialDao()throws Exception;
    
    
}
