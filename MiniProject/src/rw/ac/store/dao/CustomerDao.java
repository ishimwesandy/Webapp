
package rw.ac.store.dao;

import java.util.List;
import rw.ac.store.Domain.Customer;
import rw.ac.store.GenericDao.GenericDao;


public interface CustomerDao  extends GenericDao<Customer>{
  
    public void createCustomer(Customer cust) throws Exception;
    public void UpdateCustomer(Customer cust)throws Exception;
    public void deleteCustomer(Customer cust)throws Exception;
    public Customer getCustomer(int id)throws Exception;
    public List<Customer> getAllCustomer()throws Exception;
    
}
