/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.ac.store.service;

import java.util.List;
import rw.ac.store.Domain.Customer;


public interface CustomerService {
     public void createCustomer(Customer cust) throws Exception;
    public void UpdateCustomer(Customer cust)throws Exception;
    public void deleteCustomer(Customer cust)throws Exception;
    public Customer getCustomer(int id)throws Exception;
    public List<Customer> getAllCustomer()throws Exception;
    
}
