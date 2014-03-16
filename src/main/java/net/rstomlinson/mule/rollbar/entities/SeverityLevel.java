package net.rstomlinson.mule.rollbar.entities;

public enum SeverityLevel {
	CRITICAL("critical"), ERROR("error"), WARNING("warning"), INFO("info"), DEBUG("debug");

	private String severityLevel;
	
	private SeverityLevel(String s){
		severityLevel = s;
	}
	
	public String getSeverityLevel() {
		return severityLevel;
	}
}
