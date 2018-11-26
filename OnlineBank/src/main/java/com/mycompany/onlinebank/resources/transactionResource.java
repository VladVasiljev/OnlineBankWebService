/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.resources;

import com.mycompany.onlinebank.model.Account;
import com.mycompany.onlinebank.services.transactionService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Paul
 */
@Path("/lodgement")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class transactionResource {
    
    transactionService transactionservice = new transactionService();
    
      @GET
    @Path("/{newLodgement}")
    @Produces({MediaType.APPLICATION_JSON})
    public Account getLodgement(@PathParam("newLodgement") double accountBalance) {
        return transactionService.getLodgement(accountBalance);
    }
    
}
