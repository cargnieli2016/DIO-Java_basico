import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        // Exibir as mensagens para o nosso usuario
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite a agência do cliente: ");
        String agenciaCliente = scanner.next();

        System.out.println("Digite o número da conta do cliente: ");
        int numeroContaCliente = scanner.nextInt();

        System.out.println("Digite o saldo do cliente: ");
        double saldoCliente = scanner.nextDouble();

        //Exibir a mensagem conta criada

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaCliente + ", conta número " + numeroContaCliente + " e seu saldo é de R$ " + saldoCliente + " já está disponível!");
    }
}
