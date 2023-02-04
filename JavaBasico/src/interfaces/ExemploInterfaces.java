package interfaces;

public class ExemploInterfaces {

    public static void main(String[] args) {
        Funcionario coordenador = new Coordenador();
        Funcionario gerente = new Gerente();
        Funcionario operador = new Operador();
        Funcionario rh = new RH();

        gerente.cumprimentar();
        rh.cumprimentar();
        coordenador.cumprimentar();
        operador.cumprimentar();

        System.out.println();

        gerente.calcularSalario();
        rh.calcularSalario();
        coordenador.calcularSalario();
        operador.calcularSalario();

        System.out.println();

        gerente.baterPonto(0, 0);
        rh.baterPonto(10, 19);
        coordenador.baterPonto(11, 18);
        operador.baterPonto(8, 18);

        System.out.println();

        gerente.cumprirCargaHoraria();
        rh.cumprirCargaHoraria();
        coordenador.cumprirCargaHoraria();
        operador.cumprirCargaHoraria();
    }

    // static void calcularSalarioGerente(Gerente gerente) {
    // System.out.println("Gerente recebe 100% fixo + bônus");
    // };

    // static void calcularSalarioRH(RH rh) {
    // System.out.println("RH recebe 100% fixo");
    // };

    // static void calcularSalarioCoordenador(Coordenador coordenador) {
    // System.out.println("Coordenador recebe 80% fixo e 20% variável por metas atingidas");
    // };

    // static void calcularSalarioOperador(Operador operador) {
    // System.out.println("Operador recebe 100% fixo");
    // };
}
