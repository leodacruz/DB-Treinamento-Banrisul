package enums;

public enum Cores {
    VERMELHO(255, 0, 0), VERDE(0, 255, 0), AZUL(0, 0, 255);
    
    int r;
    int g;
    int b;
    
    private Cores(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    
    @Override
    public String toString() {
        return String.format("%s (%d, %d, %d)", this.name(), this.r, this.g, this.b);
    }
}
