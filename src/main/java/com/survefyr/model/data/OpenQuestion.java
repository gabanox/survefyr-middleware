/**
 * 
 */
package com.survefyr.model.data;

/**
 * @author gc
 *
 */
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class OpenQuestion extends Question {
	private String response;

	private String getResponse() {
		return response;
	}

	private void setResponse(String response) {
		this.response = response;
	}
}
