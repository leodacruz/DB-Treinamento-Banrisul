package polimorfismo;

// filha/subclasse/especilizada extends pai/superclasse/generalizada
public class CarroCombustao extends Carro {
    private boolean ligado = false;
    
    public CarroCombustao(String marca) {
        super(marca);
    }
    
    // Polimorfismo - overriding: Esse método está sendo sobrescrito da classe pai Carro
    @Override
    public void buzinar() {
        // super.buzinar(); // Caso quisesse acionar o comportamento da classe pai também
        System.out.println("O carro de combustão buzinou!");
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
