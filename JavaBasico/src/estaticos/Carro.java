package estaticos;

public /*final*/ class Carro { // Pai
    private String marca;
    private int rodas;
    
    protected Carro(String marca, int rodas) {
        this.marca = marca;
        this.rodas = rodas;
    }
    
    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getRodas() {
        return this.rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    
    public final void ligar() { 
        System.out.println("Ligou!");
    }
    
    
    public static final String DEFINICAO = "Carro";
        
    public static Carro criar(String marca, int rodas) {
        return new Carro(marca, rodas);
    }
}
