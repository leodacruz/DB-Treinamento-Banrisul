package casting;

public class ExemploPromocao {

    public static void main(String[] args) {
        int menor = 150;
        double maior = 150.9;
        double resultado = maior + menor; // evaluate
        System.out.println(resultado);
        
        int menor1 = 150;
        double maior1 = 150.9;
        int resultado1 = ((int)maior1) + menor1; // evaluate
        System.out.println(resultado1);
        
        somar(maior, menor);
    }
    
    static void somar(double op1, double op2) {
        System.out.println(op1 + op2); // evaluate
    }
}
