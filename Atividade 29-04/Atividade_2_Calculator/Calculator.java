import java.util.Scanner;

/**
 * @author Orestes Pereira - Academia Java Accenture 29-05-2026
 *         E-mail: orestes.pereira@gmail.com
 *
 */

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int opcao;

        do {
            System.out.println("\n========= CALCULADORA =========");
            System.out.print("Escolha uma opção: ");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();

            switch (opcao) {

                /**
                 * Todas as entradas ( adição, subtração e divisão ) de números foram feitas com int pois nos metodos os tipos
                 * da entrada são do tipo int
                 * Para a multiplicação, o usuário pode escolher quantos números deseja
                 * multiplicar, e os resultados serão calculados em um array.
                 */
                case 1:

                    System.out.print("Digite o primeiro valor: ");
                    int a = sc.nextInt();
                    System.out.print("Digite o segundo valor: ");
                    int b = sc.nextInt();

                    System.out.println("Resultado: " + calc.add(a, b));
                    break;

                case 2:

                    System.out.print("Digite o primeiro número: ");
                    int c = sc.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int d = sc.nextInt();

                    System.out.println("Resultado: " + calc.subtract(c, d));
                    break;

                case 3:

                    System.out.print("Quantos números deseja multiplicar? ");
                    int n = sc.nextInt();

                    int[] numeros = new int[n];

                    for (int i = 0; i < n; i++) {
                        System.out.print("Digite o número " + (i + 1) + ": ");
                        numeros[i] = sc.nextInt();
                    }

                    System.out.println("Resultado: " + calc.multiply(numeros));
                    break;

                case 4:

                    System.out.print("Digite o primeiro número: ");
                    int x = sc.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int y = sc.nextInt();

                    System.out.println("Resultado: " + calc.divide(x, y));
                    break;

                case 0:

                    System.out.println("Voce saiu da Calculadora");
                    break;

                default:

                    System.out.println("Opção inválida. Tente novamente.");

            }
        } while (opcao != 0);

        sc.close();

    }

    private String calculatorType;
    public static final String CALC_TYPE_BASIC = "Basic";

    // Default constructor
    public Calculator() {
    }

    // Parameterized constructor
    public Calculator(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    // Getter for CalculatorType
    public String getCalculatorType() {
        return calculatorType;
    }

    // Setter for CalculatorType
    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    // Add
    public int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    // Subtract
    public int subtract(int x, int y) {
        int diff = 0;
        if (x > y) {
            diff = x - y;
        } else {
            diff = y - x;
        }

        return diff;
    }

    // Multiply
    public int multiply(int[] numbers) {
        // Multiplicação de um array de números, onde o usuário pode escolher quantos
        // números deseja multiplicar.
        int temp = 1;

        for (int i = 0; i < numbers.length; i++) {
            temp = temp * numbers[i];
        }
        return temp;

    }

    // Divide
    public int divide(int x, int y) {
        // Para divisão, se o usuário tentar dividir por zero, o resultado será zero.
        int divValue = 0;
        if (x == 0 || y == 0) {
            divValue = 0;
        } else {
            divValue = x / y;
        }
        return divValue;

    }

}
