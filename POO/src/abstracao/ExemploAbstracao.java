package abstracao;

public class ExemploAbstracao {

    public static void main(String[] args) {
        // Problema: Ligar um carro e obter a resposta se o mesmo está ligado ou não
        Carro carro = new Carro("Ford");
        
        carro.ligar();
        
        if (carro.ligado) {
            System.out.println("Carro ligado");
        } else {
            System.out.println("Carro falhou");
        }
    }
}
