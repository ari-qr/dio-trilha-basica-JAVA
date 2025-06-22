import java.util.Scanner;

public class ExercicioTres{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        int numeroInicial;
        int segundoNumero;
        int parOuImpar;

        System.out.print("Vamos descobrir os pares ou ímpares entre dois números?\nDigite um número para começar: ");
        numeroInicial = scanner.nextInt();
        System.out.print("Agora digite um número maior do que o anterior: ");
        segundoNumero = scanner.nextInt();
        System.out.print("Escolha 1 para ímpar ou 2 para par: ");
        parOuImpar = scanner.nextInt();
        scanner.close();
        

    if(parOuImpar == 2){
        if(segundoNumero % 2 != 0){
            segundoNumero = segundoNumero - 1;
        }

        for(int i = segundoNumero; i >= numeroInicial; i -= 2){
            System.out.println(i);
        }

    } else if(parOuImpar == 1){
        if(segundoNumero % 2 == 0){
            segundoNumero = segundoNumero - 1;
        }

        for(int i = segundoNumero; i >= numeroInicial; i -= 2){
            System.out.println(i);
        }
    }

    System.out.println("Fim da execução.");
    
    }
}
