package com.survefyr.rs;

//import com.example.models.Time;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.survefyr.model.data.QuestionItem;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class SurvefyrHello {
	final private String helloJSON = "{'name'='Survefyr','message'='Hello, lets Surveyyyy :)'}";
    @GET
    public QuestionItem get() {
        return new QuestionItem();
    }

}

