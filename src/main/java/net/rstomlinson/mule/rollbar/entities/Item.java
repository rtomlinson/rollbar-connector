package net.rstomlinson.mule.rollbar.entities;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({"access_token", "data"})
public class Item {
	
	@JsonProperty("access_token")
	private String accessToken;
	@JsonProperty("data")
	private Data data;
	
	@JsonProperty("access_token")
	public String getAccessToken() {
		return accessToken;
	}
	
	@JsonProperty("access_token")
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	
	@JsonProperty("data")
	public Data getData() {
		return data;
	}
	
	@JsonProperty("data")
	public void setData(Data data) {
		this.data = data;
	}
}