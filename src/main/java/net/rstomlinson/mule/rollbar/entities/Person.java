package net.rstomlinson.mule.rollbar.entities;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({"id", "username","email"})
public class Person {
	@JsonProperty("id")
	private String id;
	@JsonProperty("username")
	private String username;
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}
	
	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}
	
	@JsonProperty("username")
	public String getUsername() {
		return username;
	}
	
	@JsonProperty("username")
	public void setUsername(String username) {
		this.username = username;
	}
	
	@JsonProperty("email")
	public String getEmail() {
		return email;
	}
	
	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}
}
