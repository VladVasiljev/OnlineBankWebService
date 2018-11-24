/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.services;

import com.mycompany.onlinebank.model.Account;
import com.mycompany.onlinebank.model.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
	public static List<Customer> list = new ArrayList<>();
	public static List<Account> accounts = new ArrayList<>();
        public static boolean init = true;
        
        public List<Customer> getCustomer(){
        return list;
    }
        
            public List<Account> getAccounts(){
        return accounts;
    }
	
	
    public CustomerService() {
    	if (init) {
    		
    		

    		Customer c1 = new Customer(1,"Paul Kinsella","pkinsella@gmail.com", "Dublin","12345", accounts  );
    		Customer c2 = new Customer(2,"Vlad Vladerson","vlad@gmail.com", "Dublin","12345",  accounts );        
    		Customer c3 = new Customer(3,"Liam Delaney","liam@gmail.com", "Dublin","12345", accounts );
    		Customer c4 = new Customer(4,"Patricia Dunne","dun@gmail.com", "Cork", "12345", accounts );
    		Customer c5 = new Customer(5,"John Barnes","john@gmail.com", "Galway","12345",  accounts );
    		Customer c6 = new Customer(6,"John Lyod","lyod@gmail.com", "Kerry", "12345", accounts );

    		list.add(c1);
    		list.add(c2);
    		list.add(c3);
    		list.add(c4);
    		list.add(c5);
    		list.add(c6);
    		
                
                Account a1 = new Account (1, "Personal Account" ,12345, 1.3200);
    		Account a2 = new Account (2, "Current Account" ,678910, 2.4310);
    		Account a3 = new Account (3, "Joint Account", 111211, 3.5461);
    		

    		accounts.add(a1);
    		accounts.add(a2);
    		accounts.add(a3);
                init = false;
    	}

	}
    
    
      public List<Customer> getList() {
       return list;
   }
      
       public List<Account> getaccounts() {
       return accounts;
   }
    public List<Customer> getAllCustomers() {
    	return list;
    }
    
    public List<Customer> getSearchCustomers(String email, String city, String name) {
        List<Customer> matcheslist = new ArrayList<>();
        
        for (Customer q: getAllCustomers()) {
            if ((email == null || q.getEmail().equals(email)) 
            		&& (city == null || q.getAddress().equals(city))
            		&& (name == null || q.getName().equals(name))) {
               matcheslist.add(q);
            }
        }
        return matcheslist;
    }
        
    public List<Customer> getAllCustomersPaginated(int start, int size) {
    	if (start-1 + size > list.size()) return new ArrayList<>();
    	return list.subList(start-1, start-1 + size);
    }
    
   
    
    public Customer getCustomer(int id) {
        return list.get(id-1);
    }
    
    public Account getAccountInCustomer(int id, int accountID) {
        Account p = new Account();
        
        for (Account q: getCustomer(id).getAccounts()) {
        	if (q.getAccountID() == accountID) {
        		p = q;
        	}
        }
        return p;
    }
    
//    public Customer createCustomer(Customer c) {
//	c.setCustomerID(list.size() + 1);
//	list.add(c);
//	System.out.println("201 - resource created with path: /customers/" + String.valueOf(c.getCustomerID()));
//	return c;
//    }

}
