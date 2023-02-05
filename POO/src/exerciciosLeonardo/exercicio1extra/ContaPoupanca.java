package exercicio1extra;

 class ContaPoupanca implements Conta {
    private Pessoa pessoa;
    private long saldo;

     ContaPoupanca(Pessoa pessoa) {
        this.pessoa = pessoa;
        saldo = 0;
    }

    public long getSaldo() {
        return saldo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public boolean deposito(long saldo) {
        this.saldo += saldo;
        return true;
    }

    
     public boolean saque(long valor) {
        this.saldo -= valor;
        return true;
    }

}
