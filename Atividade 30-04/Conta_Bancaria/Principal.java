package Conta_Bancaria;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cliente cliente1 = new Cliente("Orestes", "Santos", "123.456.789-00");
        ContaCorrente conta1 = new ContaCorrente("12345-6", cliente1.getNome(), 1000.0, new Date());

        System.out.println("Cliente: " + cliente1.getNome());
        System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("Número da Conta: " + conta1.getNumeroConta());
        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo: R$" + conta1.getSaldo());
        System.out.println("Data da Movimentação: " + conta1.getDataMovimentacao());

         System.out.println("_____________________________");


        Cliente cliente2 = new Cliente("Maria", "Silva", "987.654.321-00");
        ContaCorrente conta2 = new ContaCorrente("65432-1", cliente2.getNome(), 500.0, new Date());    
        System.out.println("\nCliente: " + cliente2.getNome());
        System.out.println("CPF: " + cliente2.getCpf());
        System.out.println("Número da Conta: " + conta2.getNumeroConta());
        System.out.println("Titular: " + conta2.getTitular());
        System.out.println("Saldo: R$" + conta2.getSaldo());
        System.out.println("Data da Movimentação: " + conta2.getDataMovimentacao());
        System.out.println("_____________________________");






        boolean depositoRealizado = false;
        while (!depositoRealizado) {
            try {
                System.out.print(cliente1.getNome() + ", digite o valor que você quer depositar:");

                double valorDeposito = scanner.nextDouble();

                if (conta1.depositar(valorDeposito)) {
                    System.out.println("Depósito realizado!");
                    System.out.println("____________________________________________________");
                    depositoRealizado = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: digite apenas números!");

                scanner.nextLine(); // 🔥 limpa o erro
            }
        }




        boolean sacarDinheiro = false;

        while (!sacarDinheiro) {
            try {
                System.out.print(conta1.getTitular() +
                        ", digite o valor que você quer sacar: ");

                double valorSaque = scanner.nextDouble();

                sacarDinheiro = conta1.sacar(valorSaque);

            } catch (InputMismatchException e) {
                System.out.println("Erro: digite apenas números!");

                scanner.nextLine();
            }
        }

        
        
        
        boolean transferenciaRealizada = false;

        while (!transferenciaRealizada) {

            try {

                System.out.print(conta1.getTitular() +
                        ", digite o valor para transferência para " + conta2.getTitular() + ": ");
                double valor = scanner.nextDouble();
                transferenciaRealizada = conta1.transferir(conta2, valor);

            } catch (InputMismatchException e) {

                System.out.println("Erro: digite apenas números!");
                scanner.nextLine();
            }
        }

       
       
        System.out.println("_____________________________");

        System.out.println();

        System.out.println(conta1.toString());

        System.out.println();
        System.out.println(conta2.toString());

        scanner.close();

    }
}
