package com.example.services;

//import com.example.models.Time;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello2")
@Produces(MediaType.APPLICATION_JSON)
public class SurvefyrHello {
	final private String helloJSON = "{'name'='Survefyr','message'='Hello, lets Surveyyyy :)'}";
    @GET
    public String get() {
        return helloJSON;
    }

}

