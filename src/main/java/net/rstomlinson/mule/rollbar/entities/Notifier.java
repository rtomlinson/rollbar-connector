package net.rstomlinson.mule.rollbar.entities;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({"name", "version"})
public class Notifier {
	
	@JsonProperty("name")
	private String name = "Mule Rollbar Connector";
	@JsonProperty("version")
	private String version = "1.0";
	
	@JsonProperty("name")
	public String getName() {
		return name;
	}
	
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}
	
	@JsonProperty("version")
	public String getVersion() {
		return version;
	}
	
	@JsonProperty("version")
	public void setVersion(String version) {
		this.version = version;
	}
}
