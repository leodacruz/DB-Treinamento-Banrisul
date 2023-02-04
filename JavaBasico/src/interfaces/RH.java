package interfaces;

/*
 * Esse uso de Pessoa aqui � redundante, pois Funcionario j� tem Pessoa "emendada" com ele
 * Fa�a isso s� se voc� tiver alguma preocupa��o que em algum momento no futuro Pessoa
 * possa ser "desemendada" de Funcionario, e voc� quer garantir garantir que RH continuar�
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
        System.out.println(this.getClass().getSimpleName() + " n�o cumpriu muito bem sua carga hor�ria, pois ela � mais flex�vel");
    }
    // Cumprindo com o contrato de Funcionario
    @Override
    public void calcularSalario() {
        System.out.println(this.getClass().getSimpleName() + " recebe 50% fixo e 50% vari�vel por pessoas captadas");
    }
}
