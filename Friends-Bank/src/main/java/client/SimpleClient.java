package client;

// descomentar caso opte por usar handlers:

// import use_cases.HandlerJoinTheGroup;
// import use_cases.HandlerFazerPagamento;

import business.*;

import use_cases.*;

/**
 * Cliente simples
 *	
 * @author Andr� Ramos, 53299
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
		
		System.out.println("Banca de Amigos");
		System.out.println("-------------------");
		
		//Criar um utilizador que ser� o Fiel Deposit�rio
		User andre = new User("Andr�");
		System.out.println(andre);
		System.out.println("----");
		
		HandlerCreateGroup hfg = new HandlerCreateGroup();
		
		// CRIAR GRUPO
		Group grupo1 = hfg.criarGrupo(andre, "Grupo1");
		
		//Fiel Deposit�rio
		Member fiel = grupo1.getDepositary();
		
		// Ver quem � o fiel Deposit�rio do grupo
		System.out.println("O Fiel Deposit�rio do grupo �: " + fiel.getName());
		System.out.println("----");
		
		// Criar um segundo utilizador
		User miguel = new User("Miguel");
		System.out.println(miguel);
		System.out.println("----");
		
		//Adicionar esse utilizador ao grupo
		Member membro2 = hfg.addMembro(miguel, grupo1);
		
		//REFOR�AR CONTA VIRTUAL
		membro2.increaseAccount(200);
		
		System.out.println("O " + membro2.getName() + " refor�ou a sua conta virtual com " + membro2.getAccount().getVirtualBalance());
		System.out.println("O Fiel Deposit�rio tem na sua conta real:" + fiel.getAccount().getRealBalance());
		System.out.println("----");
		
		//FAZER PAGAMENTO
		System.out.println("O " + membro2.getName() + " vai fazer um pagamento de 20 ao Fiel Deposit�rio");
		membro2.pay(fiel, 20);
		System.out.println("----");
		
		System.out.println("O " + membro2.getName() + " tem agora " + membro2.getAccount().getVirtualBalance());
		System.out.println("O " + fiel.getName() + " tem agora " + fiel.getAccount().getVirtualBalance());
		System.out.println("----");
		
		//ENTRAR NO GRUPO
		HandlerJoinTheGroup entrar = new HandlerJoinTheGroup();
		
		User rui = new User("Rui");
		System.out.println(rui);
		System.out.println("----");
		System.out.println("O " + rui.getName() + " vai fazer um pedido para entrar no grupo \n");
		
		//Entrar no Group atrav�s de vota��o
		entrar.join(rui, grupo1);
		
		
		
		
		
	}
}
