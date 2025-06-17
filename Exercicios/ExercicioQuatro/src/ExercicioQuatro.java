import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args){
        System.out.println("Vamos calcular a diferença de idade entre você e quem você quiser!\n");

        var scanner = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        var nameA = scanner.next();
        System.out.print("Qual é a sua idade? ");
        var ageA = scanner.nextInt();

        System.out.print("Qual o nome da pessoa que você quer saber a diferença de idade? ");
        var nameB = scanner.next();
        System.out.print("Qual é a idade dessa pessoa? ");
        var ageB = scanner.nextInt();

        var diferenca = Math.abs(ageA - ageB);
        System.out.printf("%s, a diferença de idade entre você e %s é de %d anos.", nameA, nameB, diferenca);
    }
}