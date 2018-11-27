/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account {
	
	private int accountID;
	private String accountType;
        private int accountNum;
        private double accountBalance;
        private String sortCode;
        private List<Transaction> transaction;
        

	public Account() {
	}

	public Account(int accountID, String accountType, int accountNum, double accountBalance,String sortCode,List<Transaction> transaction) {
		this.accountID = accountID;
		this.accountType = accountType;
                this.accountNum = accountNum;
                this.accountBalance = accountBalance;
                this.sortCode = sortCode;
                this.transaction = transaction;
	}

    public int getAccountNum() {
        return accountNum;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    
    

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }
	
	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }

}
