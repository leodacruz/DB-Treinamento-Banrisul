package exercicio19;

public class Telefone {
    private String numero;
    private String ddd;
    private boolean bloqueado;

    public Telefone(String numero, String ddd) {
        this.numero = numero;
        this.ddd = ddd;
        bloqueado = false;
    }

    public String getNumero() {
        return numero;
    }

    public String getDdd() {
        return ddd;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    @Override
    public String toString() {
        return "Telefone [numero=" + ddd + " "+numero  + ",Este numero esta : "+ (bloqueado ? "Ativado" :"Bloqueado") + "]";
    }
}
