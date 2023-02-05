package exercicio1extra;

class Pessoa {
    private String nome;
    private String cpf;

    Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    String getNome() {
        return nome;
    }

    String getCpf() {
        return cpf;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
