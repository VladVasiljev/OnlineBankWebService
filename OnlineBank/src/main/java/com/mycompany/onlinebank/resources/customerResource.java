/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.resources;

import com.mycompany.onlinebank.services.customerService;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Paul
 */

@Path("/customers")
public class customerResource {
    
   customerService customerservice = new customerService();
   
   //Get all customers
   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public Response getCustomers(){
   
       return 
   }
    
}
