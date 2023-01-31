package polimorfismo;

public class Concessionaria {
    public boolean revisar(Carro carro) {
        // Imprimindo a marca atrav�s do pr�prio objeto pai
        System.out.println("Revisando o " + carro.marca + "...");
        
        // Buzinando atrav�s do pr�prio objeto pai
        // Por�m, note que como esse m�todo est� sobrescrito por override nas classes filhas, 
        // ele vai buzinar de acordo com a origem da instancia��o, mesmo sem explicitamente 
        // estar em sua forma original ainda
        carro.buzinar();
        
        // Testando a origem da instancia��o do carro gen�rico que chegou pra poder lig�-lo de acordo
        if (carro instanceof CarroCombustao) { 
            
            CarroCombustao carroComb = (CarroCombustao)carro; // Fazendo casting para colocar o objeto carro de volta na sua forma original
            
            carroComb.setLigado(true);
            
            System.out.println("Carro Combust�o " + (carroComb.getLigado() ? "ligado" : "falhou"));
        
        } else if (carro instanceof CarroEletrico) {
            
            CarroEletrico carroElet = (CarroEletrico)carro; // Fazendo casting para colocar o objeto carro de volta na sua forma original
            
            carroElet.setLigado(true);
            
            System.out.println("Carro El�trico " + (carroElet.getLigado() ? "ligado" : "falhou"));
        }
        
        return true;
    }
}
