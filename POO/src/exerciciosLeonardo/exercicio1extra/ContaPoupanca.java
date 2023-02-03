package exercicio1extra;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Pessoa pessoa, long saldo) {
        super(pessoa, saldo);
        limiteCheque =100;
    }
    
}
