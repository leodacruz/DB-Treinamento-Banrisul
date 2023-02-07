package Main;

import Utils.Inputs;

import java.util.ArrayList;

public class Pedido {

    private static ArrayList<Cliente> listaDeClientes = new ArrayList<>();

    private static ArrayList<Item> listaDeItens = new ArrayList<>();
    private static double valorTotalDoPedido = 0;

    public static void calculaValorTotal() {
        double subTotal = 0;
        for (Item item : listaDeItens) {
            subTotal += item.getValorDoItem();
        }
        valorTotalDoPedido = subTotal;
    }

    public static boolean adicionaItemNaLista(Produto produto, int quantidade) {
        // primeiro ve se o produto ja existe na lista de itens
        for (Item item : listaDeItens) {
            if (item.getProduto().getNome().equals(produto.getNome())) {

                if (Estoque.temEstoqueOuNao(produto, quantidade)) { // isso me garante que nunca ira tirar mais do que
                                                                    // tem no estoque
                    Estoque.darBaixaEmEstoque(item.getProduto().getId(), quantidade); 
                    item.setQuantidade(item.getQuantidade() + quantidade);
                    item.defineValorTotal();
                    System.out.println("Foi adicionada a quantidade ao item ja existente.");
                    return true;
                } else {
                    System.out.println("Quantidade execede o limite atual de estoque");
                    return false;
                }
            }
        }
        // isso ele sempre faz quando o produto ainda nao foi adicionado na lista de itens
        if (Estoque.temEstoqueOuNao(produto, quantidade)) {
            listaDeItens.add(new Item(produto, quantidade));
            Estoque.darBaixaEmEstoque(produto.getId(), quantidade);
            System.out.println("Foi adicionado o produto na lista de compras.");
            return true;

        } else {
            System.out.println("Quantidade do produto excede o limite em estoque");
            return false;
        }
    }

    public static void imprimePedido() {
        System.out.println("\n_____________________________________________________________________________________");
        System.out.println("                              NOTA FISCAL");
        System.out.printf("ID       |NOME            |PRECO UN           |QUANTIDADE   |PRECO ITEM \n");
        for (Item item : listaDeItens) {
            System.out.printf("%-8d | %-14s | R$%-15.2f | %-10d  | R$%.2f\n", item.getProduto().getId(),
                    item.getProduto().getNome(),
                    item.getProduto().getPreco(), item.getQuantidade(), item.getValorDoItem());
        }
        imprimeValorTotal();
    }

    public static void imprimePedido(ArrayList<Item> lista) {
        System.out.println("\n_____________________________________________________________________________________");
        System.out.println("                              NOTA FISCAL");
        System.out.printf("ID       |NOME            |PRECO UN           |QUANTIDADE   |PRECO ITEM \n");
        for (Item item : lista) {
            System.out.printf("%-8d | %-14s | R$%-15.2f | %-10d  | R$%.2f\n", item.getProduto().getId(),
                    item.getProduto().getNome(),
                    item.getProduto().getPreco(), item.getQuantidade(), item.getValorDoItem());
        }
    }

    public static void imprimeCarrinho() {
        // ve se a lista esta vazia
        if (listaDeItens.size() == 0) {
            System.out.println("\nSUA LISTA DE COMPRAS ESTA VAZIA\n");
            return;
        }
        System.out.println("_____________________________________________________________________________________");
        System.out.println("                              SEU CARRINHO DE COMPRAS");
        System.out.printf("ID       |NOME            |PRECO UN           |QUANTIDADE   |PRECO ITEM \n");
        for (Item item : listaDeItens) {
            System.out.printf("%-8d | %-14s | R$%-15.2f | %-10d  | R$%.2f\n", item.getProduto().getId(),
                    item.getProduto().getNome(),
                    item.getProduto().getPreco(), item.getQuantidade(), item.getValorDoItem());
        }
        imprimeValorTotal();

    }

    private static void imprimeValorTotal() {
        System.out.println();
        System.out.printf("Total: R$%.2f", valorTotalDoPedido);
        System.out
                .println("\n_____________________________________________________________________________________\n\n");
    }

    private static void imprimeValorTotal(double valor) {
        System.out.println();
        System.out.printf("Total: R$%.2f", valor);
        System.out
                .println("\n_____________________________________________________________________________________\n\n");
    }

    public static void adicionaItem() { // arrumei todo esse metodo,tava estranho

        // aqui precisa de um controle de excecoes
        String nome;
        try {
            nome = recebeNomeDoTeclado();
        } catch (Exception e) {
            System.out.println("ERRO AO INFORMAR O NOME DO ITEM");
            return;
        }

        Produto produto = Estoque.encontraProduto(nome);

        // dois filtros pre baixa do estoque

        // para ver se o produto existe no estoque
        if (produto == null) {
            System.out.println("Produto nao encontrado");
            return;
        }

        // ver se o produto tem alguma quantidade no estoque
        if (Estoque.getQuantidadeAtualEmEstoque(produto) <= 0) {
            System.out.println("Produto sem estoque no momento");
            return;
        }

        // aqui precisa de um controle de excecoes
        int quantidade;
        try {
            quantidade = recebeQuantidadeDoTeclado();
        } catch (Exception e) {
            System.out.println("ERRO AO INFORMAR UM NUMERO");
            return;
        }

        // caso o item foi adicionado na lista tu faz o calculo do valor total
        if (adicionaItemNaLista(produto, quantidade)) {
            calculaValorTotal();
        }
    }

    public static String recebeNomeDoTeclado() {
        System.out.print("Digite o nome: ");
        return Inputs.inputString();
    }

    public static int recebeQuantidadeDoTeclado() {
        System.out.print("Digite a quantidade: ");
        return Inputs.inputInt();
    }

    public void limparCarrinho() {
        listaDeItens.clear();
    }

    public static ArrayList<Item> getListaDeItens() {
        return listaDeItens;
    }

    public void setListaDeItens(ArrayList<Item> listaDeItens) {
        Pedido.listaDeItens = listaDeItens;
    }

    public double getValorTotalDoPedido() {
        return valorTotalDoPedido;
    }

    public void setValorTotalDoPedido(double valorTotalDoPedido) {
        Pedido.valorTotalDoPedido = valorTotalDoPedido;
    }

    public static void retiraItem() {

        // Mostra o carrinho de compras para o usuario
        imprimeCarrinho();

        // pede para o usuario informar qual item quer retirar
        System.out.println("Informe o Item que deseja retirar do carrinho");

        // tratamento da excecao
        String nome;
        try {
            nome = recebeNomeDoTeclado();
        } catch (Exception e) {
            System.out.println("ERRO AO INFORMAR O NOME DO ITEM"); // nem sei como ativar essa excecao
            return;
        }

        // ver se o produto existe na lista de compras
        Item item = temNaLista(nome);
        if (item == null) {
            System.out.println("Produto naoo existe na sua  lista de compras");
            return;
        }

        // removo o item da lista de compras, mas antes reponho ele no estoque
        Estoque.reporEstoqueProduto(item); // repor o estoque deste produto
        System.out.println("\nProduto removido com sucesso!!\n");
        listaDeItens.remove(item); // removo ele da lista de compras

    }

    public static Item temNaLista(String nome) {
        for (Item item : listaDeItens) {
            if (item.getProduto().getNome().equalsIgnoreCase(nome)) {
                return item;
            }
        }
        return null;
    }

    public static void finalizarCompra() {
   
        // primeiro ve se tem algo no carrinho
        if (listaDeItens.size() == 0) {
            System.out.println("NAO TEM NADA NO SEU CARRINHO");
            return;
        }

        // cadastro cliente
        // ------------------------------------------------------------------------------------------------------------
        System.out.println("FINALIZAR COMPRA");
        imprimeCarrinho();
        System.out.println("VOCE DESEJA CPF NA NOTA?\n DIGITE 1 PARA SIM, 2 PARA NAO OU 0 PARA VOLTAR");

        Cliente clienteAux; // varivael aux para salvar o prox cliente

        try {
            switch (Inputs.inputInt()) {
            case 1:
                clienteAux = criaCliente();
                break;
            case 2:
                clienteAux = new Cliente((listaDeClientes.size() + 1), null);
                break;
            case 0:
                return;
            default:
                System.out.println("VOCE NAO ESCOLHEU UMA OPCAO VALIDA, VOLTANDO");
                return;
            }
        } catch (Exception e) {
            System.out.println("VOCE NAO ESCOLHEU UM NUMERO, VOLTANDO");
            return;
        }

        // continuar compra
        // -------------------------------------------------------------------------------------------------------------------

        System.out.println("ESCOLHA SEU METODO DE PAGAMENTO");
        System.out.println("DIGITE 1 PARA COMPRAR COM CARTAO DE CREDITO   ");
        System.out.println("DIGITE 2 PARA COMPRAR COM DINHEIRO   ");
        System.out.println("DIGITE 0 PARA VOLTAR   ");

        String metodoDePagamentoAux; // variavel auxiliar para salvar metodo de pagamento
        try {
            switch (Inputs.inputInt()) {
            case 1:
                metodoDePagamentoAux = pagamentoComCartaoCredito();
                break;
            case 2:
                metodoDePagamentoAux = pagamentoComDinheiro();
                break;
            case 0:
                return;
            default:
                System.out.println("VOCE NAO ESCOLHEU UMA OPCAO VALIDA, VOLTANDO");
                return;
            }
        } catch (Exception e) {
            System.out.println("VOCE NAO ESCOLHEU UM NUMERO, VOLTANDO");
            return;
        }

        if (metodoDePagamentoAux == null) { // erro ao informar o valor em dinheiro
            return;
        }

        // Compra finalizada !!-----------------------------------------------------------------------------------------------------------------------
        // salvando essa compra
        System.out.println("SUA NOTA FISCAL");
        imprimePedido();
        System.out.println("SEU METODO DE PAGAMENTO\n" + metodoDePagamentoAux);
        listaDeClientes.add(clienteAux);
        listaDeClientes.get(listaDeClientes.size() - 1).setFormaDePagamento(metodoDePagamentoAux);
        ArrayList<Item> listaAux = new ArrayList<>();
        listaAux.addAll(listaDeItens);
        listaDeClientes.get(listaDeClientes.size() - 1).setItens(listaAux);
        listaDeClientes.get(listaDeClientes.size() - 1).setValorTotal(valorTotalDoPedido);

        // limpando para novas compras
        listaDeItens.clear(); // limpa a lista de itens
        valorTotalDoPedido = 0; // limpo o valor total

    }

    public static Cliente criaCliente() {
        String nome;
        int cpf;

        // Para informar o nome
        System.out.println("INFORME SEU NOME");
        try {
            nome = Inputs.inputString();
        } catch (Exception e) {
            System.out.println("ERRO AO INFORMAR SEU NOME");
            System.out.println("SEU NOME FOI DEFINIDO PARA FULANO(A)");
            nome = "FULANO(A)";
        }

        // para identificar o cpf
        System.out.println("INFORME SEU CPF");
        try {
            cpf = Inputs.inputInt();
        } catch (Exception e) {
            System.out.println("ERRO AO INFORMAR SEU CPF");
            System.out.print("SEU CPF FOI DEFINIDO PARA ");
            cpf = listaDeClientes.size() + 1;
            System.out.println(cpf);
        }

        return new Cliente(cpf, nome);
    }

    public static String pagamentoComCartaoCredito() { // ta bem feio esse metodo!
        //esse metodo poderia ser mais otmizado, so que o tempo para entrega tava acabando e 
        //tb isso eh uma funcionalidade a mais, entao né. Mas da pra ser melhorado. 
        
        // tabela de juros
        // ate 200 3x sem juros;
        // ate 400 6x sem juros;
        // ate 600 8 sem juros;
        // acima de 600 10x sem juros;
        
        //mostrar ao usuario suas opcoes
        String pagamentoCredito = "Seu pagamento foi no Credito em:";
        System.out.println("O total da sua compra foi: ");
        imprimeValorTotal();
        System.out.println("Informe em quantas vezes deseja pagar: ");
        System.out.println("1x sem juros de " + valorTotalDoPedido + " R$");
        System.out.println("2x sem juros de " + (double) valorTotalDoPedido / 2 + " R$");
        System.out.println("3x sem juros de " + (double) valorTotalDoPedido / 3 + " R$");
        if (valorTotalDoPedido > 200) {
            System.out.println("4x sem juros de " + (double) valorTotalDoPedido / 4 + " R$");
            System.out.println("5x sem juros de " + (double) valorTotalDoPedido / 5 + " R$");
            System.out.println("6x sem juros de " + (double) valorTotalDoPedido / 6 + " R$");
        }
        if (valorTotalDoPedido > 400) {
            System.out.println("7x sem juros de " + (double) valorTotalDoPedido / 7 + " R$");
            System.out.println("8x sem juros de " + (double) valorTotalDoPedido / 8 + " R$");
            System.out.println("9x sem juros de " + (double) valorTotalDoPedido / 9 + " R$");
            System.out.println("10x sem juros de " + (double) valorTotalDoPedido / 10 + " R$");
        }

        int prestacao;
        while (true) {
            try {
                prestacao = Inputs.inputInt();
                break; // sair do while
            } catch (Exception e) {
                System.out.println("ERRO AO INFORMAR O VALOR, TENTE NOVAMENTE\n");
            }
        }
        
        //isso poderia ser melhorado,muito grande e com repeticoes desnecessarias
        switch (prestacao) {
        case 1:
            pagamentoCredito += "1x sem juros de " + valorTotalDoPedido + "R$";
            break;
        case 2:
            pagamentoCredito += "2x sem juros de " + (double) valorTotalDoPedido / 2 + "R$";
            break;
        case 3:
            pagamentoCredito += "3x sem juros de " + (double) valorTotalDoPedido / 3 + "R$";
            break;
        case 4:
            if (valorTotalDoPedido > 200) {
                pagamentoCredito += "4x sem juros de " + (double) valorTotalDoPedido / 4 + "R$";
            } else {
                System.out.println("OPCAO INVALIDA COMPRA CANCELADA\nVOLTANDO");
                return null;
            }
            break;
        case 5:
            if (valorTotalDoPedido > 200) {
                pagamentoCredito += "5x sem juros de " + (double) valorTotalDoPedido / 5 + "R$";
            } else {
                System.out.println("OPCAO INVALIDA COMPRA CANCELADA\nVOLTANDO");
                return null;
            }
            break;
        case 6:
            if (valorTotalDoPedido > 400) {
                pagamentoCredito += "6x sem juros de " + (double) valorTotalDoPedido / 6 + "R$";
            } else {
                System.out.println("OPCAO INVALIDA COMPRA CANCELADA\nVOLTANDO");
                return null;
            }
            break;
        case 7:
            if (valorTotalDoPedido > 400) {
                pagamentoCredito += "7x sem juros de " + (double) valorTotalDoPedido / 7 + "R$";
            } else {
                System.out.println("OPCAO INVALIDA COMPRA CANCELADA\nVOLTANDO");
                return null;
            }
            break;
        case 8:
            if (valorTotalDoPedido > 600) {
                pagamentoCredito += "4x sem juros de " + (double) valorTotalDoPedido / 8 + "R$";
            } else {
                System.out.println("OPCAO INVALIDA COMPRA CANCELADA\nVOLTANDO");
                return null;
            }
            break;
        case 9:
            if (valorTotalDoPedido > 600) {
                pagamentoCredito += "4x sem juros de " + (double) valorTotalDoPedido / 9 + "R$";
            } else {
                System.out.println("OPCAO INVALIDA COMPRA CANCELADA\nVOLTANDO");
                return null;
            }
            break;
        case 10:
            if (valorTotalDoPedido > 600) {
                pagamentoCredito += "4x sem juros de " + (double) valorTotalDoPedido / 10 + "R$";
            } else {
                System.out.println("OPCAO INVALIDA COMPRA CANCELADA\nVOLTANDO");
                return null;
            }
            break;

        default:
            System.out.println("OPCAO INVALIDA COMPRA CANCELADA\nVOLTANDO");
            return null;
        }

        return pagamentoCredito;
    }

    public static String pagamentoComDinheiro() {

        System.out.println("O total da sua compra foi: ");
        imprimeValorTotal();
        System.out.println("Informe o valor a pagar");
        double valor;
        while (true) {
            try {
                valor = Inputs.inputDouble();
                break; // sair do while
            } catch (Exception e) {
                System.out.println("ERRO AO INFORMAR O VALOR, TENTE NOVAMENTE\n");
            }
        }

        if (valor < valorTotalDoPedido) {
            System.out.println("VALOR INFORMADO MENOR QUE O TOTAL DA COMPRA\nVOLTANDO");
            return null;
        }

        double troco = valor - valorTotalDoPedido;
        String troco1 = "Pagou com " + valor + "R$ e seu troco foi de " + troco + "R$\n";// valor normal
        String troco2 = menorQuantidadeNotas(troco);// aqui com a menor quantidade de notas possiveis

        return troco1 + troco2;
    }

    public static String menorQuantidadeNotas(double troco) {
        // primeiro tratar a parte interira
        int trocoInt = (int) troco; // pego a parte inteira,o java ignora aqui os centavos

        // a String que sera usada para retorno
        String trocoFinal = "Voce recebeu seu troco como: \n";

        // agora faco os calculos de todos as notas
        int troco100 = trocoInt / 100;
        int troco50 = trocoInt % 100 / 50;
        int troco20 = trocoInt % 100 % 50 / 20;
        int troco10 = trocoInt % 100 % 50 % 20 / 10;
        int troco5 = trocoInt % 100 % 50 % 20 % 10 / 5;
        int troco1 = trocoInt % 100 % 50 % 20 % 10 % 5 / 1;

        // agora um monte de if para ir concatenando

        if (troco100 != 0) {
            trocoFinal += troco100 + " Nota(s) de 100R$\n";
        }
        if (troco50 != 0) {
            trocoFinal += troco50 + " Nota(s) de 50R$\n";
        }
        if (troco20 != 0) {
            trocoFinal += troco20 + " Nota(s) de 20R$\n";
        }
        if (troco10 != 0) {
            trocoFinal += troco10 + " Nota(s) de 10R$\n";
        }
        if (troco5 != 0) {
            trocoFinal += troco5 + " Nota(s) de 5R$\n";
        }
        if (troco1 != 0) {
            trocoFinal += troco1 + " Moeda(s) de 1R$\n";
        }

        // tratar parte dos centavos, eh praticamente igual
        // mas antes precisamos pegar os centavos do troco assim
        double trocoCentavos = troco - trocoInt; // aqui tera os centavos com o 0 na frente "0,centavos"
        double centavos = trocoCentavos * 100; // 100 vezes tranforma o numero com o 0 na frente num normal "centavos"
        int centavosFinal = (int) centavos; // faço o casting para int
        // e faco o mesmo processo das notas
        
        // calculos dos centavos
        int troco50c = centavosFinal / 50;
        int troco25c = centavosFinal % 50 / 25;
        int troco10c = centavosFinal % 50 % 25 / 10;
        int troco5c = centavosFinal % 50 % 25 % 10 / 5;
        int troco1c = centavosFinal % 50 % 25 % 10 % 5 / 1;

        // monte de if concatenando

        if (troco50c != 0) {
            trocoFinal += troco50c + " Moeda(s) de 50 centavos\n";
        }
        if (troco25c != 0) {
            trocoFinal += troco25c + " Moeda(s) de 25 centavos\n";
        }
        if (troco10c != 0) {
            trocoFinal += troco10c + " Moeda(s) de 10 centavos\n";
        }
        if (troco5c != 0) {
            trocoFinal += troco5c + " Moeda(s) de 5 centavos\n";
        }
        if (troco1c != 0) {
            trocoFinal += troco1c + " Moeda(s) de 1 centavos\n";
        }

        return trocoFinal;
    }

    public static void historicoNotas() {
        if(listaDeClientes.size()==0) {
          System.out.println("Voce nao concluiu nenhuma venda");
          return;
        }
        System.out.println("Sua notas fiscais: \n");
        for (Cliente cliente : listaDeClientes) {
            System.out.println("\n----------------------------------------------");
            System.out.println("nome: " + cliente.getNome());
            System.out.println("cpf: " + cliente.getCpf());
            imprimePedido(cliente.getItens());
            imprimeValorTotal(cliente.getValorTotal());
            System.out.println("Sua Forma de Pagamento foi: ");
            System.out.println(cliente.getFormaDePagamento());
            System.out.println("----------------------------------------------\n\n");

        }
    }
}
