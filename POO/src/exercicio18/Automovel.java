package exercicio18;

abstract class Automovel {
    protected String placa;
	protected boolean motorEstado;
	protected String modelo;
	protected boolean ligaraMotor;
	protected boolean freioPuxado;
    protected boolean aceleradorPuxado;
	
	
	abstract boolean ligar();
	abstract boolean freio();
	abstract boolean acelerador();

}
