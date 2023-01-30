package encapsulamento.execucao;

import encapsulamento.base.Classe1;

public class ExemploEncapsulamentoExec {

    public static void main(String[] args) {
        Classe1 c1 = new Classe1();
        System.out.println(c1.atributoPublic);
        System.out.println(c1.metodoPublic());
        
        Classe2 c2 = new Classe2();
        System.out.println(c2.atributoPublic + " " + c2.getAtributoProtected());
        System.out.println(c2.metodoPublic() + " " + c2.proxyMetodoProtected());
    }

}
