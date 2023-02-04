package interfaces;

// Uma interface pode herdar de outra, ent�o aqui Funcinario est� "emendando" o contrato de Pessoa com o seu pr�rpio
public interface Funcionario extends Pessoa {
    /*
     * Quem seguir esse contrato, PRECISA ter no SEU CORPO uma implementa��o de todos os m�todos 
     * (n�o default) abaixo. Os default ser�o OPCIONAIS 
     * */
    
    void cumprirCargaHoraria();
    
    void calcularSalario();
    
    /*
     * Nota: como este est� como "default" ele j� pode ter um corpo definido aqui, e 
     * os implementantes do contrato tem ent�o a op��o de decidir fazer a sua pr�pria
     * implementa��o ou n�o (se decidirem por n�o, a "padr�o" ser� a implementa��o deles) 
     * */
    default void baterPonto(int inicio, int fim) {
        System.out.println(this.getClass().getSimpleName() + " bate o ponto das " + inicio + " at� as " + fim);
    };
}
