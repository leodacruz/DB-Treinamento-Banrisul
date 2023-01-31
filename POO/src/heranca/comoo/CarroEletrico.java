package heranca.comoo;

public class CarroEletrico {
    String marca;
    private boolean ligado = false;
    
    boolean sistemaEletricoPronto = false;
    boolean sistemaArPronto = false;
    boolean sistemaFrenagem = false;
    
    public CarroEletrico(String marca) {
        this.marca = marca;
    }
    
    public boolean getLigado() {
        return this.ligado;
    }
    
    public void setLigado(boolean ligado) {
        if (ligado == false) {
            this.ligado = false;      
            this.sistemaEletricoPronto = false;
            this.sistemaArPronto = false;
            this.sistemaFrenagem = false;
            return;
        }
        
        this.ligado = acionarBateriaParaMotorEletrico();
        
        this.sistemaEletricoPronto = this.ligado;
        this.sistemaArPronto = this.ligado;
        this.sistemaFrenagem = this.ligado;
    }
    
    private boolean acionarBateriaParaMotorEletrico() {
        boolean sucesso = true;
        
        // Algoritmo de acionamento de um motor elétrico
        
        return sucesso;
    }
}
