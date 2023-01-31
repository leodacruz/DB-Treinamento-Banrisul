package polimorfismo;

public class ExemploPolimorfismo {

    public static void main(String[] args) {
        Concessionaria conc = new Concessionaria();
        
        CarroCombustao carroComb = new CarroCombustao("Ford");
        CarroEletrico carroElet = new CarroEletrico("Tesla");
        
        conc.revisar(carroComb); // Objeto CarroCombustao, por herdar de Carro, consegue se transformar em Carro temporariamente para passar como parâmetro no método
        conc.revisar(carroElet); // Objeto CarroEletrico, por herdar de Carro, consegue se transformar em Carro temporariamente para passar como parâmetro no método
    }
}
