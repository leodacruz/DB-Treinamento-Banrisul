package exercicio17;

public class App {

	public static void main(String[] args) {
		Pessoa pai = new Pessoa("RUBENS",60);
		Pessoa mae = new Pessoa("MARCIA",58);
		Pessoa filho =new Pessoa("RUBINHO",30,pai,mae);
		
		System.out.println("Arvore eh \n"+filho.toString());
		

	}

}
