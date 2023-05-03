package business;

/**
 * @author Andre Ramos, 53299
 */
public class Account {
	
	private double realBalance;
	private double virtualBalance;
	
	/**
	 * Create an account.
	 */
	public Account(){
		this.realBalance = 1000.00;
		this.virtualBalance = 0;
	}
	
	/**
	 * Returns the realBalance  
	 * @return double
	 */
	public double getRealBalance() {
		return realBalance;
	}
	
	/**
	 * Returns the virtualBalance  
	 * @return double
	 */
	public double getVirtualBalance() {
		return virtualBalance;
	}
	
	/**
	 * Sets the realBalance  
	 * @require value != null
	 * @param double value the value for the realBalance
	 */
	public void setRealBalance(double value) {
		realBalance = value;
	}
	
	/**
	 * Sets the virtualBalance
	 * @require value != null
	 * @param double value	The value for the virtualBalance
	 */
	public void setVirtualBalance(double value) {
		virtualBalance = value;
	}
	
	/**
	 * Adds value to the realBalance
	 * @require val != null
	 * @param double value	The value to be added to the realBalance   
	 */
	public void addsValueRealBalance(double value) {
		realBalance = realBalance + value;
	}
	
	/**
	 * Subtracts a value from realBalance
	 * @require vale != null
	 * @param double value	The value to be subtracted from the realBalance   
	 */
	public void subtractsValueRealBalance(double value) {
		realBalance = realBalance - value;
	}
	
	/**
	 * Adds a value to the virtualBalance
	 * @require value != null
	 * @param double value	The value to be added to the virtualBalance  
	 */
	public void addValueVirtualBalance(double value) {
		virtualBalance = virtualBalance + value;
	}
	
	/**
	 * Subtracts a value from the vitualBalance
	 * @require value != null
	 * @param double value	The value to be subtracted from the virtualBalance  
	 */
	public void subtractsValueVirtualBalance(double value) {
		virtualBalance = virtualBalance - value;
	}
	
	
}
