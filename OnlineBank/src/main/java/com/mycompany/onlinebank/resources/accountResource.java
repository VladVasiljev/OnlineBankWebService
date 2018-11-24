/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.resources;

import com.mycompany.onlinebank.services.accountService;
import com.mycompany.onlinebank.model.Account;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Vladislavs Vasiljevs
 */
@Path("/account")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class accountResource {

    accountService accountservice = new accountService();

    //Getting Accounts by ID
    @GET
    @Path("/{accountID}")
    @Produces({MediaType.APPLICATION_JSON})
    public Account getAccountsByID(@PathParam("accountID") int id) {
        return accountservice.getAccountsByID(id);
    }

    //Getting All Accounts
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Account> getAllAccounts() {
        return accountservice.getAllAccounts();
    }
    
    //Creates a Current account for the customer
    //Usage POST http://127.0.0.1:49000/api/account/createCurrentAccount
    @POST
    @Path("/createCurrentAccount")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Account addCurrentAccount(Account c) {
        return accountservice.addCurrentAccount(c);
    }
    
    //Creates a Savings Account for the customer
    //Usage POST http://127.0.0.1:49000/api/account/createSavingsAccount
    @POST
    @Path("/createSavingsAccount")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Account addSavingsAccount(Account s) {
        return accountservice.addSavingsAccount(s);
    }
    
    //Creates a Student Account for the customer
    //Usage POST http://127.0.0.1:49000/api/account/createStudentAccount
    @POST
    @Path("/createStudentAccount")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Account addStudentAccount(Account stu) {
        return accountservice.addSavingsAccount(stu);
    }
    
    

//   @GET
//   @Path("/Customer/{customerID}")
//   public Customer getCustomerByID(@PathParam("customerID") int id) {
//       return accountservice.getCustoemrByID(id);
//   }
//   @GET
//   @Path("/{customerID}/Account/{accountID}")
//   public Account getAccountID(@PathParam("customerID") int id, @PathParam("accountID") int accountID) {
//       return accountservice.getAccountsInCustomers(id, accountID);
//   }
}
