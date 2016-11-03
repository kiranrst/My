package com.kiran.client;

import java.util.Hashtable;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;

import com.kiran.EjbInterfaceRemote;

public class EjbInvokeMain {
	 
	
	private static Context initialContext=null;
	private static String ejbLookup="java:global/EJBFrameworkExample/EjbBean!com.kiran.EjbInterfaceRemote";

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		
		Context ctx = getInitialContext();
		EjbInterfaceRemote remote = (EjbInterfaceRemote) ctx.lookup(ejbLookup);
		remote.sayHello();
	}
	
	
	public static Context getInitialContext() throws NamingException {
		if (initialContext == null) {
            Hashtable<String, String> env = new Hashtable<String, String>();
           // env.put(Context.URL_PKG_PREFIXES, PKG_INTERFACES);
            
            env.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
			env.put("java.naming.provider.url", "jnp://localhost:9990");
			env.put("java.naming.factory.url.pkgs", "org.jboss.naming:org.jnp.interfaces");
 
            initialContext = new InitialContext(env);
        }
        return initialContext;
    }
	
	
	
	
	
	

}

