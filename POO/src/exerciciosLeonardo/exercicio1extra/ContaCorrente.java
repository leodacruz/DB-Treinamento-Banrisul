package exercicio1extra;

public class ContaCorrente extends Conta {

    
    public ContaCorrente(Pessoa pessoa, long saldo) {
        super(pessoa, saldo);
        limiteCheque = 3000;
    }
    
}
