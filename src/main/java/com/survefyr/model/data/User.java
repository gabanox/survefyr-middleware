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
public class User {
	private String username;

	public User(String username) {
		this.username = username;
	}

	private String getUsername() {
		return username;
	}

	private void setUsername(String username) {
		this.username = username;
	}
}
