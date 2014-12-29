/**
 * 
 */
package com.bakka.testing.proxy;

/**
 * @author prakash
 * 
 */
public class IBankServiceImpl implements IBankService {
	private final int MAX = 999999;

	private final int MIN = 100000;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bakka.testing.proxy.IBankService#sendMoney(com.bakka.testing.proxy
	 * .MoneyRequest)
	 */
	@Override
	public MoneyResponse sendMoney(MoneyRequest mrq) {
		MoneyResponse response = new MoneyResponse();
		response.setSender(mrq.getSender());
		response.setReceiver(mrq.getReceiver());
		response.setAmount(mrq.getAmount());
		response.setOrigin(mrq.getOrigin());
		response.setDestination(mrq.getDestination());
		response.setConfirmationNumber((int) (Math.random() * (MAX - MIN) + MIN));
		return response;
	}

}
