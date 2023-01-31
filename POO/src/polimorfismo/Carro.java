package polimorfismo;

public class Carro {
    String marca;
    int rodas;
    int marchaAtual;
    
    boolean sistemaEletricoPronto = false;
    boolean sistemaArPronto = false;
    boolean sistemaFrenagem = false;
    
    public Carro(String marca) {
        this.marca = marca;
    }
    
    // Polimorfismo - overriding: Esse método está sendo sobrescrito nas classes CarroCombustao e CarroEletrico
    public void buzinar() {
        System.out.println("O carro (como aqui estou na classe base, não sei qual é o tipo) buzinou!");
    }
    
    // Polimorfismo - overloading: Três métodos com o mesmo nome, mas com "assinaturas" diferentes (retorno não conta como assinatura)
    public int trocarMarcha() {
        return this.marchaAtual; // Não troca
    }
    public int trocarMarcha(boolean embreagem) {
        return this.marchaAtual; // Não troca
    }
    public int trocarMarcha(boolean embreagem, int novaMarcha) {
        if (embreagem == true) // Troca se a embreagem foi pressionada (true)
            this.marchaAtual = novaMarcha;
        
        return this.marchaAtual;
    }
}

