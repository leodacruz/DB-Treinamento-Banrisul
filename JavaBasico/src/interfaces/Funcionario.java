package interfaces;

// Uma interface pode herdar de outra, então aqui Funcinario está "emendando" o contrato de Pessoa com o seu prórpio
public interface Funcionario extends Pessoa {
    /*
     * Quem seguir esse contrato, PRECISA ter no SEU CORPO uma implementação de todos os métodos 
     * (não default) abaixo. Os default serão OPCIONAIS 
     * */
    
    void cumprirCargaHoraria();
    
    void calcularSalario();
    
    /*
     * Nota: como este está como "default" ele já pode ter um corpo definido aqui, e 
     * os implementantes do contrato tem então a opção de decidir fazer a sua própria
     * implementação ou não (se decidirem por não, a "padrão" será a implementação deles) 
     * */
    default void baterPonto(int inicio, int fim) {
        System.out.println(this.getClass().getSimpleName() + " bate o ponto das " + inicio + " até as " + fim);
    };
}
