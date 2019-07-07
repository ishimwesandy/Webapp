/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.ac.store.service;

import java.util.List;
import rw.ac.store.Domain.Category;
import rw.ac.store.dao.CategoryDao;
import rw.ac.store.dao.CategoryDaoImpl;

/**
 *
 * @author steven
 */
public class CategoryServiceImpl implements CategoryService{
  
 //calling  the dao methode
  //CustomerDao ServiceDao= (CustomerDao) new CustomerDaoImpl();
    CategoryDao ServiceDao=new CategoryDaoImpl();

    @Override
    public void createCategory(Category cat) throws Exception {
    
    ServiceDao.createCategory(cat);
    }

    @Override
    public void UpdateCategory(Category cat) throws Exception {
    
    ServiceDao.UpdateCategory(cat);
    }

    @Override
    public void deleteCategory(Category cat) throws Exception {
    ServiceDao.deleteCategory(cat);
    }

    @Override
    public Category getCategory(int id) throws Exception {
   // return ServiceDao.get(Category.class, id);
    return ServiceDao.getCategory(id);
    
    }

    @Override
    public List<Category> getAllCategory() throws Exception {
      //  return ServiceDao.getAllCategory("Category");
        return ServiceDao.getAllCategory();
    }
    
}
