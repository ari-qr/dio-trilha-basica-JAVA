import java.util.Scanner;

/*
 todo:
 [x] Conhecer e importar a classe Scanner
 [x] Exibir mensagens para o usuário
 [x] Obter pela scanner os valores digitados no terminal
 [x] Exibir a mensagem conta criada
 [x] Declarar as variáveis corretamente
 [x] Revisar concat
 [x] Entender como ler o nome completo, sem dar erro no scanner debaixo.
*/

public class ContaTerminal {
    public static void main(String[] args){

        var scanner = new Scanner(System.in);
        int numeroDaConta;
        String agencia;
        String nomeCliente;
        double saldo;


        System.out.print("Vamos criar a sua conta fictícia no Banco Java!\n Para começar, insira até 4 números para a conta: ");
        numeroDaConta = Integer.parseInt(scanner.nextLine());

        System.out.print("Agora digite o número da sua agência (ex: 789-0): ");
        agencia = scanner.nextLine();

        System.out.print("Insira o seu nome completo: ");
        nomeCliente = scanner.nextLine();
       

        System.out.print("Quanto você gostaria de depositar na sua conta fictícia? ");
        saldo = Double.parseDouble(scanner.next().replace(",", "."));
        scanner.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.2f já está disponível para saque", nomeCliente, agencia, numeroDaConta, saldo);
               
    }
}