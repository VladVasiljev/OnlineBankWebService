/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.database;

import com.mycompany.onlinebank.model.Account;
import com.mycompany.onlinebank.model.Customer;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Vladislavs Vasiljevs
 */
public class databaseClass {
     private static Map<Long, Account> accounts = new HashMap<>();
     private static Map<Long, Customer> customers = new HashMap<>();



    public static Map<Long, Account> getAccounts() {
        return accounts;
    }
    public static Map<Long, Customer> getCustomers() {
        return customers;
    }
}
