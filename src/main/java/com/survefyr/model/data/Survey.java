package com.survefyr.model.data;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Survey {
	private String URIorigin;
	private String agency;
	private String owner;
	private String creator;
	private String aplicator;
	private String aplicant;
	private List<Question> questions;
}
