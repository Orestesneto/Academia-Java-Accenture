import java.util.Scanner;

/**
 * @author Orestes Pereira - Academia Java Accenture 29-05-2026
 *         E-mail: orestes.pereira@gmail.com
 *
 */

 
public class NumToWordsUsingMethod {

		/**
		 * @param args
		 */
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a number between 1 and 10: ");
			int i = scanner.nextInt();
			printMyWord(i);	

			scanner.close();

		}

		private static void printMyWord(int i) {
			final String numText;

			if(i==1) {
				numText = "ONE";
			}else if(i==2) {
				numText = "TWO";
			} else if(i==3) {
				numText = "THREE";
			} else if(i==4) {
				numText = "FOUR";
			} else if(i==5) {
				numText = "FIVE";
			} else if(i==6) {
				numText = "SIX";
			} else if(i==7) {
				numText = "SEVEN";
			} else if(i==8) {
				numText = "EIGHT";
			} else if(i==9) {
				numText = "NINE";
			} else if(i==10) {
				numText = "TEN";
			} else {
				numText = "NUMBER " + i;
			}

			System.out.println(numText);
			
		
		}
	}


		



