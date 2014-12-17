package com.yesbank.fbapp.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.yesbank.fbapp.dto.UserData;

public class NBAuthentication {

@GET
@Path("/NBAuthentication/{bankingType}")
@Produces("application/json")  
public UserData nbAuthentication (@PathParam("bankingType") String bankingType) {
   UserData authentication = new UserData();
   if(bankingType != null && bankingType.equals("NetBanking")){
       authentication.setMessage("YesBank NetBanking");
   }
    return authentication;
                    
   }
}
