/**
 * 
 */
package com.survefyr.model.data;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class QuestionItem {
	
	private String value;
	private String description;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
