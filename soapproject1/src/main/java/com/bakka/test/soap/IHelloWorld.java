/**
 * 
 */
package com.bakka.test.soap;

import javax.jws.WebService;

/**
 * @author prakash
 *
 */
@WebService
public interface IHelloWorld {
	
	public String wishAll(String name);

}
