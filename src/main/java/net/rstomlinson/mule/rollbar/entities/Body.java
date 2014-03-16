package net.rstomlinson.mule.rollbar.entities;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({"title", "Message"})
public class Body {

	@JsonProperty("trace")
	private Trace trace;
	@JsonProperty("message")
	private Message message;

	@JsonProperty("trace")
	public Trace getTrace() {
		return trace;
	}

	@JsonProperty("trace")
	public void setTrace(Trace trace) {
		this.trace = trace;
	}

	@JsonProperty("message")
	public Message getMessage() {
		return message;
	}

	@JsonProperty("message")
	public void setMessage(Message message) {
		this.message = message;
	}
}
