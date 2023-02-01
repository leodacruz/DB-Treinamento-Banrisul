package exercicio18;

 class Carro extends Automovel {

    @Override
    boolean ligar() {
        return motorEstado;
    }

    @Override
    boolean freio() {
        return freioPuxado;
    }

    @Override
    boolean acelerador() {
        return aceleradorPuxado;
    }

}
