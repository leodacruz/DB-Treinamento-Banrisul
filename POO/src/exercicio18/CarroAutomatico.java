package exercicio18;

final public class CarroAutomatico extends Carro {
   
    CarroAutomatico(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
        motorEstado = false;
        freioPuxado = false;
    }

    @Override
    boolean ligar() {
        if (freioPuxado == true) {
            motorEstado = true;
            return true;
        } else {
            motorEstado = false;
        }
        return motorEstado;

    }
}
