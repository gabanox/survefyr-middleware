package com.example.services;

//import com.example.models.Time;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rsdemo")
@Produces(MediaType.APPLICATION_JSON)
public class RSDemo {

    @GET
    public String get() {
        return "alo alo";
    }

}

