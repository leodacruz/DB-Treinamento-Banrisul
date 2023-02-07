package Main;

import java.util.ArrayList;

public class NotasFiscais {
    
    private static ArrayList<Pedido> notas = new ArrayList<>();

    public static ArrayList<Pedido> getItens(){
        return notas;
    }

    public static int TotalDeNotas(){
        return notas.size();
    }

    public static ArrayList<Pedido> getNotas(){
        return notas;
    }

    public static void addNotaFiscal(Pedido pedido){
        notas.add(pedido);
    }


    

}
