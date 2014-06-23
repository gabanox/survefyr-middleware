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
    	List<Survey> surveys = new ArrayList<Survey>();
    	Survey s = new Survey();
    	s.setAplicant("Aplicant 1");
    	s.setAplicator("Aplicator 1");
    	s.setCreator("Creator 1");
    	s.setOwner("Owner 1");
    	

    	
    	Survey s2 = new Survey();
    	s2.setAplicant("Aplicant 2");
    	s2.setAplicator("Aplicator 2");
    	s2.setCreator("Creator 2");
    	s2.setOwner("Owner 2");
    	
    	    	surveys.add(s);
    	    	surveys.add(s2);
        return surveys;
    }

}

