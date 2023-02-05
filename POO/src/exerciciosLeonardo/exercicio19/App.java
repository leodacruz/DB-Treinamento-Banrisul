/*Implemente um sistema de agenda telefonica. Faça (ao menos)
as interacoes de adicionar e deletar numeros.*/

package exercicio19;

public class App {

	public static void main(String[] args) {
	//testar a classe AgendaTelefonica

	//primeio criar uma pessoa 
	Pessoa fuluno = new Pessoa("fulano","999999999");
	
	//criar um telefone
    Telefone telefone = new Telefone("12345", "51");
    
	System.out.println(fuluno.toString() +"\n"+telefone.toString());
	//o numero eh bloqueado, so eh ativado ao aderir a uma pessoa pelo contato

	Contato contato = new Contato(fuluno, telefone);

	//System.out.println(telefone.toString());
	//descomente para confirmar que o numero foi desbloqueado

	//Crio a agenda telefonica
	AgendaTelefonica agenda = new AgendaTelefonica("agendaTelefonica");
	
	// agora adiciono o contato a agenda
	agenda.addContato(contato);

	System.out.println(agenda.toString());

	//tem varios outros metodos em AgendaTelefonica, mas fiquei com preguica de testar todos aqui de
	//uma maneira miuto manual

	}

}
