package service;

import bean.Customer;
import java.util.List;

public interface ICustomerServiceProvider {
    
    void addCustomer(Customer customer);
    
    Customer findCustomerById(int customerId);
    
    List<Customer> getAllCustomers();
    
    void updateCustomer(Customer customer);
    
    void deleteCustomer(int customerId);
}
