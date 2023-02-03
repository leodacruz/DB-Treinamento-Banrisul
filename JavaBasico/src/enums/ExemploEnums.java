package enums;

public class ExemploEnums {
    public static void main(String[] args) {
        //System.out.printf("A cor �: %s", VERDE);
        
        System.out.println();
        
        Cores cor = Cores.VERDE;
        System.out.printf("A cor �: %s", cor);
        
        System.out.println();
        
        switch (cor) {
            case VERDE:
                System.out.println("VERDE");
                break;
            case VERMELHO:
                System.out.println("VERMELHO");
                break;
            case AZUL:
                System.out.println("AZUL");
                break;
            default:
                break;
        }
        
        Cores[] cores = Cores.values();
        for (int i = 0; i < cores.length; i++) {
            System.out.println("A cor atual no la�o �: " + cores[i]);
        }
    }
}
