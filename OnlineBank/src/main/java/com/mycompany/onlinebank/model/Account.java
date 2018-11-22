/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account {
	
	private int accountID;
	private String accountType;
        private int accountNum;
        private double accountBalance;
        

	public Account() {
	}

	public Account(int accountID, String accountType, int accountNum, double accountBalance) {
		this.accountID = accountID;
		this.accountType = accountType;
                this.accountNum = accountNum;
                this.accountBalance = accountBalance;
	}

    public int getAccountNum() {
        return accountNum;
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

}
