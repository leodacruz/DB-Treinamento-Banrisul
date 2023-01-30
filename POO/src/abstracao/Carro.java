package abstracao;

public class Carro {
    String marca;
    boolean ligado = false;
    
    boolean sistemaEletricoPronto = false;
    boolean sistemaArPronto = false;
    boolean sistemaFrenagem = false;
    
    public Carro(String marca) {
        this.marca = marca;
    }
    
    void ligar() {
        this.ligado = acionarMotorACombustao();
        
        this.sistemaEletricoPronto = this.ligado;
        this.sistemaArPronto = this.ligado;
        this.sistemaFrenagem = this.ligado;
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
