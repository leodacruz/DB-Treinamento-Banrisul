package heranca.semoo;

import heranca.semoo.Carro;

public class ExemploHeranca {

    public static void main(String[] args) {
        // Problema: Ligar um carro a combust�o e um el�trico e obter a resposta se os mesmos est�o ligados ou n�o
        Carro carroComb = new Carro("Ford", 1);
        carroComb.setLigado(true);
        if (carroComb.getLigado()) {
            System.out.println("Carro combust�o ligado");
        } else {
            System.out.println("Carro combust�o falhou");
        }
        
        Carro carroElet = new Carro("Ford", 2);
        carroElet.setLigado(true);
        if (carroElet.getLigado()) {
            System.out.println("Carro el�trico ligado");
        } else {
            System.out.println("Carro el�trico falhou");
        }
    }

}
