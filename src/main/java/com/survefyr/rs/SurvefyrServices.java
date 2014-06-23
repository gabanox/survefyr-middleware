package com.survefyr.rs;

//import com.example.models.Time;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.survefyr.model.data.QuestionItem;
import com.survefyr.model.data.Survey;

@Path("/surveys")
@Produces(MediaType.APPLICATION_JSON)
public class SurvefyrServices {
	final private String helloJSON = "{'name'='Survefyr','message'='Hello, lets Surveyyyy :)'}";
    @GET
    public List<Survey> get() {
    	List<Survey> s = new ArrayList<Survey>();
    	s.add(new Survey());
    	s.add(new Survey());
        return s;
    }

}

