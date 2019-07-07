/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.ac.store.service;

import java.util.List;
import rw.ac.store.Domain.Category;

/**
 *
 * @author steven
 */
public interface CategoryService  {
     public void createCategory(Category cat) throws Exception;
    public void UpdateCategory(Category cat)throws Exception;
    public void deleteCategory(Category cat)throws Exception;
    public Category getCategory(int id)throws Exception;
    public List<Category> getAllCategory()throws Exception;
    
    
    
    
    
    
}
