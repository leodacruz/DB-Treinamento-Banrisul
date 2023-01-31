package polimorfismo;

public class Concessionaria {
    public boolean revisar(Carro carro) {
        // Imprimindo a marca através do próprio objeto pai
        System.out.println("Revisando o " + carro.marca + "...");
        
        // Buzinando através do próprio objeto pai
        // Porém, note que como esse método está sobrescrito por override nas classes filhas, 
        // ele vai buzinar de acordo com a origem da instanciação, mesmo sem explicitamente 
        // estar em sua forma original ainda
        carro.buzinar();
        
        // Testando a origem da instanciação do carro genérico que chegou pra poder ligá-lo de acordo
        if (carro instanceof CarroCombustao) { 
            
            CarroCombustao carroComb = (CarroCombustao)carro; // Fazendo casting para colocar o objeto carro de volta na sua forma original
            
            carroComb.setLigado(true);
            
            System.out.println("Carro Combustão " + (carroComb.getLigado() ? "ligado" : "falhou"));
        
        } else if (carro instanceof CarroEletrico) {
            
            CarroEletrico carroElet = (CarroEletrico)carro; // Fazendo casting para colocar o objeto carro de volta na sua forma original
            
            carroElet.setLigado(true);
            
            System.out.println("Carro Elétrico " + (carroElet.getLigado() ? "ligado" : "falhou"));
        }
        
        return true;
    }
}
