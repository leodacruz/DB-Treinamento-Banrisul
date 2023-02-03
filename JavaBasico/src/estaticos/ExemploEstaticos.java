package estaticos;

public class ExemploEstaticos {
    public static void main(String[] args) {
        Carro car = Carro.criar("Hyundai", 4);
        car.setMarca("Tesla");
        System.out.println(Carro.DEFINICAO + " " + car.getMarca());
        car.ligar();
    }
}
