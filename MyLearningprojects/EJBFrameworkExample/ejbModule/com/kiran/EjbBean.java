package com.kiran;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class EjbInterface
 */
@Stateless
public class EjbBean implements EjbInterfaceRemote {

    /**
     * Default constructor. 
     */
    public EjbBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void sayHello() {
		System.out.println("Hello sir");
	}

}
