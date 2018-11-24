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
import java.util.Random;

/**
 *
 * @author Vladislavs Vasiljevs
 */
public class accountService {

    // public static List<Customer> list = new ArrayList<>();
    //public static List<Account> accounts = new ArrayList<>();
    public static boolean init = true;

    CustomerService service = new CustomerService();
    // accountService accountservice = new accountService();

    List<Customer> list = service.getList();
    List<Account> accounts = service.getaccounts();

    public accountService() {
        if (init) {

            init = false;
        }
    }

    //Getting Accounts by ID
    public Account getAccountsByID(int id) {
        return accounts.get(id - 1);
    }

    //Getting All accounts
    public List<Account> getAllAccounts() {
        return accounts;
    }
    
     public Account addCurrentAccount(Account c){
        c.setAccountID(list.size() + 1);
        c.setAccountType("currentAccount");
         Random rand = new Random();
        int accountNumber = 100000000 + rand.nextInt(900000000);
        c.setAccountNum(accountNumber);
        c.setAccountBalance(0.0);
	accounts.add(c);
	System.out.println("201 - resource created with path: /candidates/" + String.valueOf(c.getAccountID()));
	return c;
    }

//    public Customer getCustoemrByID(int id) {
//        return list.get(id - 1);
//    }

//    public Account getAccountsInCustomers(int CustomerID, int accountID) {
//        Account p = new Account();
//
//        for (Account q : getCustoemrByID(CustomerID).getAccounts()) {
//            if (q.getAccountID() == accountID) {
//                p = q;
//            }
//        }
//        return p;
//    }
}
