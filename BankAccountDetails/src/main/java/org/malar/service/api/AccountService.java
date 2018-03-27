package org.malar.service.api;

import javax.ws.rs.Path;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.malar.exception.AccountNotFoundException;
import org.malar.service.to.AccountList;
import org.malar.service.to.AccountRequest;
import org.malar.service.to.AccountResponse;


@SuppressWarnings("restriction")
@Path("/accountrestservice/")
@WebService

public interface AccountService {

	
	@Path("/createaccountservice")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public AccountResponse createAccountService(AccountRequest accountRequest) throws Exception;
	
	@Path("/deleteaccountservice/{accnumber}")
	@DELETE
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public AccountResponse deleteAccountService(@PathParam("accnumber") long accNumber) throws AccountNotFoundException;
	
    
	@Path("/withdrawservice")
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public AccountResponse withdrawService(AccountRequest accountRequest) throws AccountNotFoundException;

	@Path("/depositservice")
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public AccountResponse depositService(AccountRequest accountRequest) throws AccountNotFoundException;


	
	@Path("/checkbalanceservice/{accnumber}")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public AccountResponse checkBalanceService(@PathParam("accnumber") long accNumber) throws AccountNotFoundException;

	@Path("/viewalladservice")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public AccountList viewAllAccountService();

	
	
	

}