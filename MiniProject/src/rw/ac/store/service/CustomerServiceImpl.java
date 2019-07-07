
package rw.ac.store.service;

import java.util.List;
import rw.ac.store.Domain.Customer;
import rw.ac.store.GenericDao.GenericDao;
import rw.ac.store.GenericDao.GenericDaoImpl;


public class CustomerServiceImpl  implements CustomerService{
       private final GenericDao<Customer> ServiceDao = new GenericDaoImpl<>();
    @Override
    public void createCustomer(Customer cust) throws Exception {
      ServiceDao.create(cust);
    }

    @Override
    public void UpdateCustomer(Customer cust) throws Exception {
    ServiceDao.update(cust);
    
    }

    @Override
    public void deleteCustomer(Customer cust) throws Exception {
    ServiceDao.delete(cust);
    }
    @Override
    public Customer getCustomer(int id) throws Exception {
       return ServiceDao.get(Customer.class, id);
    }

    @Override
    public List<Customer> getAllCustomer() throws Exception {
    return ServiceDao.getAll("Customer");
    
    }
    
}
