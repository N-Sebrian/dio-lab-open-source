import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da sua agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Digite o número da sua conta:");
        int conta = scanner.nextInt();
        scanner.nextLine(); // consome a quebra de linha deixada pelo nextInt()

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        
        System.out.println("Digite seu último saldo:");
        float saldo = scanner.nextFloat();
        
        System.out.printf(
            "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n",
            nome, agencia, conta, saldo
        );
    }
}
