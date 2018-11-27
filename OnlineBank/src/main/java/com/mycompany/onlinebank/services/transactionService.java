/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.services;

import com.mycompany.onlinebank.model.Account;
import com.mycompany.onlinebank.model.Transaction;
import static com.mycompany.onlinebank.services.transactionService.transaction;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paul
 */
public class transactionService {

    public static List<Transaction> transaction = new ArrayList<>();
    CustomerService service = new CustomerService();
     List<Account> accounts = service.getaccounts();
    

    public List<Transaction> getTransactions() {
        return transaction;
    }

//    public List<Account> getAccounts(){
//        return accounts;
//    }
    public static boolean init = true;

    public transactionService() {
        if (init) {
            Transaction t1 = new Transaction("Credit", "Re-Payed Loan", 10.20);
//            };
//            Transaction t2 = new Transaction("Debit", "Wages", 30.20) {
//            };
//
            transaction.add(t1);
//            transaction.add(t2);
//
            init = false;
            
        }
        //return t;
    }

    public  Account makeLodgement(Account lodgement ) {
        if(lodgement.getAccountID() <=0){
            return null;
        }
        //double accountBalance = lodgement.getAccountBalance();     
        lodgement.setTransaction(transaction);
        accounts.add(lodgement.getAccountID(),lodgement);
        
//        //double accountBalance = lodgement.getAccountBalance();
//        //userBalance = 0.0;
//        //lodgement.setAccountBalance(userBalance + accountBalance);
//        Double balance = lodgement.getAccountBalance();
//        lodgement.setAccountBalance(balance + 20.0);
//             lodgement.setAccountID(accounts.size() + 1);
//        lodgement.setAccountType("Student Account");
//        Random rand = new Random();
//        int accountNumber = 100000000 + rand.nextInt(900000000);
//        lodgement.setAccountNum(accountNumber);
//        lodgement.setSortCode("900121");
//        lodgement.getTransaction();
//        //lodgement.getAccountBalance();
//        accounts.add(lodgement);
        //System.out.println("201 - resource created with path: /candidates/" + String.valueOf(s.getAccountID()));
        return lodgement;
    }
}
