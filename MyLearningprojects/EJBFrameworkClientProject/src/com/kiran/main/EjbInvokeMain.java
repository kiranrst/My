package com.kiran.main;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class EjbInvokeMain {
	 
	
	private static Context initialContext=null;
	private static final String PKG_INTERFACES = "org.jboss.ejb.client.naming";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static Context getInitialContext() throws NamingException {
		if (initialContext == null) {
            Properties properties = new Properties();
            properties.put(Context.URL_PKG_PREFIXES, PKG_INTERFACES);
 
            initialContext = new InitialContext(properties);
        }
        return initialContext;
    }

}
