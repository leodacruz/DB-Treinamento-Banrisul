package imports;

import java.util.Random;
import java.util.Scanner;
// import java.util.*;     // Tudo que está dentro dos packages java > util

// import static estaticos.Carro.*; // Tudo que é ESTÁTICO que está dentro da classe Carro
import estaticos.Carro;

public class ExemploImport1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println(Carro.DEFINICAO);
        
        Carro car = Carro.criar("Wolkswagen", 4);
    }
}
