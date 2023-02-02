package exercicio18;

class Guincho extends Automovel {
    private boolean guinchando;

    Guincho(String modelo, String placa) {
        this.placa = placa;
        this.modelo = modelo;
        guinchando =  false;
    }

    boolean guinchar(Automovel automovel){
       try {
        System.out.println(automovel.toString());    
        } catch (Exception e) {
            guinchando=false;
         return false;   
        }
        guinchando=true;
        return true;
    }

    @Override
    public String toString() {
        return "Guincho \n"+"Veiculo a ser guinchado: "+(guinchando?"Esta":"Não está")+ " guinchando";
    }
    


}
