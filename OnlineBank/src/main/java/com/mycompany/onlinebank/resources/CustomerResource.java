/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinebank.resources;

import com.mycompany.onlinebank.model.Account;
import com.mycompany.onlinebank.model.Customer;
import com.mycompany.onlinebank.services.CustomerService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;

/**
 *
 * @author Paul
 */
@Path("/customers")
//@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
//@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {

    CustomerService CustomerService = new CustomerService();

    @GET
    @Path("/{customerID}")
    public Customer getCustomer(@PathParam("customerID") int id) {
        return CustomerService.getCustomer(id);
    }

    @GET
    @Path("/{customerID}/accounts/{accountID}")
    public Account getCustomer(@PathParam("customerID") int id, @PathParam("accountID") int accountID) {
        return CustomerService.getAccountInCustomer(id, accountID);
    }

//	@POST
//	public Customer postCustomer(Customer c) {
//		return CustomerService.createCustomer(c);
//	}
    @GET

    public List<Customer> getFilteredCustomers(
            @QueryParam("city") String city,
            @QueryParam("name") String name,
            @QueryParam("email") String email,
            @QueryParam("start") int start,
            @QueryParam("size") int size) {
        if ((city != null) || (name != null) || (email != null)) {
            return CustomerService.getSearchCustomers(email, city, name);
        }
        if (start >= 1 && size > 0) {
            return CustomerService.getAllCustomersPaginated(start, size);
        }
        return CustomerService.getAllCustomers();
    }
}
