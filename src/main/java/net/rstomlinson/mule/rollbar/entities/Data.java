package net.rstomlinson.mule.rollbar.entities;

import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({"environment", "body","level","timestamp", "platform", "language", 
					"framework", "context", "fingerprint", "title", "notifier"})
public class Data {
	
	@JsonProperty("environment")
	private String environment;
	@JsonProperty("body")
	private Body body;
	@JsonProperty("level")
	private SeverityLevel level;
	@JsonProperty("timestamp")
	private Long timestamp;
	@JsonProperty("platform")
	private String platform;
	@JsonProperty("language")
	private String language;
	@JsonProperty("framework")
	private String framework;
	@JsonProperty("context")
	private String context;
	//private Request request;
	//private Person person;
	//private Server server;
	//private Client client;
	//private Custom custom;
	@JsonProperty("fingerprint")
	private String fingerprint;
	@JsonProperty("title")
	private String title;
	@JsonProperty("notifier")
	private Notifier notifier;
	
	@JsonProperty("environment")
	public String getEnvironment() {
		return environment;
	}
	
	@JsonProperty("environment")
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	@JsonProperty("body")
	public Body getBody() {
		return body;
	}
	
	@JsonProperty("body")
	public void setBody(Body body) {
		this.body = body;
	}
	
	@JsonProperty("level")
	public SeverityLevel getSeverity() {
		return level;
	}
	
	@JsonProperty("level")
	public void setSeverity(SeverityLevel severity) {
		this.level = severity;
	}
	
	@JsonProperty("timestamp")
	public Long getTimestamp() {
		return timestamp;
	}
	
	@JsonProperty("timestamp")
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	@JsonProperty("platform")
	public String getPlatform() {
		return platform;
	}
	
	@JsonProperty("platform")
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	@JsonProperty("language")
	public String getLanguage() {
		return language;
	}
	
	@JsonProperty("language")
	public void setLanguage(String language) {
		this.language = language;
	}
	
	@JsonProperty("framework")
	public String getFramework() {
		return framework;
	}
	
	@JsonProperty("framework")
	public void setFramework(String framework) {
		this.framework = framework;
	}
	
	@JsonProperty("context")
	public String getContext() {
		return context;
	}
	
	@JsonProperty("context")
	public void setContext(String context) {
		this.context = context;
	}
	
	/*
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Server getServer() {
		return server;
	}
	public void setServer(Server server) {
		this.server = server;
	}
	*/
	
	@JsonProperty("fingerprint")
	public String getFingerprint() {
		return fingerprint;
	}
	
	@JsonProperty("fingerprint")
	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}
	
	@JsonProperty("title")
	public String getTitle() {
		return title;
	}
	
	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}
	
	@JsonProperty("notifier")
	public Notifier getNotifier() {
		return notifier;
	}
	
	@JsonProperty("notifier")
	public void setNotifier(Notifier notifier) {
		this.notifier = notifier;
	}
	
}
