
package rw.ac.store.service;

import java.util.List;
import rw.ac.store.Domain.Product;


public interface ProductService {
    
 public void createProduct(Product pro) throws Exception;
    public void deleteProduct(Product pro)throws Exception;
     public void UpdateProduct(Product pro)throws Exception;
     public List <Product> getAllProducts() throws Exception;
     public Product getProduct (int id)throws Exception;


}
