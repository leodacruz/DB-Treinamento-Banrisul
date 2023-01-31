package heranca.semoo;

import heranca.semoo.Carro;

public class ExemploHeranca {

    public static void main(String[] args) {
        // Problema: Ligar um carro a combustão e um elétrico e obter a resposta se os mesmos estão ligados ou não
        Carro carroComb = new Carro("Ford", 1);
        carroComb.setLigado(true);
        if (carroComb.getLigado()) {
            System.out.println("Carro combustão ligado");
        } else {
            System.out.println("Carro combustão falhou");
        }
        
        Carro carroElet = new Carro("Ford", 2);
        carroElet.setLigado(true);
        if (carroElet.getLigado()) {
            System.out.println("Carro elétrico ligado");
        } else {
            System.out.println("Carro elétrico falhou");
        }
    }

}
