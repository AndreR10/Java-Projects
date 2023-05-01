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
	 * Cria um Group.
	 * 
	 * @require name != null 
	 * @param String name 	O name do grupo
	 */
	public Group(String name) {
		this.id = new Random().nextInt(11);
		this.name = name;
		this.members = new LinkedList<Member>();
		this.trustyList = new ArrayList<Member>();
		
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
	 * Devolve o Fiel Deposit�rio do ArrayList
	 * @return Member
	 */
	public Member getDepositary() {
		return trustyList.get(0);
		
	}
	
	/**
	 * Adiciona um membro ao grupo. � dado um User e criado um
	 * Member com os mesmo dados e adicionado � members.
	 * @require user != null
	 * @param User user	O utilizador a ser adicionado 
	 */
	public Member addMember(User user) {
		id = user.getId();
		name = user.getName();
		Account account = user.getAccount();
		Member mem = new Member(id, name, this, account);
		members.add(mem);
		System.out.println(getName() + " tem de adicionar fundos � sua conta virtual \n" );
		return mem;
	}
	
	/**
	 * Adiciona um fiel deposit�rio. � dado um User e criado um
	 * Member com os mesmo dados e adicionado � trustyList.
	 * @require user != null
	 * @param User user	O utilizador a ser adicionado 
	 */
	public void addTrustyDepositary(User user) {
		id = user.getId();
		name = user.getName();
		Account account = user.getAccount();
		Member mem = new Member(id, name, this, account);
		trustyList.add(mem);
		members.add(mem);
		
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
