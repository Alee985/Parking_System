package com.example.Parking_System.resources;
import com.example.Parking_System.domain.*;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.commons.lang3.BooleanUtils;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/parking")

public class Resource {

    @POST
    @Path("/request")
    public Response getJSON(String payload) throws Exception{
        ParkInfo info=new Gson().fromJson(payload,ParkInfo.class);
        System.out.println(info.toString());
        return Response.noContent().build();
    }
}
