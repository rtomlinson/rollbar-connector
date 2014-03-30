package net.rstomlinson.mule.rollbar.entities;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({"host", "root","branch","sha"})
public class Server {
	@JsonProperty("host")
	private String host;
	@JsonProperty("root")
	private String root;
	@JsonProperty("branch")
	private String branch;
	@JsonProperty("sha")
	private String sha;
	
	@JsonProperty("host")
	public String getHost() {
		return host;
	}
	
	@JsonProperty("host")
	public void setHost(String host) {
		this.host = host;
	}
	
	@JsonProperty("root")
	public String getRoot() {
		return root;
	}
	
	@JsonProperty("root")
	public void setRoot(String root) {
		this.root = root;
	}
	
	@JsonProperty("branch")
	public String getBranch() {
		return branch;
	}
	
	@JsonProperty("branch")
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	@JsonProperty("sha")
	public String getSha() {
		return sha;
	}
	
	@JsonProperty("sha")
	public void setSha(String sha) {
		this.sha = sha;
	}
}
