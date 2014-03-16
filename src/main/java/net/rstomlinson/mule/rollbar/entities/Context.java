package net.rstomlinson.mule.rollbar.entities;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({"pre", "post"})
public class Context {
	
	@JsonProperty("pre")
	private String[] pre;
	@JsonProperty("post")
	private String[] post;
	
	@JsonProperty("pre")
	public String[] getPre() {
		return pre;
	}
	
	@JsonProperty("pre")
	public void setPre(String[] pre) {
		this.pre = pre;
	}
	
	@JsonProperty("post")
	public String[] getPost() {
		return post;
	}
	
	@JsonProperty("post")
	public void setPost(String[] post) {
		this.post = post;
	}

}
