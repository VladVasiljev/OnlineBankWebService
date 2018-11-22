/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.resources;

import com.mycompany.onlinebank.services.accountService;
import com.mycompany.onlinebank.model.Account;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Vladislavs Vasiljevs
 */
@Path("/Accounts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class accountResource {
   accountService accountservice = new accountService();
    
    //Getting Accounts by ID
   @GET
   @Path("/{accountID}")
   public Account getAccountsByID(@PathParam("accountID") int id) {
       return accountservice.getAccountsByID(id);
   }
    
//   @GET
//   @Path("/Customer/{customerID}")
//   public Customer getCustomerByID(@PathParam("customerID") int id) {
//       return accountservice.getCustoemrByID(id);
//   }
   
   
   @GET
   @Path("/{customerID}/Account/{accountID}")
   public Account getAccountID(@PathParam("customerID") int id, @PathParam("accountID") int accountID) {
       return accountservice.getAccountsInCustomers(id, accountID);
   }
   
}
