package exercicio1extra;

interface Conta {

    long getSaldo();

    Pessoa getPessoa();

    boolean deposito(long saldo);

    boolean saque(long valor);

}
