package exercicio1extra;

public class ContaCorrente extends Conta {

    public ContaCorrente(Pessoa pessoa) {
        super(pessoa);
        setLimiteCheque(3000);
    }

}
