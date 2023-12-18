package exercicios;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        System.out.println("Conta bancaria");
        String nome = "Gamora";
        String tipoConta = "Conta corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);

        String menu = """
                \n**Digite sua opção**
                1- Consultar saldo
                2- Transferir valor
                3- Receber valor
                4- Sair
                """;
        Scanner leitura = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo atual é de: R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Digite o numero da conta para transferencia: ");
                    double conta = leitura.nextInt();

                    System.out.println("Transferencia realizada com sucesso! Saldo atualizado: R$");
                    System.out.printf("%.2f\n", saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Qual valor deseja receber? ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Processo realizado com sucesso! \nSaldo atualizado: R$" + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção invalida.");
            }
        }
    }
}
