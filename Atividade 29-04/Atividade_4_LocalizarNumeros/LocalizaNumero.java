package Atividade_4_LocalizarNumeros;

/**
 * @author Orestes Pereira - Academia Java Accenture 29-05-2026
 *         E-mail: orestes.pereira@gmail.com
 *
 */
	
	public class LocalizaNumero {
	// Corrigir este algoritmo.
	public static void main(String[] args) {
		int vetor[] = {1,2,3,4,5,6,7,8,9,10};
		int numero = 8;
		boolean achou = false;
		int posicao = -1;
		
		for (int i=0; i<10; i++) {
			if (vetor[i] == numero){
				achou = true;
				posicao = i;	
		    }
		}
		if (achou) {
	        System.out.println("Achei");
	        System.out.printf("Na Posição %d está localizado do numero %d.", posicao, vetor[posicao]);			
		}
	}
}

