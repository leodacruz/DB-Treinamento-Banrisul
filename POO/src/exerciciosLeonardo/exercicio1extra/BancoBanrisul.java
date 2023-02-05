package exercicio1extra;

import java.util.ArrayList;

public class BancoBanrisul {
    private ArrayList<Conta> contas;
   
    BancoBanrisul() {
        contas = new ArrayList<>();
    }

    public void saque(long valor,Conta conta) {
        //limite de cheque para conta corrente eh de 500 reais
        int indice=contas.indexOf(conta);
        if(indice == -1){
          System.out.println("Conta nao encontrada no sistema");
          return; //para sair do metodo 
        }

        if((contas.get(indice).getSaldo() - valor < 0)){

          if(conta instanceof ContaCorrente){ //to perguntando se conta foi implementada pela classe ContaCorrente
           //aqui te o limite do cheque (esse limite eh o quanto tua conta pode ficar negativa)

           if((contas.get(indice).getSaldo() - valor < -500)){//se passou do limite de 500
            System.out.println("Saque indisponivel!!!\nO valor do saque supera o limite atual de cheque especial");

           }else{
            System.out.println("Cuidado, sua conta esta no limite do cheque especial");
            System.out.println("Trate de quitar este valor o mais rapido possivel !!!");
            System.out.println("Saque disponivel, pegueo o");
           }



          }else{//como sei que so tem duas implementacoes e a outra eh a poupanca
            System.out.println("Saque indisponivel!!!\nO valor do saque supera o limite atual da conta");
           
          }

        }else{
          System.out.println("Saque disponivel, pegueo o");
          
        }  
    }

    public boolean deposito(long valor,Conta conta) {
      int indice=contas.indexOf(conta);
        if(indice == -1){
          System.out.println("Conta nao encontrada no sistema");
          return false; //para sair do metodo 
        }

        
        if (valor > 0) {
            return contas.get(indice).addSaldo(valor);
        } else {
            return false;
        }
    }

    public void addConta(Conta conta){
      contas.add(conta);
      System.out.println("Conta adcionada");
    }

}
