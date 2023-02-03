package primitivoseref;

import java.awt.Point;
import java.util.Arrays;

public class ExemploPrimitivosERef {
    public static void main(String[] args) {
        int in = 10;
        System.out.println(String.format("primitive int: %d", in));
        
        float flo = 20.535f;
        System.out.println(String.format("primitive float: %.2f", flo));
        
        char cha = 'X';
        System.out.println(String.format("primitive char (Antes): %c", cha));
        changePrimitive(cha);
        System.out.println(String.format("primitive char (Depois): %c", cha));
        
        boolean boo = true;
        System.out.println(String.format("primitive boolean: %b", boo));
        
        StringBuilder builder = new StringBuilder("Johhny John");
        System.out.println(String.format("object String (Antes): %s", builder.toString()));
        changeObject(builder);
        System.out.println(String.format("object String (Depois): %s", builder.toString()));
        
        int[] numeros = { 1, 2, 3, 4, 5 };
        System.out.println(String.format("object int[]: %s", Arrays.toString(numeros)));
        
        Point point = new Point(1, 1);
        System.out.println(String.format("object Point (Antes): %s", point));
        changeObject(point);
        System.out.println(String.format("object Point (Depois): %s", point));

        int val1 = 5;
        int val2 = val1; // Cópia de valor
        
        Point point1 = new Point(1, 1);
        Point point2 = point1; // Cópia de referência
    }
    
    public static void changePrimitive(char value) {
        value = 'Y';
    }
    
    public static void changeObject(Point value) {
       value.x = 2;  
       value.y = 2;
    }
    public static void changeObject(StringBuilder value) {
        value.append(" Jones");
    }   
    public static String changeObject(String value) {
        return value.concat(" Jones");
    }
}
