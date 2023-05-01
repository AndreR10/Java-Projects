package business;

import java.util.Random;
/**
 * @author Andr� Ramos, 53299
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
	 * Devolve o id do membro 
	 * @return int id
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Devolve a conta do membro 
	 * @return Conta conta
	 */
	public Account getAccount() {
		return account;
	}
	
	/**
	 * Devolve o saldo virtual da conta
	 * @return double 
	 */
	public double getBalance() {
		return account.getVirtualBalance();
	}
	
	public String vote() {
		int vote = new Random().nextInt(2);
		if(vote == 1) {
			return "ACCEPT";
		}else {
			return "REJECT";
		}
	}
	
	public void increaseAccount(double value) {
		Account trustyAccount = group.getDepositary().getAccount();
		trustyAccount.addsValueRealBalance(value);
		account.subtractsValueRealBalance(value);
		// account.addValue(value);
	}
	
	/**
	 * Efetua o pagamento entre dois members de um group
	 * Cria um objecto do tipo pagamento com o membro que ser� pago e o valor a pagar
	 * subtraindo esse valor da conta virtual do membro que iniciou o processo
	 * @require Member mem != null, valor != null
	 * @param  Member mem  	O membro que ser� pago
	 * @param double valor 	O valor a pagar
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
