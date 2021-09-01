package com.example.Parking_System.resources;
import com.example.Parking_System.domain.*;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.commons.lang3.BooleanUtils;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Date;

@Path("/parking")

public class Resource {

    @POST
    @Path("/request")
    public Response getJSON(String payload) throws Exception{

        ParkInfo info=new Gson().fromJson(payload,ParkInfo.class);
        try{
            if(info.getV_Name().equals("")){
                throw new nameException();
            }


        }catch (Exception ex){

        }
        /*     if(!(info.getV_Name().equals("")))

        {
            Date d=new Date();
            if(info.getStatus().equals("in") && !(info.getEmail().equals("")))
            {
                info.setParkin(d.toString());
                String msg = SQS.SendMessage(info.toString());
                return Response.ok("You have been Parked In.").build();
            }
            else
            {
                info.setParkout(d.toString());
                String msg = SQS.SendMessage(info.toString());
                return Response.ok("You have been Parked Out.").build();
            }
        }

        else
            return Response.status(500,"INVALID INFOMATION SUBMITTED").build();
   */ }



}


