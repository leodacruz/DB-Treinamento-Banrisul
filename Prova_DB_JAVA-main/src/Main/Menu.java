package Main;

import Utils.Inputs;

public class Menu {

    public static void controleMenu() {
        Estoque.inicializaEstoque();
        do {
            mostraMenu();
        } while (switchCase());
        System.out.println("ENCERRANDO PROGRAMA!!");
    }

    public static void mostraMenu() {
        System.out.println("\n\n------------MENU------------");
        System.out.println("1 - MOSTRAR CATALOGO");
        System.out.println("2 - MOSTRAR CARRINHO DE COMPRAS");
        System.out.println("3 - ADICIONAR ITEM AO CARRINHO");
        System.out.println("4 - RETIRAR ITEM DO CARRINHO");
        System.out.println("5 - FINALIZAR PEDIDO");
        System.out.println("0 - ENCERRAR");
    }

    public static boolean switchCase() {
        System.out.println("ESCOLHA UMA OPCAO: ");
        try {
            switch (Inputs.inputInt()) {
            case 1:
                Estoque.imprimeCatalagoDoEstoque();
                return true;
            case 2:
                Pedido.imprimeCarrinho();
                return true;
            case 3:
                Pedido.adicionaItem();
                return true;
            case 4:
                Pedido.retiraItem();
                return true;
            case 5:
                Pedido.finalizarCompra();
                return true;
            case 99:
                Pedido.historicoNotas();
                return true;
            case 0:
                return false;
            default:
                System.out.println("\nOpcao invalida!!\n");
                return true;
            }
        } catch (Exception e) {
            System.out.println("\nValor informado nao eh um numero!\n");
            return true;
        }

    }

}
