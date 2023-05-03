package business;

import java.util.Random;
/**
 * @author Andre Ramos, 53299
 */
public class Member {
	
	private int id;
	private String name;
	private Group group;
	private Account account; 
	
	/**
	 * Creates a Member.
	 * 
	 * @require id != null, name != null, group != null, account != null 
	 * @param int The member id
	 * @param String name The member's name
	 * @param Group group The member's group
	 * @param Account account The member's account
	 */
	public Member(int id, String name, Group group, Account account) {
		this.id = id;
		this.name = name;
		this.group = group;
		this.account = account;
		
	}
	
	/**
	 * Returns the member id  
	 * 
	 * @return int id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Returns the Member id 
	 * @return int id
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns the Member's Account 
	 * @return Conta conta
	 */
	public Account getAccount() {
		return account;
	}
	
	/**
	 * Returns the virtual balance
	 * @return double 
	 */
	public double getBalance() {
		return account.getVirtualBalance();
	}
	
	/**
	 * Returns the decision of a User joining a group
	 * @return String accepted or rejected depending on the number of vote  
	 */
	public String vote() {
		int vote = new Random().nextInt(2);
		if(vote == 1) {
			return "ACCEPT";
		}else {
			return "REJECT";
		}
	}
	
	/**
	 * Adds a value to the Trusty Depositary Account
	 * @param double the value to be added 
	 */
	public void increaseAccount(double value) {
		Account trustyAccount = group.getDepositary().getAccount();
		trustyAccount.addsValueRealBalance(value);
		// account.subtractsValueRealBalance(value);
		// account.addValue(value);
	}
	
	/**
	 * Makes a payment on behalf of a member and subtracts the payment amount from the member's virtual balance.
	 * @require Member mem != null, valor != null
	 * @param  Member mem  	the member receiving the payment 
	 * @param double value 	the amount to be paid
	 */
	public void pay(Member mem, double value) {
		Payment payment = new Payment(mem, value);
		payment.submit();
		account.subtractsValueVirtualBalance(value);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Sou amigo do group" + group.getName() +", e chamo-me " + this.getName());
		return sb.toString(); 
	}
}
