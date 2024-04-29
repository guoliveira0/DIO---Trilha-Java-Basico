
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nome;
        double  saldo ;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o número da agência:");
            numero = scanner.nextInt();
            System.out.println("Digite a agência:");
            agencia = scanner.next();
            System.out.println("Digite o seu saldo:");
            saldo = scanner.nextDouble();
            System.out.println("Digite o seu nome:");
            nome = scanner.next();
        }
        System.out.print("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " ,conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        


    }
}
