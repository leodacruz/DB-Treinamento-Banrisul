package estruturacondicaorepeticaoextra;

public class ExemploTernario {

    public static void main(String[] args) {
        final double MEDIA = 7; // Regra de negócio
        double nota = 8.8;
        
        boolean passou;
        if (nota >= MEDIA)
            passou = true;
        else
            passou = false;
        
        if (passou)
            System.out.println("Aluno passou com " + nota);
        else
            System.out.println("Aluno reprovou com " + nota);
        
        // -----------------------------------------------------------
        
        boolean passou2 = nota >= MEDIA ? true : false;
        
        System.out.println("Aluno " + (passou2 ? "passou" : "reprovou") + " com " + nota);
    }
}
