package client;

// descomentar caso opte por usar handlers:

// import use_cases.HandlerJoinTheGroup;
// import use_cases.HandlerFazerPagamento;

import business.*;

import use_cases.*;

/**
 * Cliente simples
 *	
 * @author Andre Ramos, 53299
 * @version 1.1
 */
public class SimpleClient {

	/**
	 * A simple interaction with the application services
	 * 
	 * @param args Command line parameters
	 */
	public static void main(String[] args) {
		
		// uso das classes do pacote business
		
		System.out.println("Friends Bank");
		System.out.println("-------------------");
		 
		// Creates a user that will be a Trusty Depositary
		User andre = new User("Andre");
		System.out.println(andre);
		System.out.println("----");
		
		HandlerCreateGroup hfg = new HandlerCreateGroup();
		
		// Creates a Group Group1
		Group group1 = hfg.criarGrupo(andre, "Group1");
		
		
		// Check who is the group Trusty Depositary
		// Trusty Depositary
		Member trusty = group1.getDepositary();
		System.out.println("The Trusty Depositary of the group is: " + trusty.getName());
		System.out.println("----");
		
		// Creates a second user
		User miguel = new User("Miguel");
		System.out.println(miguel);
		System.out.println("----");
		
		// Add the second user to the Group1
		Member member2 = hfg.addMembro(miguel, group1);
		
		// Add funds to the member2 virtual account
		member2.increaseAccount(200);
		
		System.out.println("The " + member2.getName() + " have added funds to his virtual account " + member2.getAccount().getVirtualBalance());
		System.out.println("The Trusty Depositary has in his real account:" + trusty.getAccount().getRealBalance());
		System.out.println("----");
		
		// Making a payment
		System.out.println("The " + member2.getName() + " will make a payment of 20 to the Trusty Depositary");
		member2.pay(trusty, 20);
		System.out.println("----");
		
		System.out.println("The " + member2.getName() + " has " + member2.getAccount().getVirtualBalance());
		System.out.println("The " + trusty.getName() + " has " + trusty.getAccount().getVirtualBalance());
		System.out.println("----");
		
		// Join a group
		HandlerJoinTheGroup join = new HandlerJoinTheGroup();
		
		User rui = new User("Rui");
		System.out.println(rui);
		System.out.println("----");
		System.out.println(rui.getName() + " will make a request to join the group1 \n");
		
		// Joining the group through vote 
		join.join(rui, group1);
		
		
		
		
		
	}
}
