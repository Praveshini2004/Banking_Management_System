package service;

import bean.Account;
import bean.Customer;
import exception.InsufficientFundException;
import exception.InvalidAccountException;
import exception.OverdraftLimitExceededException;
import java.util.List;

public interface IBankServiceProvider {
    
    void addAccount(Account account);
    
    Account findAccountByAccountNumber(String accountNumber) throws InvalidAccountException;
    
    void deposit(String accountNumber, double amount) throws InvalidAccountException;
    
    void withdraw(String accountNumber, double amount) throws InvalidAccountException, InsufficientFundException, OverdraftLimitExceededException;
  
    double getAccountBalance(String accountNumber) throws InvalidAccountException;
    
    void transfer(String fromAccountNumber, String toAccountNumber, double amount) throws InvalidAccountException, InsufficientFundException, OverdraftLimitExceededException;
    
    List<Customer> getAllCustomers();
   
    List<Account> getAllAccounts();
    
    void deleteAccount(String accountNumber) throws InvalidAccountException;
}
