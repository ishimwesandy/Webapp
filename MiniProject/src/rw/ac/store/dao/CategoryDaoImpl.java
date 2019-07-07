
package rw.ac.store.dao;

import java.util.List;
import rw.ac.store.Domain.Category;
import rw.ac.store.GenericDao.GenericDao;
import rw.ac.store.GenericDao.GenericDaoImpl;

/**
 *
 * @author steven
 */
public  class CategoryDaoImpl implements CategoryDao{
  //calling generic dao
          GenericDao<Category> GeneDao = new GenericDaoImpl<>();
    @Override
    
    public void createCategory(Category cat) throws Exception {
   GeneDao.create(cat);
    }

    @Override
    public void UpdateCategory(Category cat) throws Exception {
    GeneDao.update(cat);
    }

    @Override
    public void deleteCategory(Category cat) throws Exception {
    
    GeneDao.delete(cat);
    }

    @Override
    public Category getCategory(int id) throws Exception {
    return GeneDao.get(Category.class, id);
    }

    @Override
    public List<Category> getAllCategory() throws Exception {
       return GeneDao.getAll("Category");
       
    
    }

    
    

    
    
    
}
