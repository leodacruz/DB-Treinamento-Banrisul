package heranca.semoo;

public class Carro {
    String marca;
    private boolean ligado = false;
    
    int tipo; // 1 Combustão | 2 Elétrico
    
    boolean sistemaEletricoPronto = false;
    boolean sistemaArPronto = false;
    boolean sistemaFrenagem = false;
    
    public Carro(String marca, int tipo) {
        this.marca = marca;
        this.tipo = tipo;
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
        
        if (tipo == 1) this.ligado = acionarMotorACombustao();
        else this.ligado = acionarBateriaParaMotorEletrico();
        
        this.sistemaEletricoPronto = this.ligado;
        this.sistemaArPronto = this.ligado;
        this.sistemaFrenagem = this.ligado;
    }
    
    private boolean acionarBateriaParaMotorEletrico() {
        boolean sucesso = true;
        
        // Algoritmo de acionamento de um motor elétrico
        
        return sucesso;
    }
    
    
    private boolean acionarMotorACombustao() {
        boolean sucesso = true;
        
        sucesso = executarTempo1();
        if (sucesso == false) {
            return false;
        }
        sucesso = executarTempo2();
        if (sucesso == false) {
            return false;
        }
        sucesso = executarTempo3();
        if (sucesso == false) {
            return false;
        }
        sucesso = executarTempo4();
        if (sucesso == false) {
            return false;
        }
        
        return sucesso;
    }
    
    private boolean executarTempo1() {
        return true; // mistura ar e combustivel
    }
    private boolean executarTempo2() {
        return true; // gera pressão
    }
    private boolean executarTempo3() {
        return true; // gerar combustão
    }
    private boolean executarTempo4() {
        return true; // libera os gases da combustão
    }
}
