/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.services;

import com.mycompany.onlinebank.database.databaseClass;
import com.mycompany.onlinebank.model.Account;
import java.util.Map;

/**
 *
 * @author Vladislavs Vasiljevs
 */
public class accountService {
    
     private Map<Long, Account> accounts = databaseClass.getAccounts();
    
    public accountService(){
//        accounts.put(1L, new Account("First","Last","123BCD4","954385939","Current Account",20.0));
      
    }
    
}
