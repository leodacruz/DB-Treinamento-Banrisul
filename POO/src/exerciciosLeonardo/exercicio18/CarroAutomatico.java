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
        } else {
            motorEstado = false;
        }
        return motorEstado;

    }

    void setFreioPuxado(){
        this.freioPuxado = !freioPuxado;
    }

    
    @Override
    public String toString() {
        return "CarroAutomatico \nFreio = " + (freioPuxado? "Puxado":"Solto")+
        "\nMotor estado = "+(motorEstado?"LIgado":"Desligado") ;
    }

    
}
