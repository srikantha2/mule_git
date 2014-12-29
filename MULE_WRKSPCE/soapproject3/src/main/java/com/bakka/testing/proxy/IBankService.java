/**
 * 
 */
package com.bakka.testing.proxy;

import javax.jws.WebService;

/**
 * @author prakash
 *
 */
@WebService
public interface IBankService {

	MoneyResponse sendMoney(MoneyRequest mrq);
	
}
