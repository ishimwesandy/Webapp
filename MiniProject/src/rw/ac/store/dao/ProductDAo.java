
package rw.ac.store.dao;


import java.util.List;
import rw.ac.store.Domain.Product;
import rw.ac.store.GenericDao.GenericDao;


public interface ProductDAo extends GenericDao<Product>{
    
    public void createProduct(Product pro) throws Exception;
    public void deleteProduct(Product pro)throws Exception;
     public void UpdateProduct(Product pro)throws Exception;
     public List <Product> getAllProducts() throws Exception;
     public Product getProduct (int id)throws Exception;
      
}
