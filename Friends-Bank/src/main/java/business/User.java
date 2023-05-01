package business;

import java.util.Random;
/**
 * @author Andr� Ramos, 53299
 */

public class User {
	
	private int id;
	private String name;
	private Account account;
	
	/**
	 * Cria um User.
	 * 
	 * @require name != null 
	 * @param String name 	O name do utilizador
	 */
	public User(String name) {
		this.id = new Random().nextInt(11);
		this.name = name;
		this.account = new Account();
	}
	
	/**
	 * Devolve o id  
	 * @return int
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Devolve o name  
	 * @return String
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Devolve a conta  
	 * @return Conta
	 */
	public Account getAccount() {
		return account;
	}
	
	
	/**
	 * Cria um grupo com o name dado e adiciona este utilizador como
	 * seu Fiel Deposit�rio  
	 * @return Group
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
		sb.append("Sou o " + getName() + "\n");
		sb.append("Saldo Real = " + account.getRealBalance());
		return sb.toString(); 
	}
}
