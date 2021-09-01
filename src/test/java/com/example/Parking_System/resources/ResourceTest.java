package com.example.Parking_System.resources;

import org.glassfish.jersey.server.monitoring.RequestEvent;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.Response;

import static org.junit.jupiter.api.Assertions.*;

class ResourceTest {
    @Test
    void getJSON(){
        Response s=null;
        try {
            s=new Resource().getJSON("{\n" +

                    "\"name\": \"QQQQ11\" ,\n" +
                    "\"email\" :\"m@gmail.com\" ,\n" +
            "\"status\": \"out\n" + " }");
            assertEquals(200,s.getStatus());

        }
        catch(Exception ex){
            System.out.println(ex.getStackTrace());
        }

    }


}