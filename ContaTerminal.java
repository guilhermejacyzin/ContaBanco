import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o seu nome: ");
        String nome = input.nextLine();

        System.out.println("Olá " + nome);

        // Definindo saldo inicial
        double saldo = 25;

        // Obtendo o valor solicitado do usuário
        System.out.print("Digite o valor que deseja sacar: ");
        double valorSolicitado = input.nextDouble();


        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente");
        }

        // Imprimindo o saldo atual
        System.out.println("Saldo atual: " + saldo);


        input.close();

    }
}
