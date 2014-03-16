package net.rstomlinson.mule.rollbar.entities;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({"frames", "exception"})
public class Trace {
	@JsonProperty("frames")
	private Frame[] frames;
	@JsonProperty("exception")
	private RollbarException exception;
	
	@JsonProperty("frames")
	public Frame[] getFrames() {
		return frames;
	}
	
	@JsonProperty("frames")
	public void setFrames(Frame[] frames) {
		this.frames = frames;
	}
	
	@JsonProperty("exception")
	public RollbarException getException() {
		return exception;
	}
	
	@JsonProperty("exception")
	public void setException(RollbarException exception) {
		this.exception = exception;
	}
}
