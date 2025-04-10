import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;
        double saldo = 0, valor;

            System.out.println("Bem vindo ao Bando FIAP");
        do{
            System.out.println("\nOperações disponíveis neste caixa:" +
                    "\n\n1 - Depósito\t\t2 - Saque" +
                    "\n3 - Consultar saldo\t4 - Sair");
            System.out.println("Opção: ");
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor a ser depositado: R$ ");
                    valor = leitor.nextDouble();
                    saldo += valor;
                    break;
                case 2:
                    System.out.println("Informe o valor de saque: R$ ");
                    valor = leitor.nextDouble();
                    saldo -= valor;
                    break;
                case 3:
                    System.out.println("Saldo: R$" + saldo);
                    break;
                case 4:
                    System.out.println("Obrigado! Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while(opcao != 4);
    }
}
