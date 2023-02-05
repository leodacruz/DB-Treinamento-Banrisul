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

		// criando o banco e add as contas nele
		BancoBanrisul bancoteste = new BancoBanrisul();
		bancoteste.addConta(contapPoupanca);// add as contas
		bancoteste.addConta(contaCorrente);

		// testar os saques
		System.out.println("Testando saques Poupanca 1 ");
		bancoteste.saque(10, contapPoupanca);

		// testar os saques
		System.out.println("\n\nTestando saques Corrente 1 ");
		bancoteste.saque(10, contaCorrente);

		// testar os saques
		System.out.println("\n\nTestando saques Corrente 2 ");
		bancoteste.saque(1000, contaCorrente);

	}
}
