import java.util.Scanner;

public class ExercicioQuatro{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Vamos dividir até que o resto seja diferente de 0!\nInforme um número para começarmos: ");
        var number = scanner.nextInt();

        while (true){
            System.out.println("Informe um  segundo número para verificarmos: ");
            var toVerify = scanner.nextInt();

            if(toVerify < number){
                System.out.printf("Informe um número maior que %s\n", number);
                continue;
            }
            
            var result = toVerify % number;
            System.out.printf("\n%s %% %s = %s \n", toVerify, number, result);
            if (result != 0){
                System.out.printf("O resto é %s, fim da divisão.", result);
                break;
            }
        }
    }
}