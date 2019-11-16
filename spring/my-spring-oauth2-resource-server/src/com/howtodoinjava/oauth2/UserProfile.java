package com.howtodoinjava.oauth2;

/**
 * @author boyuan
 *
 */
public class UserProfile {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String name;
	private String email;

	@Override
	public String toString() {
		return "UserProfile [name=" + name + ", email=" + email + "]";
	}
}
