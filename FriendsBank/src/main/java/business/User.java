package business;

import java.util.Random;
/**
 * @author Andre Ramos, 53299
 */

public class User {
	
	private int id;
	private String name;
	private Account account;
	
	/**
	 * Creates a User object.
	 * 
	 * @require name != null 
	 * @param String name 	the name of the User
	 */
	public User(String name) {
		this.id = new Random().nextInt(11);
		this.name = name;
		this.account = new Account();
	}
	
	/**
	 * Returns a id  
	 * @return int the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Returns a name  
	 * @return String the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns an account  
	 * @return Account the account
	 */
	public Account getAccount() {
		return account;
	}
	
	
	/**
	 * Creates and returns a group with a name and adds the user as Trusty Depositary
	 * @param String name	the group name
	 * @return Group 	the group object
	 */
	public Group createGroup(String name) {
		Group group = new Group(name);
		//Member mem = new Member(id, name, grupo, conta);
		group.addTrustyDepositary(this);
		return group;
	}
	
	public void joinGroup(Group group) {
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("I am " + getName() + "\n");
		sb.append("Real Balance = " + account.getRealBalance());
		return sb.toString(); 
	}
}
