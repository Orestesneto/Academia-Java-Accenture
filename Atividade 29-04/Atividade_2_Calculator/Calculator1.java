import java.util.Scanner;

/**
 * @author Orestes Pereira - Academia Java Accenture 29-05-2026
 *         E-mail: orestes.pereira@gmail.com
 *
 */


public class Calculator1 {
    
		
	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
 
        int opcao;

        do {

            int x = 10;
	        int y = 5;
	
	int[] nums = {1, 2, 3, 4};
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


                case 1:

                    System.out.println("Adicao resultado : " + add(x,y));

                    break;

                case 2:

                    System.out.println("Subtracao resultado : " + subtract(x,y));
                    break;

                case 3:

                    System.out.println("Multiplicacao resultado : " + multiply(nums));

                    break;

                case 4:

                    System.out.println("Divisao resultado1: " + divide(x,y));
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

    

    private static int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	private static int subtract(int x, int y) {
		int diff = 0;
		if (x > y) {
			diff = x - y;
		} else {
			diff = y - x;
		}

		return diff;
	}

	private static int multiply(int[] numbers) {
		int temp = 1;

		for (int i = 0; i < numbers.length; i++) {
			temp = temp * numbers[i];
		}
		return temp;

	}

	private static int divide(int x, int y) {
		int divValue = 0;
		if (x == 0 || y == 0) {
			divValue = y / x;
		} else {
			divValue = x / y;
		}
		return divValue;

	}
	
}

