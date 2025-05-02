package service;

import bean.Customer;
import dao.BankRepositoryImpl;
import dao.IBankRepository;

import java.util.List;

public class CustomerServiceProviderImpl implements ICustomerServiceProvider {

    private IBankRepository bankRepository;

    
    public CustomerServiceProviderImpl() {
        this.bankRepository = new BankRepositoryImpl();  
    }

    @Override
    public void addCustomer(Customer customer) {
        try {
            bankRepository.addCustomer(customer); 
        } catch (Exception e) {
            System.out.println("Error occurred while adding customer: " + e.getMessage());
        }
    }

    @Override
    public Customer findCustomerById(int customerId) {
        try {
            return bankRepository.findCustomerById(customerId);  
        } catch (Exception e) {
            System.out.println("Error occurred while finding customer: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Customer> getAllCustomers() {
        try {
            return bankRepository.getAllCustomers();  
        } catch (Exception e) {
            System.out.println("Error occurred while retrieving customers: " + e.getMessage());
            return null;
        }
    }

    @Override
    public void updateCustomer(Customer customer) {
        try {
            bankRepository.updateCustomer(customer);  
        } catch (Exception e) {
            System.out.println("Error occurred while updating customer: " + e.getMessage());
        }
    }

    @Override
    public void deleteCustomer(int customerId) {
        try {
            bankRepository.deleteCustomer(customerId);  
        } catch (Exception e) {
            System.out.println("Error occurred while deleting customer: " + e.getMessage());
        }
    }
}
