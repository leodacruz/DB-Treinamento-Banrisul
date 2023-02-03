package exercicio18;

public class MotoPartidaPedal extends Moto {

    MotoPartidaPedal(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
        motorEstado = false;
        aceleradorPuxado = false;
    }

    @Override
    boolean ligar() {
        if (aceleradorPuxado == true) {
            motorEstado = true;
        } else {
            motorEstado = false;
        }
        return motorEstado;

    }

    void setAceleradorPuxado(){
        this.aceleradorPuxado = !aceleradorPuxado;
    }

    
    @Override
    public String toString() {
        return "MotoPartidaPedal \nAcelerador esta  = " + (aceleradorPuxado? "Puxado":"Solto")+
        "\nMotor estado = "+(motorEstado?"LIgado":"Desligado") ;
    }
}
