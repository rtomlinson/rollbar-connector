package net.rstomlinson.mule.rollbar;

import java.io.IOException;
import java.util.Date;

import net.rstomlinson.mule.rollbar.entities.*;

import org.mule.api.annotations.Connector;
import org.mule.api.annotations.display.Password;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.Processor;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


/**
 * Rollbar Cloud Connector
 *
 * @author Richard Tomlinson
 */
@Connector(name="rollbar", schemaVersion="1.0-SNAPSHOT", friendlyName="Rollbar")
public class rollbarConnector
{
    /**
     * Rollbar endpoint
     */
    @Configurable
    @Optional
    @Default("https://api.rollbar.com/api/1/item/")
    //@RestUriParam(value = "endpoint")
    private String endpoint;
    
    /**
     * Rollbar access token
     */
    @Configurable
    @Password
    private String accessToken;

	/**
     * Rollbar environment
     */
    @Configurable
    private String environment;
    
    /**
     * Platform
     */
    @Configurable
    @Optional
    private String platform;
    
    /**
     * Lanugage
     */
    @Configurable
    @Optional
    private String language;
    
    /**
     * Framework
     */
    @Configurable
    @Optional
    private String Framework;
    
    /**
     * Set Rollbar endpoint
     *
     * @param endpoint The Rollbar endpoint
     */
    public void setEndpoint(String endpoint)
    {
        this.endpoint = endpoint;
    }

    /**
     * Get endpoint
     */
    public String getEndpoint()
    {
        return this.endpoint;
    }
    
    /**
     * Get Rollbar access token
     */
    public String getAccessToken() {
		return accessToken;
	}

    /**
     * Set Rollbar access token
     * 
     * @param accessToken The Rollbar access token
     */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * Get Rollbar environment
	 */
	public String getEnvironment() {
		return environment;
	}

	/**
	 * Set Rollbar environment
	 * 
	 * @param environment Rollbar environment
	 */
	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	/**
	 * Get platform
	 */
    public String getPlatform() {
		return platform;
	}

    /**
     * Set platform
     * 
     * @param platform
     */
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	/**
	 * Get language
	 * 
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Set language
	 * 
	 * @param language
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Get framework
	 * 
	 */
	public String getFramework() {
		return Framework;
	}

	/**
	 * Set framework
	 * 
	 * @param framework
	 */
	public void setFramework(String framework) {
		Framework = framework;
	}
    
    
   /**
	* Message item
	*
	* {@sample.xml ../../../doc/rollbar-connector.xml.sample rollbar:message-item}
	* 
    * @param messageContent message content
    * @param severityLevel message severity
    * @param context message context
    * @param fingerprint item fingerprint
    * @param title item title
    * @param personEmail person email
    * @param personId person id
    * @param personUsername person username
    * @param serverBranch server branch
    * @param serverHost server host
    * @param serverRoot server root
    * @param serverSHA server SHA
    * @return Some string
 * @throws IOException IOexception
 * @throws JsonMappingException  JSON mapping exception
 * @throws JsonGenerationException  JSON generator exception
    */
    @Processor
    public Response messageItem(String messageContent, 
    						  @Optional SeverityLevel severityLevel,
    						  @Optional String context,
    						  @Optional String fingerprint,
    						  @Optional String title,
    						  @Optional String personEmail,
    						  @Optional String personId,
    						  @Optional String personUsername,
    						  @Optional String serverBranch,
    						  @Optional String serverHost,
    						  @Optional String serverRoot,
    						  @Optional String serverSHA) throws JsonGenerationException, JsonMappingException, IOException
    {
    	
    	Item item = new Item();
    	item.setAccessToken(getAccessToken());
    	
    	Data data = new Data();
    	data.setEnvironment(getEnvironment());
    	data.setSeverity(severityLevel);
    	data.setTimestamp(new Date().getTime());
    	data.setPlatform(getPlatform());
    	data.setLanguage(getLanguage());
    	data.setFramework(getFramework());
    	data.setContext(context);
    	data.setFingerprint(fingerprint);
    	data.setTitle(title);
    	
    	Body body = new Body();
    	Message message = new Message();
    	
    	message.setBody(messageContent);
    	body.setMessage(message);
    	
    	data.setBody(body);
    	
    	Person person = new Person();
    	person.setEmail(personEmail);
    	person.setId(personId);
    	person.setUsername(personUsername);
    	
    	//data.setPerson(person);
    	
    	Server server = new Server();
    	server.setBranch(serverBranch);
    	server.setHost(serverHost);
    	server.setRoot(serverRoot);
    	server.setSha(serverSHA);
    	
    	//data.setServer(server);
    	
    	Notifier notifier = new Notifier();
    	
    	data.setNotifier(notifier);
    	
    	item.setData(data);
    	
    	
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String json = mapper.writeValueAsString(item);
    	
    	Client client = Client.create();
    	
    	WebResource webResource = client.resource(getEndpoint());
    	
    	ClientResponse response = webResource.type("application/json").post(ClientResponse.class, json);
    	
    	int status = response.getStatus();
    	
    	Response responseObj = mapper.readValue(response.getEntity(String.class), Response.class);
    	
        return responseObj;
    }
}