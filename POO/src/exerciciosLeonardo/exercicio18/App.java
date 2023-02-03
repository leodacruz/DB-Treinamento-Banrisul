package exercicio18;

public class App {

	public static void main(String[] args) {

		CarroAutomatico UnoEletrico = new CarroAutomatico("Uno", "SUE653");
		System.out.println(UnoEletrico.toString());
		MotoPartidaPedal bis = new MotoPartidaPedal("Uno", "SYST256");
		System.out.println(bis.toString());
		Guincho seguro = new Guincho("CAMINHAO seguro", "DSUDU67");
		System.out.println(seguro.toString());

		// ligando
		System.out.println("\n\nLigando os Motores");
		UnoEletrico.setFreioPuxado();
		System.out.println("Uno " + (UnoEletrico.ligar() ? "Ligou!!" : "Falhou!!"));
		bis.setAceleradorPuxado();
		System.out.println("Bis " + (bis.ligar() ? "Ligou!!" : "Falhou!!"));
		bis.setAceleradorPuxado();
		// antes de guinchar
		System.out.println("\n\nInformacao final dos veiculos");
		System.out.println(UnoEletrico);
		System.out.println(bis.toString());

		System.out.println("Tenatativa de guinchar o ");
	    System.out.println("Uno "+seguro.guinchar(UnoEletrico));
		System.out.println("Tenatativa de guinchar o ");
	    System.out.println("bis"+seguro.guinchar(bis));
	}
}
