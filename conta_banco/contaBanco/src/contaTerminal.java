
import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Nome");
        String nome = scanner.next();

        System.out.println("Digite sua Agencia");
        String Agencia = scanner.next();

        System.out.println("Digite o Numero da sua Conta");
        int Conta = scanner.nextInt();

        System.out.println("Digite o seu Saldo");
        double Saldo = scanner.nextDouble();

        System.out.println("Olaa, " + nome + " Seja Bem-vindo !!! ");
        System.out.println("| Obrigado por escolher a gente !!!, sua Agencia: " + Agencia + " ");
        System.out.println("| e Conta: " + Conta + ", e seu Saldo: " + Saldo + (" ja esta disponivel para Saque !!!"));

    }
}
