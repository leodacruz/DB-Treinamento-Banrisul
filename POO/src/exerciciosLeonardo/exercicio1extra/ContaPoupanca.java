package exercicio1extra;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Pessoa pessoa) {
        super(pessoa);
        setLimiteCheque(1000);
    }

}
