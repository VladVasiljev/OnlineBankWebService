/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.resources;

import com.mycompany.onlinebank.model.Account;
import com.mycompany.onlinebank.services.accountService;
import com.mycompany.onlinebank.services.customerService;
import com.mycompany.onlinebank.services.transactionService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Paul
 */
@Path("/transaction")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class transactionResource {

    transactionService transactionservice = new transactionService();
    accountService accountservice = new accountService();
    customerService service = new customerService();
    List<Account> accounts = service.getaccounts();

//      @GET
//    @Path("/{newLodgement}")
//    @Produces({MediaType.APPLICATION_JSON})
//    public Account getLodgement(@PathParam("newLodgement") double accountBalance) {
//        return transactionService.getLodgement(accountBalance);
//    }
    //Allows us to make a lodgement to a accounts
    //Usage PUT http://127.0.0.1:49000/api/transaction/lodgement/1/555
    @PUT
    @Path("/lodgement/{accountID}/{amount}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Account makeLodgement(@PathParam("accountID") int id, @PathParam("amount") int amount, Account lodgement) {
        lodgement.setAccountID(id);
//        double balance = lodgement.getAccountBalance();
//        System.out.println(balance);

        for (Account account : accounts) {
            if (account.getAccountID() == id) {
                double balance = account.getAccountBalance();
                System.out.println(balance);
                lodgement.setAccountBalance(balance + amount);
                //found it!
            }
        }

//        lodgement.getAccountBalance();
//        lodgement.setAccountBalance();
        return transactionservice.makeLodgement(lodgement);
    }

    @PUT
    @Path("/withdrawal/{accountID}/{amount}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Account makeWithdrawal(@PathParam("accountID") int id, @PathParam("amount") double amount, Account withdrawal) {
        withdrawal.setAccountID(id);
//        double balance = lodgement.getAccountBalance();
//        System.out.println(balance);
        for (Account account : accounts) {
            if (account.getAccountID() == id) {
                System.out.println(account.getAccountID());
                double balance = account.getAccountBalance();
                System.out.println(balance);
                double finalValue = balance - amount;
                withdrawal.setAccountBalance(finalValue);
            }
        }
//        lodgement.getAccountBalance();
//        lodgement.setAccountBalance();
        return transactionservice.makeWithdrawal(withdrawal);
    }

}
