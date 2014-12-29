package com.bakka.testing.proxy;

public class MoneyResponse {

	 private String sender;
	    private String receiver;
	    private String origin;
	    private String destination;
	    private String amount;
	    private int confirmationNumber;
		/**
		 * @return the sender
		 */
		public String getSender() {
			return sender;
		}
		/**
		 * @param sender the sender to set
		 */
		public void setSender(String sender) {
			this.sender = sender;
		}
		/**
		 * @return the receiver
		 */
		public String getReceiver() {
			return receiver;
		}
		/**
		 * @param receiver the receiver to set
		 */
		public void setReceiver(String receiver) {
			this.receiver = receiver;
		}
		/**
		 * @return the origin
		 */
		public String getOrigin() {
			return origin;
		}
		/**
		 * @param origin the origin to set
		 */
		public void setOrigin(String origin) {
			this.origin = origin;
		}
		/**
		 * @return the destination
		 */
		public String getDestination() {
			return destination;
		}
		/**
		 * @param destination the destination to set
		 */
		public void setDestination(String destination) {
			this.destination = destination;
		}
		/**
		 * @return the amount
		 */
		public String getAmount() {
			return amount;
		}
		/**
		 * @param amount the amount to set
		 */
		public void setAmount(String amount) {
			this.amount = amount;
		}
		/**
		 * @return the confirmationNumber
		 */
		public int getConfirmationNumber() {
			return confirmationNumber;
		}
		/**
		 * @param confirmationNumber the confirmationNumber to set
		 */
		public void setConfirmationNumber(int confirmationNumber) {
			this.confirmationNumber = confirmationNumber;
		}
}
