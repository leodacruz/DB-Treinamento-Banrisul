package livraria;

public class Livro {
    private String isbn; // Id
    private String titulo;
    
    public Livro(String isbn, String titulo) {
        this.setIsbn(isbn);
        this.setTitulo(titulo);
    }
    
    public String getIsbn() {
        return this.isbn;
        
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
