package com.survefyr.model.data;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Survey {
	private String URIorigin;
	private String agency;
	private String owner;
	private String creator;
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getAplicator() {
		return aplicator;
	}
	public void setAplicator(String aplicator) {
		this.aplicator = aplicator;
	}
	public String getAplicant() {
		return aplicant;
	}
	public void setAplicant(String aplicant) {
		this.aplicant = aplicant;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	private String aplicator;
	private String aplicant;
	private List<Question> questions;
	private String getURIorigin() {
		return URIorigin;
	}
	private void setURIorigin(String uRIorigin) {
		URIorigin = uRIorigin;
	}
	private String getAgency() {
		return agency;
	}
	private void setAgency(String agency) {
		this.agency = agency;
	}
}
