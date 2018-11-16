/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.database;

import com.mycompany.onlinebank.model.Account;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Vladislavs Vasiljevs
 */
public class databaseClass {
     private static Map<String, Account> accounts = new HashMap<>();
     private static Map<String, Customer> customers = new HashMap<>();


    public static Map<String, Account> getAccounts() {
        return accounts;
    }
    public static Map<Long, Customer> getCustomers() {
        return customers;
    }
}
