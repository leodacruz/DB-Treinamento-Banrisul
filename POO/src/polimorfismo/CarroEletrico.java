package polimorfismo;

// filha/subclasse/especilizada extends pai/superclasse/generalizada
public class CarroEletrico extends Carro {
private boolean ligado = false;
    
    public CarroEletrico(String marca) {
        super(marca);
    }
    
    // Polimorfismo - overriding: Esse método está sendo sobrescrito da classe pai Carro
    @Override
    public void buzinar() {
        // super.buzinar(); // Caso quisesse acionar o comportamento da classe pai também
        System.out.println("O carro elétrico buzinou!");
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
