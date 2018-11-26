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
 * @author Paul
 */
@XmlRootElement
public class Transaction {
    private String transactionType;
    //private Date date = new Date();
    private String desciption;
    private double postTransactionBallance;

    public Transaction() {
    }

    public Transaction(String transactionType, String desciption, double postTransactionBallance) {
        this.transactionType = transactionType;
        this.desciption = desciption;
        this.postTransactionBallance = postTransactionBallance;
       // this.date = new Date();
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public double getPostTransactionBallance() {
        return postTransactionBallance;
    }

    public void setPostTransactionBallance(double postTransactionBallance) {
        this.postTransactionBallance = postTransactionBallance;
    }
    
    
}


