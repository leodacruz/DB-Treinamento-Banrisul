/*Crie um sistema bancario que suporte diferentes tipos de contas
 * como poupanca e corrente. Essas contas PRECISAM seguir um padrao
 * para saque, deposito e obter o saldo, porem a conta corrente tem um 
 * limite adiiconal de cheque e a conta poupanca nao. faca com que 
 * o calculo de saque leve essa caracteristica em consideracao. 
 * dica: quem define esse padrao de nomenclatura eh o banco e atravez
 * do banco que o sitema vai precisar operar*/
package exercicio1extra;

public class App {

	public static void main(String[] args) {

		// criar as contas

		ContaCorrente contaCorrente = new ContaCorrente(new Pessoa("leoPoupanca", "123"));
		ContaPoupanca contapPoupanca = new ContaPoupanca(new Pessoa("leoPoupanca", "123"));

		// o correto era o banco nao ser de uma unica conta mas de varias,mas ai
		// aumentaria a complexidade e acho que o
		// desafio era outro, mas da pra fazer,preguica agora
		BancoBanrisul bancotestePoupanca = new BancoBanrisul(contapPoupanca);
		BancoBanrisul bancotesteCorrente = new BancoBanrisul(contaCorrente);

		// testar os saques
		System.out.println("Testando saques Poupanca 1 ");
		bancotestePoupanca.saque(10);

		// testar os saques
		System.out.println("\n\nTestando saques Corrente 1 ");
		bancotesteCorrente.saque(10);

		// testar os saques
		System.out.println("\n\nTestando saques Corrente 2 ");
		bancotesteCorrente.saque(1000);

	}
}
