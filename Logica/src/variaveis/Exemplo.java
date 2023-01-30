package variaveis;

import java.time.LocalDate;

public class Exemplo {

    public static void main(String[] args) {

        int aux = 0b1000000000000000000; // binario
        long aux3 = 1111111111111111111l; // o eclipse reclama dai precisa falar que o numero é long
        System.out.println("int = " + aux);
        LocalDate aux2 = LocalDate.now();
        System.out.println("tempo = " + aux2);
        System.out.println("long grande = "+aux3);
    }
}
