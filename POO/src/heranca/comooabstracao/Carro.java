package heranca.comooabstracao;

public abstract class Carro {
    String marca;
    int rodas;
    
    boolean sistemaEletricoPronto = false;
    boolean sistemaArPronto = false;
    boolean sistemaFrenagem = false;
    
    public Carro(String marca) {
        this.marca = marca;
    }
    
    public void buzinar() {
        System.out.println(this.getClass().getSimpleName() + " buzinou!");
    }
    
    public abstract boolean getLigado();
    
    public abstract void setLigado(boolean ligado);
}

