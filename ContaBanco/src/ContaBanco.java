import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Porfavor, digite número da agência: ");
            int agencia = scanner.nextInt();
            
            System.out.println("Porfavor, digite numero da conta da agência: ");
            String conta = scanner.next();

            System.out.println("Porfavor, digite seu nome: ");
            String nome = scanner.next();
            
            System.out.println("Porfavor, digite seu saldo: ");
            double saldo = scanner.nextDouble();

            System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ",conta " + conta + ", e seu saldo " + saldo + " já está disponível para saque.");
            
            System.out.println("Para Depositar digite '1'. Para Sacar digite '2'. Para sair digite '3'");
            int acao = scanner.nextInt();

            if(acao == 1){
                System.out.println("Digite o valor do depósito: ");
                double deposito = scanner.nextDouble();
                saldo = saldo + deposito;
                System.out.println("seu saldo atual é " + saldo);
            }
            if(acao == 2){
                System.out.println("Digite valor do saque: ");
                double saque = scanner.nextDouble();
                if (saque <= saldo){
                    System.out.println("Saque efetuado.");
                    saldo = saldo - saque;
                }
                if (saque > saldo){
                    System.out.println("Saque recusado");
                }
                System.out.println("Seu saldo atual é " + saldo);
            }
        }
    }
}
