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
        System.out.println(this.getClass().getSimpleName() + " não tem uma carga horária muito bem definida");
    }
    // Cumprindo com o contrato de Funcionario
    @Override
    public void calcularSalario() {
        System.out.println(this.getClass().getSimpleName() + " recebe 100% fixo + bônus");
    }
    
    // Aqui decidiu-se criar uma própria versão, ignorando a default que já existia no contrato Funcionario
    @Override
    public void baterPonto(int inicio, int fim) {
        // Funcionario.super.baterPonto(inicio, fim);
        System.out.println(this.getClass().getSimpleName() + " não precisa bater o ponto, a carga horária dele é doida");
    }
}
