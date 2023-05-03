package business;

import java.util.*;
/**
 * @author Andre Ramos, 53299
 */
public class Payment {

	
	private int id;
	private double value;
	private Member recipient;
	

	/**
	 * Creates a Payment object.
	 * @require mem != null, value != null 
	 * @param Member mem 	The member that will receive the payment
	 * @param double value	The value to be paid
	 */
	public Payment(Member mem, double value) {
		this.id = new Random().nextInt(11);
		this.recipient = mem;
		this.value = value;
		
	}
	
	/**
	 * Returns a value  
	 * @return double the value
	 */
	public double getValue() {
		return value;
	}
	
	/**
	 * Executes the payment to the recepient
	 */
	public void submit() {
		recipient.getAccount().addsValueRealBalance(value);
	}
	
	
	
}
