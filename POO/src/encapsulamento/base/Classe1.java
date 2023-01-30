package encapsulamento.base;

public class Classe1 {
    private String atributoPrivate = "c1 private";
    protected String atributoProtected = "c1 protected";
    /* default */ String atributoDefault = "c1 default";
    public String atributoPublic = "c1 public";
    
    private String metodoPrivate() { return this.atributoPrivate; }
    protected String metodoProtected() { return this.atributoProtected; }
    String metodoDefault() { return this.atributoDefault; }
    public String metodoPublic() { return this.atributoPublic; }
}
