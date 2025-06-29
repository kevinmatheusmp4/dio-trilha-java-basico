import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in); // criando o sistema de Scanner

        System.out.println("Seja bem-vindo ao Banco Simples na DIO!\n"); //Uma simples mensagem de Boas=vindas

        System.out.println("Para começar, informe o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("\nInforme o número da sua Conta Bancária: ");
        int contabancaria = scanner.nextInt();
        scanner.nextLine(); // impede um bug que dava no terminal, impedindo que desse para preencher a o numero de Agencia

        System.out.println("\nInforme o número da sua AGÊNCIA com o DÍGITO:");
        String agencia = scanner.nextLine();

        System.out.println("\nDigite quanto você quer depositar de SALDO na sua conta bancária: ");
        double saldo = scanner.nextDouble();


        System.out.printf ("\nOlá, " + nome + "! Obrigado por criar uma conta em nosso banco. Seguem os dados da sua conta: \n");
        System.out.printf ("\nAgência: " + agencia + "\n");
        System.out.printf ("Conta: " + contabancaria + "\n");
        System.out.printf ("Saldo disponível: " + saldo + "\n\n");

    }
}
