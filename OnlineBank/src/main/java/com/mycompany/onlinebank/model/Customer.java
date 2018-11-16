/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.model;

/**
 *
 * @author Paul
 */
public class Customer {
    private  Integer id;
    private Integer pin;
    private  String first_name;
    private  String last_name;
    private String address;
    private String email;

    public Customer(Integer id, Integer pin, String first_name, String last_name, String address, String email) {
        this.id = id;
        this.pin = pin;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.email = email;
    }

    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
   

}
