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
	 * Creates a Payment.
	 * 
	 * @require mem != null, value != null 
	 * @param Member mem 	The member that will be paied
	 * @param double value	The value to pay
	 */
	public Payment(Member mem, double value) {
		this.id = new Random().nextInt(11);
		this.recipient = mem;
		this.value = value;
		
	}
	
	/**
	 * Returns the value  
	 * @return double
	 */
	public double getValue() {
		return value;
	}
	
	/**
	 * Efectua o pagamento ao destinat�rio  
	 */
	public void submit() {
		recipient.getAccount().addsValueRealBalance(value);
	}
	
	
	
}
