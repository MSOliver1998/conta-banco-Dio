import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in).useLocale(Locale.US);

        System.out.println("insira seu nome:");
        String name=scanner.next();

        System.out.println("insira o numero da conta: ");
        int number=scanner.nextInt();

        System.out.println("digite o numero da sua agência: ");
        int agencia= scanner.nextInt();

        System.out.println("digite o valor a ser depositado: ");
        double sald= scanner.nextDouble();

        System.out.print("olá " + name + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + number + " seu saldo " + sald + " já está disponivel para saque");
    }
}