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
    
    // Polimorfismo - overriding: Esse m�todo est� sendo sobrescrito nas classes CarroCombustao e CarroEletrico
    public void buzinar() {
        System.out.println("O carro (como aqui estou na classe base, n�o sei qual � o tipo) buzinou!");
    }
    
    // Polimorfismo - overloading: Tr�s m�todos com o mesmo nome, mas com "assinaturas" diferentes (retorno n�o conta como assinatura)
    public int trocarMarcha() {
        return this.marchaAtual; // N�o troca
    }
    public int trocarMarcha(boolean embreagem) {
        return this.marchaAtual; // N�o troca
    }
    public int trocarMarcha(boolean embreagem, int novaMarcha) {
        if (embreagem == true) // Troca se a embreagem foi pressionada (true)
            this.marchaAtual = novaMarcha;
        
        return this.marchaAtual;
    }
}

