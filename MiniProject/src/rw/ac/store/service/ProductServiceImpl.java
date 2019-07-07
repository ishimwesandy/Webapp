
package rw.ac.store.service;

import java.util.List;
import rw.ac.store.Domain.Product;
import rw.ac.store.GenericDao.GenericDao;
import rw.ac.store.GenericDao.GenericDaoImpl;

/**
 *
 * @author steven
 */
public class ProductServiceImpl  implements ProductService{

    private final GenericDao<Product> ServiceDao = new GenericDaoImpl<>();
    @Override
    public void createProduct(Product pro) throws Exception {
           ServiceDao.create(pro);


    }

    @Override
    public void deleteProduct(Product pro) throws Exception {
    
    ServiceDao.delete(pro);
    }

    @Override
    public void UpdateProduct(Product pro) throws Exception {
ServiceDao.update(pro);
    }
    @Override
    public List<Product> getAllProducts() throws Exception {
      return ServiceDao.getAll("Product");
    
    
    }

    @Override
    public Product getProduct(int id) throws Exception {
    
    return ServiceDao.get( Product.class, id);
    }
    
}
