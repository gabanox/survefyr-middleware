package com.survefyr.rs;

//import com.example.models.Time;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.survefyr.model.data.Question;
import com.survefyr.model.data.QuestionItem;
import com.survefyr.model.data.Survey;

@Path("/surveys")
@Produces(MediaType.APPLICATION_JSON)
public class SurvefyrServices {
	final private String helloJSON = "{'name'='Survefyr','message'='Hello, lets Surveyyyy :)'}";
	@Context
	private HttpServletResponse anotherServlerResponse;

	@GET
	public List<Survey> get() {
		anotherServlerResponse.addHeader("Access-Control-Allow-Origin", "*");
		List<Survey> surveys = new ArrayList<Survey>();
		Survey s = new Survey();
		s.setAplicant("Aplicant 1");
		s.setAplicator("Aplicator 1");
		s.setCreator("Creator 1");
		s.setOwner("Owner 1");
		List<Question> questions = new ArrayList<Question>();
		Question q1 = new Question();
		q1.setQuestionDescription("Question Description 1");
		List<QuestionItem> questionItems = new ArrayList<QuestionItem>();
		QuestionItem qi = new QuestionItem();
		qi.setDescription("description 1");
		qi.setValue("value 1");
		QuestionItem qi2 = new QuestionItem();
		qi.setDescription("description 2");
		qi.setValue("value 2");
		questionItems.add(qi);
		questionItems.add(qi2);
		q1.setQuestionItems(questionItems);
		Question q2 = new Question();
		q1.setQuestionDescription("Question Description 2");
		List<QuestionItem> questionItems2 = new ArrayList<QuestionItem>();
		QuestionItem qi21 = new QuestionItem();
		qi.setDescription("description 1");
		qi.setValue("value 1");
		QuestionItem qi22 = new QuestionItem();
		qi.setDescription("description 2");
		qi.setValue("value 2");
		questionItems.add(qi21);
		questionItems.add(qi22);
		q1.setQuestionItems(questionItems2);
		questions.add(q1);
		questions.add(q2);
		s.setQuestions(questions);

		Survey s2 = new Survey();
		s2.setAplicant("Aplicant 2");
		s2.setAplicator("Aplicator 2");
		s2.setCreator("Creator 2");
		s2.setOwner("Owner 2");
		List<Question> questionsS2 = new ArrayList<Question>();
		Question q1S2 = new Question();
		q1.setQuestionDescription("Question Description 1");
		List<QuestionItem> questionItemsS2 = new ArrayList<QuestionItem>();
		QuestionItem qiS2 = new QuestionItem();
		qi.setDescription("description 1");
		qi.setValue("value 1");
		QuestionItem qi2S2 = new QuestionItem();
		qi.setDescription("description 2");
		qi.setValue("value 2");
		questionItems.add(qiS2);
		questionItems.add(qi2S2);
		q1.setQuestionItems(questionItemsS2);
		Question q2S2 = new Question();
		q1.setQuestionDescription("Question Description 2");
		List<QuestionItem> questionItems2S2 = new ArrayList<QuestionItem>();
		QuestionItem qi21S2 = new QuestionItem();
		qi.setDescription("description 1");
		qi.setValue("value 1");
		QuestionItem qi22S2 = new QuestionItem();
		qi.setDescription("description 2");
		qi.setValue("value 2");
		questionItems.add(qi21S2);
		questionItems.add(qi22S2);
		q1.setQuestionItems(questionItems2S2);
		questions.add(q1S2);
		questions.add(q2S2);
		s2.setQuestions(questionsS2);

		surveys.add(s);
		surveys.add(s2);
		return surveys;
	}

}
