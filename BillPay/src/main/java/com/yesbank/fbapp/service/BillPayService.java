package com.yesbank.fbapp.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.yesbank.fbapp.dao.APINDAO;
import com.yesbank.fbapp.dao.BillDetailsDAO;
import com.yesbank.fbapp.dto.UserData;


@Path("/user")
public class BillPayService {
    @GET
    @Path("/register/{apin}")
    @Produces("application/json")
    public UserData apinRegistration(@PathParam("apin") String newApin ) {
        
        APINDAO.create(newApin);
         UserData user = new UserData();
         user.setMessage("apin created");

        return user;
        
}
    @GET
    @Path("/apin/verify/{apin}")
    @Produces("application/json")
    
   public UserData apinVerification (@PathParam("apin") String apin) {
 
    UserData verify = new UserData();
    
   if (APINDAO.verify(apin)) {

        Integer billAmount=BillDetailsDAO.billList();
        String bill=billAmount.toString();
         verify.setMessage("apin verified");
    } else {
        verify.setMessage("apin verification failed");

    }
        return verify;

}
    
    @GET
    @Path("/billList")
    @Produces("application/json")
    public UserData billsList () {
           
    UserData list = new UserData();
    
    list.setMessage("bill list");
   
       return list;
   
   }
    
    @GET
    @Path("/payBill/{apin}")
    @Produces("application/json")
    public UserData payBill (@PathParam("apin") String apin) {
    
    UserData pay = new UserData();
    
    BillDetailsDAO.payBill();
    
    pay.setMessage("bill paid");
    
    return pay;
                    
   }
    
    @GET
    @Path("/billDetails")
    @Produces("application/json")
    public UserData userBillDetails () {
   
    UserData details = new UserData();
    
    details.setMessage("bill details");
    
    return details;
    
   }
    
 
}