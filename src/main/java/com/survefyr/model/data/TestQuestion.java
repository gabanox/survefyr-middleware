package com.survefyr.model.data;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import com.survefyr.model.data.Question.QuestionType;

public class TestQuestion extends TestCase {

	@Test
	public void testCreateLikertQuestion(){
		Question likertQuestion = new Question(QuestionType.LIKERT);
		assertTrue(likertQuestion.getQuestionType().equals(QuestionType.LIKERT.toString()));
	}
	
	@Test
	public void testCreateMultipleOptionQuestion(){
		Question multpleOptionQuestion = new Question(QuestionType.MULTIPLE);
		assertTrue(multpleOptionQuestion.getQuestionType().equals(QuestionType.MULTIPLE.toString()));
	}
	
	@Test
	public void testCreateSmileyQuestion(){
		Question smileyQuestion = new Question(QuestionType.SMILEY);
		assertTrue(smileyQuestion.getQuestionType().equals(QuestionType.SMILEY.toString()));
	}
	
	@Test
	public void testCreateOpenQuestion(){
		Question openQuestion = new Question(QuestionType.OPEN);
		assertTrue(openQuestion.getQuestionType().endsWith(QuestionType.OPEN.toString()));
	}
	
	@Test
	public void testCreateLikertQuestionWithQuestion(){
		String questionDescription = "¿Esta satisfecho con nuestro servicio?";
		Question likertQuestion = new Question(QuestionType.LIKERT);
			likertQuestion.setQuestionDescription(questionDescription);
			
		assertTrue(likertQuestion.getQuestionDescription().equals(questionDescription));
	}
	
	public void testCreateLikertQuestionWithQuestionItems(){
		
		Question likertQuestionary = new Question(QuestionType.LIKERT);
		List<QuestionItem> questionsList = new ArrayList<QuestionItem>();
		int size = 10;
		for(int i = 0; i < size; i++){
			QuestionItem question = new QuestionItem();
			question.setDescription("Pregunta " + i);
			questionsList.add(question);
		}
		likertQuestionary.setQuestionItems(questionsList);
		
		assertNotNull(likertQuestionary);
		assertNotNull(questionsList);
		assertTrue(likertQuestionary.getQuestionItems().size() == size);
		
	}
	
}
