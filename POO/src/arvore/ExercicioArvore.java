package arvore;

public class ExercicioArvore {
    /*
     * Criar um sistema represente a �rvore geneal�gica de uma fam�lia
     * Pessoas <- Entidades
     * */
    public static void main(String[] args) {
        Pessoa avoMPedro = new Pessoa("Ana", 80);
        Pessoa voMPedro = new Pessoa("Osmar", 84);
        
        Pessoa avoPPedro = new Pessoa("Rosa", 87);
        Pessoa voPPedro = new Pessoa("Nelson", 89);
        
        Pessoa maePedro = new Pessoa("Geovana", 62, avoMPedro, voMPedro);
        Pessoa paiPedro = new Pessoa("Ant�nio", 65, avoPPedro, voPPedro);
        
        Pessoa pedro = new Pessoa("Pedro", 49, maePedro, paiPedro);
        Pessoa luiza = new Pessoa("Luiza", 33, maePedro, paiPedro);
        
        System.out.println(luiza.getArvore()); // Imprime a arvore inteira
        System.out.println();

        System.out.println(pedro.getMae().getMae().getNome() + "(" + pedro.getMae().getMae().getIdade() + " anos)"); // Navega atrav�s da arvore para localizar um ente
        
        // Navega atrav�s da arvore para localizar um ente de uma forma um pouco mais inteligente
        Pessoa ana = pedro.getMae().getMae();
        System.out.println(ana.getNome() + "(" + ana.getIdade() + " anos)");
    }
}
