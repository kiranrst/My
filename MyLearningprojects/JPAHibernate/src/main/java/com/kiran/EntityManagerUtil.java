package com.kiran;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
	
	public static EntityManager  getEntityManager(){
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("testPU");
		
		EntityManager em = emf.createEntityManager();
		return em;
	}

}
