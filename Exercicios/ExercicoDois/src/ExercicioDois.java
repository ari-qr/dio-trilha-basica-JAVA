import java.util.Scanner;

public class ExercicioDois{
    public static void main(String[] args){
        System.out.println("Você sabe como calcular a área de um quadrado?\n É simples! Você só precisa calcular lado x lado.\n Vamos testar!\n");
        System.out.print("Digite a medida do lado: ");
        var scanner = new Scanner(System.in);
        var medida = scanner.nextInt();

        var resultado = medida * medida;
        System.out.printf("\nA área do quadrado é %s.", resultado);

    }
}