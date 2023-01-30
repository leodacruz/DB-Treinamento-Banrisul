package encapsulamento.base;

public class ExemploEncapsulamento {
    public static void main(String[] args) {
        Classe1 c1 = new Classe1();
        System.out.println(c1.atributoPublic + " " + c1.atributoProtected + " " + c1.atributoDefault);
        System.out.println(c1.metodoPublic() + " " + c1.metodoProtected() + " " + c1.metodoDefault());
    }
}
