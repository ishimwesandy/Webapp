
package rw.ac.store.dao;

import java.util.List;
import rw.ac.store.Domain.Product;
import rw.ac.store.GenericDao.GenericDao;
import rw.ac.store.GenericDao.GenericDaoImpl;


public abstract class ProductDaoImpl implements ProductDAo{
 private final GenericDao<Product> GeneDao = new GenericDaoImpl<>();
    @Override
    public void createProduct(Product pro) throws Exception {
        GeneDao.create(pro);
       
            }

    @Override
    public void deleteProduct(Product pro) throws Exception {
    GeneDao.update(pro);
    }
    @Override
    public void UpdateProduct(Product pro) throws Exception {
    GeneDao.delete(pro);
    }

    @Override
    public List<Product> getAllProducts() throws Exception {
        return GeneDao.getAll("Product");
    
    }

    @Override
    public Product getProduct(int id) throws Exception {
    
    return GeneDao.get(Product.class, id);
     
    }
    
}
