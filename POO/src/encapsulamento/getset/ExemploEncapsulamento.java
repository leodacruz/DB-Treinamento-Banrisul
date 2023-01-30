package encapsulamento.getset;

public class ExemploEncapsulamento {

    public static void main(String[] args) {
        // Problema: Ligar um carro e obter a resposta se o mesmo est� ligado ou n�o
        Carro carro = new Carro("Ford");
        
        carro.setLigado(true);
        
        if (carro.getLigado()) {
            System.out.println("Carro ligado");
        } else {
            System.out.println("Carro falhou");
        }
    }
}
