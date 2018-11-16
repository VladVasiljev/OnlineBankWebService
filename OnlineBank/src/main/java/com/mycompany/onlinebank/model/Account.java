/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Vladislavs Vasiljevs
 */
@XmlRootElement
public class Account {
    private String firstName,lastName,sortCode,accountNumber;
    private double currentBalance;
    private Date accountCreationDate;

    public Account(String firstName, String lastName, String sortCode, String accountNumber, double currentBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
        this.accountCreationDate = new Date();
    }

    public Account() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Date getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(Date accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }
    
    
    
    
}
