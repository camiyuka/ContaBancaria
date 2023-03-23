import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in).useLocale(Locale.US);

        System.out.println("olá cliente! como vai? para proceguir com o requerimento, preencha a seguir:");

        System.out.println("escreva o número da sua conta:");
        final int numero = scanner.nextInt();

        System.out.println("digite o número da sua agência:");
        final int agencia = scanner.nextInt();

        System.out.println("digite o seu nome completo:");
        final String nome= scanner.next();

        System.out.println("digite saldo que vc gostaria de sacar:");
        final double saldo = scanner.nextDouble();

        System.out.println("prontinho!");
        System.out.println("obrigada por criar uma conta em nosso banco!");
   }
}
