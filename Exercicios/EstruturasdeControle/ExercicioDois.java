import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        double altura; 
        double peso;
        

        System.out.print("Qual é a sua altura? ");
        altura = scanner.nextDouble();

        System.out.print("Qual é o seu peso? ");
        peso = scanner.nextDouble();

        double imc = peso/(altura * altura);
        System.out.printf("Seu IMC é de %.2f\n", imc);
        scanner.close(); 

        if (imc <= 18.5) {
            System.out.print("Abaixo do peso");
        }
            else if (imc >= 18.6 && imc <= 24.9) {
            System.out.print("Peso ideal");
        }            
           else if (imc >= 25 && imc <= 29.9) {
            System.out.print("Levemente acima do peso");
        }
            else if (imc >= 30 && imc <= 34.9) {
            System.out.print("Obesidade Grau I");
        }
            else if (imc >= 35 && imc <= 39.9) {
            System.out.print("Obesidade Grau II (Severa)");
        }
           else if (imc >= 40) {
            System.out.print("Obesidade III (Mórbida)");
        }
        
    }

}
    

