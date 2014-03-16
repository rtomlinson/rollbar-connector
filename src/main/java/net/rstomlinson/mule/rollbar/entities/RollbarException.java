package net.rstomlinson.mule.rollbar.entities;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({"class", "message"})
public class RollbarException {
	
	@JsonProperty("class")
	private String className;
	@JsonProperty("message")
	private String message;
	
	@JsonProperty("class")
	public String getClassName() {
		return className;
	}
	
	@JsonProperty("class")
	public void setClassName(String className) {
		this.className = className;
	}
	
	@JsonProperty("message")
	public String getMessage() {
		return message;
	}
	
	@JsonProperty("message")
	public void setMessage(String message) {
		this.message = message;
	}
}
