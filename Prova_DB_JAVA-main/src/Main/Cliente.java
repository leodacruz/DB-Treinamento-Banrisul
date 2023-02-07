package Main;

import java.util.ArrayList;

public class Cliente {

    private int cpf;
    private String nome;
    private ArrayList<Item> listaItens = new ArrayList<>();
    private String formaDePagamento=""; //A forma de pagamento eh um String
    private double valorTotal=0;

    public double getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente(int id, String nome) {
        this.cpf = id;
        this.nome = nome;
    }

    public  ArrayList<Item> getItens() {
        return listaItens;
    }

    public  void setItens(ArrayList<Item> itens) {
        this.listaItens = itens;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }
}
