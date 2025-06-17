import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.Period;
import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        var name = scanner.next();

        System.out.println(" Digite o seu ano de nascimento para calcularmos a sua idade: ");
        var year = scanner.nextInt();

        System.out.println("Seu mês: ");
        var month = scanner.nextInt();

        System.out.println("E o dia do seu nascimento: ");
        var day = scanner.nextInt();

        var birthDate = LocalDate.of(year, month, day);
        var today = LocalDate.now();

        var anosCompletos = Period.between(birthDate, today).getYears();

        System.out.printf("De acordo com as informações que você nos passou %s, sua idade é %s.", name, anosCompletos);

    }
}