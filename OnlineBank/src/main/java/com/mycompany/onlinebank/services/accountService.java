/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.services;

import com.mycompany.onlinebank.model.Account;
import com.mycompany.onlinebank.model.Customer;
import com.mycompany.onlinebank.model.Transaction;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.ws.rs.PathParam;

/**
 *
 * @author Vladislavs Vasiljevs
 */
public class accountService {

    // public static List<Customer> list = new ArrayList<>();
    //public static List<Account> accounts = new ArrayList<>();
    public static boolean init = true;

    customerService service = new customerService();
    transactionService transaction = new transactionService();
    // accountService accountservice = new accountService();

    List<Customer> list = service.getList();
    List<Account> accounts = service.getaccounts();
    List<Transaction> transactions = transaction.getTransactions();

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

    //Default values set,adds them to Account object
    public Account addCurrentAccount(Account c) {
        c.setAccountID(accounts.size() + 1);
        c.setAccountType("Current Account");
        Random rand = new Random();
        int accountNumber = 100000000 + rand.nextInt(900000000);
        c.setAccountNum(accountNumber);
        c.setAccountBalance(0.0);
        c.setSortCode("902121");
        c.setTransaction(transactions);
        accounts.add(c);
        //System.out.println("201 - resource created with path: /candidates/" + String.valueOf(c.getAccountID()));
        return c;
    }

    //Default values set,adds them to Account object
    public Account addSavingsAccount(Account s) {
        s.setAccountID(accounts.size() + 1);
        s.setAccountType("Savings Account");
        Random rand = new Random();
        int accountNumber = 100000000 + rand.nextInt(900000000);
        s.setAccountNum(accountNumber);
        s.setAccountBalance(0.0);
        s.setSortCode("900121");
        s.setTransaction(transactions);
        accounts.add(s);
        //System.out.println("201 - resource created with path: /candidates/" + String.valueOf(s.getAccountID()));
        return s;
    }

//Default values set,adds them to Account object
    public Account addStudentAccount(Account stu) {
        stu.setAccountID(accounts.size() + 1);
        stu.setAccountType("Student Account");
        Random rand = new Random();
        int accountNumber = 100000000 + rand.nextInt(900000000);
        stu.setAccountNum(accountNumber);
        stu.setAccountBalance(0.0);
        stu.setSortCode("900121");
        stu.setTransaction(transactions);
        accounts.add(stu);
        //System.out.println("201 - resource created with path: /candidates/" + String.valueOf(stu.getAccountID()));
        return stu;
    }
    
    
    public List<Account> getAccountBalance(int accountNumber) {
        List<Account> matcheslist = new ArrayList<>();
        
        for (Account q: getAllAccounts()) {
            if ((q.getAccountNum()== accountNumber)) {
                   
               matcheslist.add(q);
        }
            }
        return matcheslist;
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
