/**
 * 
 */
package com.bakka.testing.soap;

/**
 * @author prakash
 *
 */
public class IGreetServiceImpl implements IGreetService {

	/* (non-Javadoc)
	 * @see com.bakka.testing.soap.IGreetService#wishDaily(java.lang.String)
	 */
	@Override
	public String wishDaily(String name) {
		return "Good Morning Mr."+name;
	}
}