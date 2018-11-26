/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.services;

import com.mycompany.onlinebank.model.Transaction;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Paul
 */
public class transactionService {
    public static List<Transaction> transaction = new ArrayList<>();
    
    public List<Transaction> getTransaction() {
        return transaction;
    }
    
//    public List<Account> getAccounts(){
//        return accounts;
//    }
    public static boolean init = true;
     public transactionService() {
         if(init){
          Transaction t1 = new Transaction( "Credit", "Re-Payed Loan", 10.20) {};
          Transaction t2 = new Transaction( "Debit", "Wages", 30.20) {};
          Transaction t3 = new Transaction( "Savings", "Wages", 40.20) {};


        transaction.add(t1);
        transaction.add(t2);
        transaction.add(t3);
        init = false;
         }
        //return t;
    }
}


