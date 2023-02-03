package exercicio19;

import java.util.ArrayList;

public class AgendaTelefonica {
    private String nome;
    private ArrayList<Contato> listaTelefonica;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AgendaTelefonica(String nome) {
        this.nome = nome;
        listaTelefonica = new ArrayList<Contato>();
    }

    public boolean addContato(Contato contato) {
        try {
            listaTelefonica.add(contato);
        } catch (Exception e) {
            System.out.println("Erro!!!\n" + e);
            return false;
        }
        return true;
    }

    public boolean removeContato(Contato contato) {

        if (listaTelefonica.remove(contato)) {
            return true;
        } else
            return true;
    }

    public boolean removeContato(Telefone telefone) {
        for (int i = 0; i < listaTelefonica.size(); i++) {
            if (listaTelefonica.get(i).getTelefone() == telefone) {
                listaTelefonica.remove(i);
                return true;
            }
        }
        System.out.println("\nTelefone nao encontrado\n");
        return false;
    }

    public boolean removeTudo(Pessoa pessoa) {
        int contador = 0;
        boolean encontrou = false;

        while (true) {
            encontrou = false;
            for (int i = 0; i < listaTelefonica.size(); i++) {
                if (listaTelefonica.get(i).getPessoa() == pessoa) {
                    listaTelefonica.remove(i);
                    contador++;
                    encontrou = true;
                    break;
                }
            }

            if (encontrou == false) {
                break;
            }
        }
        if (contador > 0) {
            System.out.println("\nContatos de \n" + pessoa.getNome() + " Apagados!!");
            return true;
        } else {
            System.out.println("\nPessoa nao encontrada nao encontrado\n");
            return false;
        }

    }

    public ArrayList<Contato> getListaTelefonica() {
        return listaTelefonica;
    }

    public ArrayList<Contato> findPessoa(Pessoa pessoa) {
        ArrayList<Contato> contatosDaPessoa = new ArrayList<>();

        boolean encontrou = false;

        while (true) {
            encontrou = false;
            for (int i = 0; i < listaTelefonica.size(); i++) {
                if (listaTelefonica.get(i).getPessoa() == pessoa) {
                    contatosDaPessoa.add(listaTelefonica.get(i));
                    encontrou = true;
                    break;
                }
            }

            if (encontrou == false) {
                break;
            }
        }
        return contatosDaPessoa;
    }

    @Override
    public String toString() {
        return "AgendaTelefonica [nome=" + nome + ", listaTelefonica=" + listaTelefonica + "]";
    }
}
