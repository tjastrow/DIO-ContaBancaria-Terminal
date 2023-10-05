import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Por favor, insira o nome do titular da conta: ");
        String nomeCliente = entrada.next().toUpperCase();
        System.out.printf("Por favor, digite o número da Agência: ");
        String agencia = entrada.next();
        System.out.printf("Por favor, digite o número da Conta: ");
        int numeroConta = entrada.nextInt();
        System.out.printf("Por favor, digite o saldo: R$ ");
        double saldo = entrada.nextDouble();
        System.out.printf("Olá, %s. Agradecemos por criar uma conta em nosso banco. " +
                        "Sua agência é %s, conta %d, e seu saldo de R$ %.2f já está disponível para saque.",
                nomeCliente, agencia, numeroConta, saldo);
    }
}
