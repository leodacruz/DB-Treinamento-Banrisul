package livraria;

public class ExercicioLivraria {
    /*
     * Criar um sistema de controle de empr�stimos de livros
     * Livros | Pessoas | Emprestimo <- Entidades
     * */
    public static void main(String[] args) {
        Livro livro = new Livro("as1245dd", "IT");
        Livro livro2 = new Livro("as125555dd", "MR Mercedes");
        // System.out.println(livro.getIsbn() + " " + livro.getTitulo());
        
        Pessoa renato = new Pessoa("9999999999", "Renato");
        Pessoa stephen = new Pessoa("2225258552", "Steve");
        // System.out.println(renato.getDoc() + " " + renato.getNome());
        
        Emprestimo empr1 = new Emprestimo(livro2, renato);
        String consulta = empr1.getEmprestimo();
        System.out.println(consulta);
        
        System.out.println();
        
        Emprestimo empr2 = new Emprestimo(livro, stephen);
        String consulta2 = empr2.getEmprestimo();
        System.out.println(consulta2);
    }
}
