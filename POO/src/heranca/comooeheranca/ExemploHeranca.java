package heranca.comooeheranca;

public class ExemploHeranca {

    public static void main(String[] args) {
        // Problema: Ligar um carro a combust�o e um el�trico e obter a resposta se os mesmos est�o ligados ou n�o
        CarroCombustao carroComb = new CarroCombustao("Ford");
        carroComb.setLigado(true);
        if (carroComb.getLigado()) {
            System.out.println("Carro combust�o ligado");
        } else {
            System.out.println("Carro combust�o falhou");
        }
        carroComb.buzinar();
        
        CarroEletrico carroElet = new CarroEletrico("Ford");
        carroElet.setLigado(true);
        if (carroElet.getLigado()) {
            System.out.println("Carro el�trico ligado");
        } else {
            System.out.println("Carro el�trico falhou");
        }
        carroElet.buzinar();
        
        Carro carro = new Carro("Ford"); // Problema
        carro.buzinar();
    }

}
