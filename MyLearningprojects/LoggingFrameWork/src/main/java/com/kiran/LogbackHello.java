package com.kiran;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
/**
 * Info:
 * This class uses slf4j-api as abstarction layer and implement was 
 * logback-classic(Logback framework)
 * 
 * @author Sai Kiran
 * @version 1.0
 */
public class LogbackHello {
	
	static {
		System.setProperty("properties.url", "envProp.properties"); //setting system property to use in logback.xml
	}
   private static final Logger slf4jLogger = LoggerFactory.getLogger(LogbackHello.class); //Note:
   																						  //Declaring here, because if not static it needs to create multiple objects for logging
   																						 // which i want to avoid
 
    /**
     * @param args
     */
    public static void main(String[] args) {
       
        //System.setProperty("properties.url", "envProp.properties"); //setting system property to use in logback.xml
       // Logger slf4jLogger = LoggerFactory.getLogger(LogbackHello.class); 
        slf4jLogger.trace("Hello World!");
        
        String name = "Abhijit";
        slf4jLogger.debug("Hi, {}", name,"hello");
        slf4jLogger.info("Welcome to the HelloWorld example of Logback.");
        slf4jLogger.warn("Dummy warning message.");
        slf4jLogger.error("Dummy error message.");
    }
}