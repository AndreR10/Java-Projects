package use_cases;

import java.util.ArrayList;

// imports do pacote business

import business.*; 

/**
 * @author Andr� Ramos, 53299
 * 
 */
public class HandlerCreateGroup {
	
	// ...
	/**
	 * Cria um handler para criar um grupo, addicionar members 
	 * e um fiel deposit�rio.
	 * Inicia um ArrayList que ir� guardar os groups criados.
	 * 
	 */
	private ArrayList<Group> groups;
	
	public HandlerCreateGroup() {
		this.groups = new ArrayList<Group>();
	}
	
	/**
	 * Cria um grupo 
	 * @param String nome
	 * @return um objecto grupo
	 */
	public Group criarGrupo(User user, String nome) {
		Group group = user.createGroup(nome);
		groups.add(group);
		return group;
	}
	
	/**
	 * Adiciona um utilizador a um grupo especifico 
	 * @require user != null & grupo != null
	 * @param User
	 * @param Group
	 */
	public Member addMembro(User user, Group group) {
		Member mem = group.addMember(user);
		return mem;
	}
	
	
	/**
	 * Adiciona um Fiel Deposit�rio a um grupo especifico 
	 * @require user != null & grupo != null
	 * @param User
	 * @param Group
	 */
	public void addFiel(User user, Group group) {
		group.addTrustyDepositary(user);
	}
	
}
