import java.util.Scanner;


//Classe principal do projeto


public class ContaTerminal {
    public static void main(String[] args) {

        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Banco do Terminal!");
        System.out.println("Vamos criar uma conta para você!");

         //Exibir as mensagens para o usuário
        System.out.println("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();
        System.out.println("Digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem da conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }

}