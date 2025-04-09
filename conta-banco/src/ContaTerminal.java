import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // importando a classe Scanner para ler os dados do usuário

        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = teclado.nextLine();
        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = teclado.nextInt();
        System.out.println("Por favor, digite o seu nome !");
        String nomeCliente = teclado.next();
        System.out.println("Por favor, digite o saldo da conta !");
        double saldo = teclado.nextDouble();

        // Exibindo os dados do cliente

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
