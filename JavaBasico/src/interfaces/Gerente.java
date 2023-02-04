package interfaces;

public class Gerente implements Funcionario {
    // Cumprindo com o contrato de Pessoa (porque Funcionario tem Pessoa "emendado")
    @Override
    public void cumprimentar() {
        System.out.println(this.getClass().getSimpleName() + " diz: Bom dia senhores!");
    }
    
    // Cumprindo com o contrato de Funcionario
    @Override
    public void cumprirCargaHoraria() {
        System.out.println(this.getClass().getSimpleName() + " n�o tem uma carga hor�ria muito bem definida");
    }
    // Cumprindo com o contrato de Funcionario
    @Override
    public void calcularSalario() {
        System.out.println(this.getClass().getSimpleName() + " recebe 100% fixo + b�nus");
    }
    
    // Aqui decidiu-se criar uma pr�pria vers�o, ignorando a default que j� existia no contrato Funcionario
    @Override
    public void baterPonto(int inicio, int fim) {
        // Funcionario.super.baterPonto(inicio, fim);
        System.out.println(this.getClass().getSimpleName() + " n�o precisa bater o ponto, a carga hor�ria dele � doida");
    }
}
