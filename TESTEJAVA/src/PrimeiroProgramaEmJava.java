import java.util.Scanner;

public class PrimeiroProgramaEmJava {
    public static void main (String[] args){
        System.out.println("Olá, mundo!");
        System.out.println("Escreva o seu nome: ");
        var leitor = new Scanner(System.in);
        var name = leitor.next();
        System.out.println("Digite a sua idade: ");
        var idade = leitor.nextInt();

        System.out.printf("Seu nome é %s, e sua idade é %s.", name, idade);

    }

}