package heranca.comoointerface;

// Classe implementa o contrato
public class CarroCombustao extends Carro implements ICarro {
    private boolean ligado = false;
    
    public CarroCombustao(String marca) {
        super(marca);
    }
    
    @Override
    public boolean getLigado() {
        return this.ligado;
    }
    
    @Override
    public void setLigado(boolean ligado) {
        if (ligado == false) {
            this.ligado = false;      
            this.sistemaEletricoPronto = false;
            this.sistemaArPronto = false;
            this.sistemaFrenagem = false;
            return;
        }
        
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
