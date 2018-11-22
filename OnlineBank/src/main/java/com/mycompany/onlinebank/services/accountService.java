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

/**
 *
 * @author Vladislavs Vasiljevs
 */
public class accountService {

   // public static List<Customer> list = new ArrayList<>();
    //public static List<Account> accounts = new ArrayList<>();
    public static boolean init = true;
    
    CustomerService servie = new CustomerService();
    
    List<Customer> list = servie.getList();
    List<Account> accounts = servie.getaccounts();

    public accountService() {
        if (init) {

            init = false;
        }
    }

    //Getting Accounts by ID
    public Account getAccountsByID(int id) {
        return accounts.get(id - 1);
    }

    public Customer getCustoemrByID(int id) {
        return list.get(id - 1);
    }

    public Account getAccountsInCustomers(int CustomerID, int accountID) {
        Account p = new Account();

        for (Account q : getCustoemrByID(CustomerID).getAccounts()) {
            if (q.getAccountID() == accountID) {
                p = q;
            }
        }
        return p;
    }
}
