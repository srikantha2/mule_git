/**
 * 
 */
package com.bakka.testing.soap;

import javax.jws.WebService;

/**
 * @author prakash
 *
 */
@WebService
public interface IGreetService {
	
	public String wishDaily(String name);

}
