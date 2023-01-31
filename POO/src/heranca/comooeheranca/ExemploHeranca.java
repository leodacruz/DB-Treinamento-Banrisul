package heranca.comooeheranca;

public class ExemploHeranca {

    public static void main(String[] args) {
        // Problema: Ligar um carro a combustão e um elétrico e obter a resposta se os mesmos estão ligados ou não
        CarroCombustao carroComb = new CarroCombustao("Ford");
        carroComb.setLigado(true);
        if (carroComb.getLigado()) {
            System.out.println("Carro combustão ligado");
        } else {
            System.out.println("Carro combustão falhou");
        }
        carroComb.buzinar();
        
        CarroEletrico carroElet = new CarroEletrico("Ford");
        carroElet.setLigado(true);
        if (carroElet.getLigado()) {
            System.out.println("Carro elétrico ligado");
        } else {
            System.out.println("Carro elétrico falhou");
        }
        carroElet.buzinar();
        
        Carro carro = new Carro("Ford"); // Problema
        carro.buzinar();
    }

}
