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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Paul
 */
public class transactionService {

    public static List<Transaction> transaction = new ArrayList<>();
    customerService service = new customerService();
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
            //Transaction t1 = new Transaction("Credit", "Re-Payed Loan", 10.20);
//            };
//            Transaction t2 = new Transaction("Debit", "Wages", 30.20) {
//            };
//
            //transaction.add(t1);
//            transaction.add(t2);
//
            init = false;
            
        }
        //return t;
    }
    
    
    //Method that allows us to make a lodgement
    public  Account makeLodgement(Account lodgement ) {
        if(lodgement.getAccountID() <=0){
            return null;
        }
        
        if(lodgement.getAccountID() == lodgement.getAccountID()){
//            System.out.println(lodgement.getAccountID());
//            System.out.println(lodgement.getAccountBalance());
//        double accountBalance = lodgement.getAccountBalance();
        Transaction t1 = new Transaction("Credited", "Money Lodgment", accounts.get(0).getAccountBalance());
        lodgement.setTransaction(transaction);
        transaction.add(t1);

//        int account = lodgement.getAccountNum();
//        String accountType = lodgement.getAccountType();
//        String sort = lodgement.getSortCode(); 
//        System.out.println(sort);
//        int id = lodgement.getAccountID();
//        System.out.println(id);
//        accounts.get(0).setSortCode(sort);
        
//        System.out.println(accountBalance+"    " + account+"   " + accountType);
//        lodgement.setAccountBalance(accountBalance);
//        lodgement.setAccountNum(account);
//        lodgement.setAccountType(accountType);
//        lodgement.setSortCode(sort);
//        accounts.get(0);
//        lodgement.setAccountBalance(accountBalance);
          accounts.set(0, lodgement);
        
//        
//        lodgement.setAccountNum(account);
//        lodgement.getAccountType();
//        lodgement.getSortCode();
        
       // accounts.add(lodgement.getAccountID(),lodgement);
       //accounts.add(lodgement);
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
        }
        return lodgement;
    }
    
    
    
    
    public  Account makeWithdrawal(Account withdrawal ) {
        if(withdrawal.getAccountID() <=0){
            return null;
        }
        
        if(withdrawal.getAccountID() == withdrawal.getAccountID()){
        Transaction t1 = new Transaction("Debited", "Money Withdrawal ", accounts.get(0).getAccountBalance());
        withdrawal.setTransaction(transaction);
        transaction.add(t1);

          accounts.set(0, withdrawal);
        }
        return withdrawal;
    }
    
}
