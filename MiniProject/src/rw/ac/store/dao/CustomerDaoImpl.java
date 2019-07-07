
package rw.ac.store.dao;

import java.util.List;
import rw.ac.store.Domain.Customer;
import rw.ac.store.GenericDao.GenericDao;
import rw.ac.store.GenericDao.GenericDaoImpl;


public abstract class CustomerDaoImpl implements CustomerDao{
 GenericDao<Customer> GeneDao = new GenericDaoImpl<>();
    @Override
    public void createCustomer(Customer cust) throws Exception {
        GeneDao.create(cust);
    }

    @Override
    public void UpdateCustomer(Customer cust) throws Exception {
    GeneDao.update(cust);
    }

    @Override
    public void deleteCustomer(Customer cust) throws Exception {
    GeneDao.delete(cust);
    }
    @Override
    public Customer getCustomer(int id) throws Exception {
       return GeneDao.get(Customer.class, id);
    }

    @Override
    public List<Customer> getAllCustomer() throws Exception {
    return GeneDao.getAll("Customer");
    
    }

   
    
}
