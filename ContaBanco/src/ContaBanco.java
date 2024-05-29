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
        }
    }
}
