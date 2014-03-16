package net.rstomlinson.mule.rollbar.entities;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({"err","result","message"})
public class Result {
	
	@JsonProperty("id")
	private String id;
	@JsonProperty("uuid")
	private String uuid;
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}
	
	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}
	
	@JsonProperty("uuid")
	public String getUuid() {
		return uuid;
	}
	
	@JsonProperty("uuid")
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
