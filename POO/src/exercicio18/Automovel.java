package exercicio18;

abstract class Automovel {
	protected String placa;
	protected boolean motorEstado;
	protected String modelo;
	protected boolean ligaraMotor;
	protected boolean freioPuxado;
	protected boolean aceleradorPuxado;

	boolean ligar() {
		return motorEstado;
	}

	boolean freio() {
		return freioPuxado;
	}

	boolean acelerador() {
		return aceleradorPuxado;
	}

}
