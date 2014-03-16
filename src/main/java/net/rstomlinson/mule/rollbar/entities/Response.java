package net.rstomlinson.mule.rollbar.entities;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({"err","result","message"})
public class Response {
	
	@JsonProperty("err")
	private int err;
	@JsonProperty("result")
	private Result result;
	@JsonProperty("message")
	private String message;
	
	@JsonProperty("err")
	public int getErr() {
		return err;
	}
	@JsonProperty("err")
	public void setErr(int err) {
		this.err = err;
	}
	
	@JsonProperty("result")
	public Result getResult() {
		return result;
	}
	
	@JsonProperty("result")
	public void setResult(Result result) {
		this.result = result;
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
