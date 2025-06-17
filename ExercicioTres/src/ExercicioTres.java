import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args){

        System.out.println("Você sabe como calcular a área de um retângulo?\n É simples! Você só precisa calcular a base x altura.\n Vamos testar!\n");

        System.out.print("Digite a base do retângulo: ");
        var scanner = new Scanner(System.in);
        var base = scanner.nextDouble();

        System.out.print("Agora digite a altura: ");
        var altura = scanner.nextDouble();

        var resultado = base * altura;
        System.out.printf("\nA área do retângulo é: %.2f.", resultado);
    }
}