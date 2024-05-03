import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        double saldo;
        String agencia;
        String nomeCliente;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente:");
        nomeCliente = scanner.nextLine();
        System.out.println("Digite o número da conta:");
        numero = scanner.nextInt();
        System.out.println("Digite a agência:");
        agencia = scanner.next();
        System.out.println("Digite o saldo:");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque%n", nomeCliente, agencia, numero, saldo);
    }
}
