package interfaces;

/*
 * Esse uso de Pessoa aqui é redundante, pois Funcionario já tem Pessoa "emendada" com ele
 * Faça isso só se você tiver alguma preocupação que em algum momento no futuro Pessoa
 * possa ser "desemendada" de Funcionario, e você quer garantir garantir que RH continuará
 * implementando pessoa
 * */
public class RH implements Funcionario, Pessoa {
    // Cumprindo com o contrato de Pessoa (porque Funcionario tem Pessoa "emendado")
    @Override
    public void cumprimentar() {
        System.out.println(this.getClass().getSimpleName() + " diz: Bommmm diaaaaaa!");
    }
    
    // Cumprindo com o contrato de Funcionario
    @Override
    public void cumprirCargaHoraria() {
        System.out.println(this.getClass().getSimpleName() + " não cumpriu muito bem sua carga horária, pois ela é mais flexível");
    }
    // Cumprindo com o contrato de Funcionario
    @Override
    public void calcularSalario() {
        System.out.println(this.getClass().getSimpleName() + " recebe 50% fixo e 50% variável por pessoas captadas");
    }
}
