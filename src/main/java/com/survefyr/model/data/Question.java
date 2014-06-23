package com.survefyr.model.data;


import javax.xml.bind.annotation.XmlRootElement;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

@XmlRootElement
public class Question {
	private Object questionDescription;
	private List<QuestionItem> questionItems;
	private List<QuestionItem> selectedQuestionItems;
	private enum QuestionType {
		LIKERT, 
		SMILEY,
		MULTIPLE,
		OPEN
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
