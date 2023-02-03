package exercicio19;

public class Contato {
    private Pessoa pessoa;
    private Telefone telefone;

    public Contato(Pessoa pessoa, Telefone telefone) {
        this.pessoa = pessoa;
        this.telefone = telefone;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Contato [pessoa=" + pessoa + ",\n\n telefone=" + telefone + "]";
    }   
}
