package com.survefyr.model.data;


import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Question {
	private Object questionDescription;
	private List<QuestionItem> questionItems;
	private List<QuestionItem> selectedQuestionItems;
	protected QuestionType questionType;
	public enum QuestionType {
		LIKERT, 
		SMILEY,
		MULTIPLE,
		OPEN
	}
	
	public Question(){}
	
	public Question(QuestionType questionType){
		this.questionType = questionType;
	}
	public void setQuestionType(QuestionType questionType){
		this.questionType = questionType;
	}
	
	public String getQuestionType(){
		return this.questionType.toString();
	}
	
	public Object getQuestionDescription() {
		return questionDescription;
	}
	public void setQuestionDescription(Object questionDescription) {
		this.questionDescription = questionDescription;
	}
	public List<QuestionItem> getQuestionItems() {
		return questionItems;
	}
	public void setQuestionItems(List<QuestionItem> questionItems) {
		this.questionItems = questionItems;
	}
	private List<QuestionItem> getSelectedQuestionItems() {
		return selectedQuestionItems;
	}
	private void setSelectedQuestionItems(List<QuestionItem> selectedQuestionItems) {
		this.selectedQuestionItems = selectedQuestionItems;
	}
	
}
