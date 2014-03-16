package net.rstomlinson.mule.rollbar.entities;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({"filename", "lineno", "colno", "method","code","context"})
public class Frame {
	
	@JsonProperty("filename")
	private String filename;
	@JsonProperty("lineno")
	private int lineno;
	@JsonProperty("colno")
	private int colno;
	@JsonProperty("method")
	private String method;
	@JsonProperty("code")
	private String code;
	@JsonProperty("context")
	private Context context;
	
	@JsonProperty("filename")
	public String getFilename() {
		return filename;
	}
	
	@JsonProperty("filename")
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	@JsonProperty("lineno")
	public int getLineno() {
		return lineno;
	}
	
	@JsonProperty("lineno")
	public void setLineno(int lineno) {
		this.lineno = lineno;
	}
	
	@JsonProperty("colno")
	public int getColno() {
		return colno;
	}
	
	@JsonProperty("colno")
	public void setColno(int colno) {
		this.colno = colno;
	}
	
	@JsonProperty("method")
	public String getMethod() {
		return method;
	}
	
	@JsonProperty("method")
	public void setMethod(String method) {
		this.method = method;
	}
	
	@JsonProperty("code")
	public String getCode() {
		return code;
	}
	
	@JsonProperty("code")
	public void setCode(String code) {
		this.code = code;
	}
	
	@JsonProperty("context")
	public Context getContext() {
		return context;
	}
	
	@JsonProperty("context")
	public void setContext(Context context) {
		this.context = context;
	}
}
