package casting;

public class ExemploCasting {

    public static void main(String[] args) {
        short matrioskaMini = 1000;
        int matrioskaP = 100000;
        long matrioskaM = 1000000l;
        float matrioskaG = 10000000.10000001f;
        double matrioskaGG = 100000000.100000001;
        
        // matrioskaGG = matrioskaG = matrioskaM = matrioskaP = matrioskaMini;
        
        matrioskaG = (float)matrioskaGG;
        matrioskaM = (long)matrioskaG;
        matrioskaP = (int)matrioskaM;
        matrioskaMini = (short)matrioskaP;
        // matrioskaMini = (short)(matrioskaP = (int)(matrioskaM = (long)(matrioskaG = (float)matrioskaGG)));
        
        System.out.println("Matrioska Mini " + matrioskaMini);
        System.out.println("Matrioska P " + matrioskaP);
        System.out.println("Matrioska M " + matrioskaM);
        System.out.printf("Matrioska G %.0f %n", matrioskaG);
        System.out.printf("Matrioska GG %.0f %n", matrioskaGG);
        
        /* ------------------------------------------------------------------------------------------------- */
        System.out.println();
        
        
        char charB = 98;
        int int98 = 'b';
        
        System.out.printf("%s %n", charB);
        System.out.printf("%d %n", int98);
        
        /* ------------------------------------------------------------------------------------------------- */
        System.out.println();
        
        String str10 = "10";
        int int10 = Integer.parseInt(str10);
        System.out.printf("%s %d", str10, int10);
        
        System.out.println();
        
        double doubl105 = 10.5;
        String str105 = String.valueOf(doubl105);
        System.out.printf("%s %.1f", str105, doubl105);
        
        System.out.println();
        
        String stringXYZ = "XYZ";
        char charY = stringXYZ.charAt(1);
        System.out.println(charY);
        
        char charX = 'X';
        String stringX = Character.toString(charX);
        System.out.println(stringX);
        
        boolean tru = true;
        String sTru = Boolean.toString(true);
        System.out.println(sTru);
        
        int intV = 150;
        boolean boolV = intV == 150;
        System.out.println(boolV);
        
        Pai pai = new Pai();
        Filho filho = new Filho();
        pai = (Pai)filho;
        Pai pai2 = new Filho();
        
        imprimir(pai, filho);
    }
    
    static void imprimir(Pai pai, Pai pai2) { 
        Filho f = (Filho)pai2;
    }
}
