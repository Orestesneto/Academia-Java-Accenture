import java.util.Scanner;

/**
 * @author Orestes Pereira - Academia Java Accenture 29-05-2026
 *         E-mail: orestes.pereira@gmail.com
 *
 */

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float valorIngressoClasseA = 50.00f;
        float valorIngressoClasseB = 30.00f;
        float valorIngressoClasseC = 20.00f;

        System.out.printf("Digite a quantidade de Ingressos vendidos da CLASSE A:");
        int qtdIngressoClasseA = sc.nextInt();

        System.out.printf("Digite a quantidade de Ingressos vendidos da CLASSE B:");
        int qtdIngressoClasseB = sc.nextInt();

        System.out.printf("Digite a quantidade de Ingressos vendidos da CLASSE C:");
        int qtdIngressoClasseC = sc.nextInt();

        float valorTotalArrecadado = (valorIngressoClasseA * qtdIngressoClasseA)
                + (valorIngressoClasseB * qtdIngressoClasseB) + (valorIngressoClasseC * qtdIngressoClasseC);

        System.out.printf("Valor arrecadado da CLASSE A: R$ %.2f%n", valorIngressoClasseA * qtdIngressoClasseA);
        System.out.printf("\nValor arrecadado da CLASSE B: R$ %.2f%n", valorIngressoClasseB * qtdIngressoClasseB);
        System.out.printf("\nValor arrecadado da  CLASSE C: R$ %.2f%n", valorIngressoClasseC * qtdIngressoClasseC);
        System.out.println("____________________________________________________________");

        System.out.printf("VALOR TOTAL ARRECADADO: R$ %.2f", valorTotalArrecadado);

        sc.close();
    }

}