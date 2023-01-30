package operadores;

public class Exemplo {

    public static void main(String[] args) {
        // atribuição
        System.out.println("Atribuicao");
        int numero = 1;
        System.out.println("numero = " + numero);
        int numero2 = 2;
        System.out.println("numero2 = " + numero2);
        numero2 = numero;
        System.out.println("numero2= " + numero2);

        // aritmeticos
        System.out.println("Aritmeticos\n");
        // soma
        System.out.println("Soma");
        int soma = 2 + 2;
        System.out.println("soma = " + soma);
        int soma2 = 2 + soma;
        System.out.println("soma2 = " + soma2);
        int soma3 = soma + soma2;
        System.out.println("soma3 = " + soma3);

        // subtracao
        System.out.println("\nSubtracao");
        int sub = 10 - 5;
        System.out.println("sub = " + sub);
        int sub2 = sub - 2;
        System.out.println("sub = " + sub2);
        int sub3 = sub - sub2;
        System.out.println("sub = " + sub3);

        // multiplicacao
        System.out.println("\nMultiplicacao");
        int mult = 3 * 3;
        System.out.println("mult = " + mult);
        int mult2 = 3 * mult;
        System.out.println("mult2 = " + mult2);
        int mult3 = mult * mult2;
        System.out.println("mult3 = " + mult3);

        // divisao e resto da divisao
        System.out.println("\nDivisao e Resto da divisao");
        double div = 10 / 5;
        System.out.println("Divisao = " + div);
        double rest = div % 2;
        System.out.println("resto = " + rest);

        // extra concatenação
        String nome = "leonardo" + "  " + "cruz";
        System.out.println("Nome= " + nome);

        // incremetno e decremento
        int contador = 1;
        contador++;
        // aqui se for ++contador ele incrementa antes e contador++ incremnta depois
        contador--;
        System.out.println("Contador = " + contador);

        // atribuicao e artimetica
        int numero5 = 1;
        numero5 += 2;
        System.out.println("nuemro5 = " + numero5);

        // comparadores de igualdedade e diferenca
        int numerocomp = 1;
        int numerocomp2 = 2;
        boolean comparacao1 = numerocomp == numerocomp2;
        System.out.println("comparacao1 = " + comparacao1);
        System.out.println("comparacao2 = " + !(numerocomp != numerocomp2));

        // operadores relacionais
        int numerocomp3 = 2;
        int numerocomp4 = 7;
        boolean comparacao2 = numerocomp3 > numerocomp4;
        System.out.println("comparacao2 = " + comparacao2);
        System.out.println("comparacao = " + (numerocomp3 < numerocomp4));

        // opereadore logicos
        boolean expressao1 = false;
        boolean expressao2 = true;
        boolean expressao3 = false;
        System.out.println("expressao = " + (expressao1 && expressao2));
        System.out.println("expressao2 = " + (expressao3 && expressao2));

        System.out.println("expressao OU = " + (expressao3 || expressao2));
        System.out.println("expressao OU2 = " + (expressao3 || expressao1));
    }
}
