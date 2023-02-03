package primitivoseref.wrappers;

import java.util.ArrayList;

public class ExemploWrappers {

    public static void main(String[] args) {
        int in = 10;
        System.out.println(String.format("primitive int: %d", in));
        
        float flo = 20.535f;
        System.out.println(String.format("primitive float: %.2f", flo));
        
        char cha = 'X';
        System.out.println(String.format("primitive char: %c", cha));
        
        boolean boo = true;
        System.out.println(String.format("primitive boolean: %b", boo));
        
        // Wrappers - Boxing implícito
        
        /*int*/ Integer inWrapper = 10;
        System.out.println(String.format("primitive int: %d", inWrapper));
        
        /*float*/ Float floWrapper = 20.535f;
        System.out.println(String.format("primitive float: %.2f", floWrapper));
        
        /*char*/ Character chaWrapper = 'X';
        System.out.println(String.format("primitive char: %c", chaWrapper));
        
        /*boolean*/ Boolean booWrapper = true;
        System.out.println(String.format("primitive boolean: %b", booWrapper));
        
        // Wrappers - Boxing implícito II
        
        int in2 = 10;
        Integer inWrapper2 = in2;
        System.out.println(String.format("primitive int: %d", inWrapper2));
        
        // Wrapper - Boxing explícito
        
        int in3 = 10;
        Integer inWrapper3 = Integer.valueOf(in3);
        System.out.println(String.format("primitive int: %d", inWrapper3));
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(in3);
        int first = list.get(0);
        System.out.println(list.toString() + " and 1st is " + first);
        
        // Wrapper - Unboxing implícito
        
        Integer inWrapper4 = Integer.valueOf(15);
        int in4 = inWrapper4;
        System.out.println(String.format("primitive int: %d", in4));
        
        // Wrapper - Unboxing explícito
        
        Integer inWrapper5 = Integer.valueOf(15);
        int in5 = inWrapper5.intValue();
        System.out.println(String.format("primitive int: %d", in5));
    }

}
