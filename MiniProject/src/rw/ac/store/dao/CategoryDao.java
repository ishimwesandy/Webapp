
package rw.ac.store.dao;

import java.util.List;
import rw.ac.store.Domain.Category;

public interface CategoryDao {
    
    
    public void createCategory(Category cat) throws Exception;
    public void UpdateCategory(Category cat)throws Exception;
    public void deleteCategory(Category cat)throws Exception;
    public Category getCategory(int id)throws Exception;
    public List<Category> getAllCategory()throws Exception;
    
    
    
    
}
