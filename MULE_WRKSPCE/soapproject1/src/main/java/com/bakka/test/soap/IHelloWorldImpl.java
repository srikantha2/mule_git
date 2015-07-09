/**
 * 
 */
package com.bakka.test.soap;

import javax.jws.WebService;

/**
 * @author prakash
 *
 */

public class IHelloWorldImpl implements IHelloWorld {

	/* (non-Javadoc)
	 * @see com.bakka.test.soap.IHelloWorld#wishAll(java.lang.String)
	 */
	@Override
	public String wishAll(String name) {
		System.out.println("your hitting the actual service here");
		return "Hello Mr."+name+", Good Morning!!";
	}

}
