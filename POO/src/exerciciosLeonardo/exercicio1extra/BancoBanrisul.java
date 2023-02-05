package exercicio1extra;

public class BancoBanrisul {
    private Conta conta; //preciso de alguem que vai implementa a interface conta

    BancoBanrisul(Conta conta) {
        this.conta = conta;
    }

    public void saque(long valor) {
        //limite de cheque para conta corrente eh de 500 reais

        if((conta.getSaldo() - valor < 0)){

          if(conta instanceof ContaCorrente){ //to perguntando se conta foi implementada pela classe ContaCorrente
           //aqui te o limite do cheque (esse limite eh o quanto tua conta pode ficar negativa)

           if((conta.getSaldo() - valor < -500)){//se passou do limite de 500
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

    public boolean deposito(long valor) {
        if (valor > 0) {
            return conta.addSaldo(valor);
        } else {
            return false;
        }
    }

}
