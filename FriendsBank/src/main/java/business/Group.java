package business;

import java.util.*;
/**
 * @author Andre Ramos, 53299
 */
public class Group {

	// ...
	private int id;
	private String name;
	public List<Member> members;
	private ArrayList<Member> trustyList;
	
	/**
	 * Creates a Group.
	 * 
	 * @require name != null 
	 * @param String name 	The group name
	 */
	public Group(String name) {
		this.id = new Random().nextInt(11);
		this.name = name;
		this.members = new LinkedList<Member>();
		this.trustyList = new ArrayList<Member>();
		
	}
	
	/**
	 * Returns the id  
	 * @return int
	 */
	public int getId() {
		return id;
	}
	
	
	/**
	 * Returns the name  
	 * @return String
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns the Trusty Depositary from the ArrayList
	 * @return Member
	 */
	public Member getDepositary() {
		return trustyList.get(0);
		
	}
	
	/**
	 * Adds a group member to the group. Turns a User into a Group Member
	 * @require user != null
	 * @param User user	The User to be added 
	 */
	public Member addMember(User user) {
		id = user.getId();
		name = user.getName();
		Account account = user.getAccount();
		Member member = new Member(id, name, this, account);
		members.add(member);
		System.out.println(getName() + " need to add funds to your virtual account \n" );
		return member;
	}
	
	/**
	 * Adds a Trusty Depositary. Given a User, its created a Member
	 * with the same info and its added to the trustyList.
	 * @require user != null
	 * @param User user	The User to be added 
	 */
	public void addTrustyDepositary(User user) {
		id = user.getId();
		name = user.getName();
		Account account = user.getAccount();
		Member member = new Member(id, name, this, account);
		trustyList.add(member);
		members.add(member);
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Group" + getName() + " :");
		for(Member m : trustyList) {
			sb.append("Fiel Deposit�rio - Nome:" + m.getName() + "\n");
		}
		for(Member m : members)
			sb.append("Nome:" + m.getName() + "\n");
		return sb.toString(); 
	}
}
