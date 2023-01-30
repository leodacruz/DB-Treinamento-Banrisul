package encapsulamento.execucao;

import encapsulamento.base.Classe1;

public class Classe2 extends Classe1 {
    public String getAtributoProtected() {
        return this.atributoProtected;
    }
    
    public String proxyMetodoProtected() {
        return this.metodoProtected();
    }
}
