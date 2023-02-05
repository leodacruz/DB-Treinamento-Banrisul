package exercicio1extra;

import java.util.ArrayList;

class BancoBanrisul {
  private ArrayList<Conta> contas;

  BancoBanrisul() {
    contas = new ArrayList<>();
  }

  void saque(long valor, Conta conta) {
    // limite de cheque para conta corrente eh de 500 reais

    // ver se a conta esta adicionada ao banco(se ela existe dentro do array)
    if (contas.contains(conta)) {
      System.out.println("Conta nao encontrada no sistema");
      return;
    }
    int indice = contas.indexOf(conta);                                         // indice da conta no array
    long verificaSaque = contas.get(indice).getSaldo() - valor;                 // valor do saldo ja descontando o valor do saque

    if ((verificaSaque < 0)) {

      if (conta instanceof ContaCorrente) {                                     // to perguntando se conta foi implementada pela classe ContaCorrente

        if ((verificaSaque < -500)) {                                           // se passou do limite de 500
          System.out.println("Saque indisponivel!!!\nO valor do saque supera o limite atual de cheque especial");
        } else {
          contas.get(indice).saque(valor);
          System.out.println("Saque disponivel, pegueo o!!!");
          System.out.println("ALERTA, sua conta esta no limite do cheque especial");
        }

      } else {                                                                  // como sei que so tem duas implementacoes e a outra eh a poupanca
        System.out.println("Saque indisponivel!!!\nO valor do saque supera o limite atual da conta");
      }

    } else {                                                                    // aqui o saque eh liberado em ambas contas
      contas.get(indice).saque(valor);
      System.out.println("Saque disponivel, pegueo o");
    }
  }

  boolean deposito(long valor, Conta conta) {

    if (contas.contains(conta)) {
      System.out.println("Conta nao encontrada no sistema");
      return false; // para sair do metodo
    }
    int indice = contas.indexOf(conta);

    if (valor > 0) {
      return contas.get(indice).deposito(valor);
    } else {
      return false;
    }
  }

  void addConta(Conta conta) {
    contas.add(conta);
    System.out.println("Conta adcionada");
  }

}
