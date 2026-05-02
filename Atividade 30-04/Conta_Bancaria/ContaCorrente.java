package Conta_Bancaria;

import java.util.Date;
import java.util.InputMismatchException;

public class ContaCorrente {
    private String numeroConta;
    private String titular;
    private double saldo;
    private Date dataMovimentacao;

    public ContaCorrente(String numeroConta, String titular, double saldo, Date dataMovimentacao) {

        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.dataMovimentacao = dataMovimentacao;

    }

    public String getNumeroConta() {

        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {

        this.numeroConta = numeroConta;
    }

    public String getTitular() {

        return titular;
    }

    public void setTitular(String titular) {

        this.titular = titular;
    }

    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }

    public Date getDataMovimentacao() {

        return dataMovimentacao;
    }

    public void setDataMovimentacao(Date dataMovimentacao) {

        this.dataMovimentacao = dataMovimentacao;
    }

    public boolean depositar(double valor) {

        try {
            if (valor > 0) {

                saldo += valor;
                System.out.println("Depósito de R$" + valor + " realizado com sucesso.\n");
                System.out.println("____________________________________________________");
                exibirExtrato();
                return true;

            } else {

                System.out.println("Valor de depósito inválido.\n");
                System.out.println("____________________________________________________");

                exibirExtrato();
                return false;
            }
        } catch (InputMismatchException e) {

            System.out.println("Ocorreu um erro ao realizar o depósito: " + e.getMessage());
            System.out.println("____________________________________________________");
        }
        return false;
    }

    public boolean sacar(double valor) {

        

            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.\n");
                System.out.println("____________________________________________________");
                exibirExtrato();
                return true;

            } else {

                System.out.println("Valor inválido ou saldo insuficiente.\n");
                System.out.println("____________________________________________________");
                exibirExtrato();
                return false;
            }

        }
    

    public boolean transferir(ContaCorrente contaDestino, double valor) {

        

            if (valor > 0 && valor <= saldo) {
                saldo -= valor;

                System.out.println("Transferência de R$" + valor + " para a conta " + contaDestino.getNumeroConta()
                        + " realizada com sucesso.");

                contaDestino.depositar(valor);

                return true;

            } else {

                System.out.println("Valor de transferência inválido ou saldo insuficiente.");
                System.out.println("____________________________________________________");
                exibirExtrato();
                return false;

            }
        

    }

    public void exibirExtrato() {

        System.out.println(this.titular + ", seu saldo atual é: R$" + saldo);
    }

    @Override
    public String toString() {

        return String.format(
                "Conta: %s | Titular: %s | Saldo: R$ %.2f",
                numeroConta, titular, saldo);

    }

}
