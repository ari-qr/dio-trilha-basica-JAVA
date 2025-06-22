import java.util.Scanner;

public class ExercicioUm{
    public static void main(String[] args){
       var scanner = new Scanner(System.in);

       System.out.println(" Vamos multiplicar!\n Digite um número para calcularmos sua tabuada: ");
       int numeroDoUsuario = scanner.nextInt();
    
   /*  USANDO LÓGICA COM FOR:

        for (int i = 0; i <= 10; i++){
        int resultado = numeroDoUsuario * i;
        System.out.println(numeroDoUsuario + " x " + i + " = " + resultado);
    
    }
    */

    /* USANDO LÓGICA COM WHILE
    
    int i = 0;
    while (i <= 10){
        i++;
        int resultado = numeroDoUsuario * i;
        System.out.printf("%s x %s = %s\n", numeroDoUsuario, i, resultado);
    }
    */

    
    }
}