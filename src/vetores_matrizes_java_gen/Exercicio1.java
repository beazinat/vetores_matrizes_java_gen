package vetores_matrizes_java_gen;

import java.util.*;

public class Exercicio1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array[] = {3, 15, 30, 9, 65, 40, 20, 73, 55, 100};
		
		System.out.println("Digite o número que você deseja encontrar: ");
		int number = scan.nextInt();
		
		int position = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				position = i;
				break;
			}
		}
		
		if (position != -1) {
			System.out.println("O número " + number + " foi encontrado na posição: " + position);
		} else {
			System.out.println("Não foi encontrado!");
		}
		
		scan.close();
	}
}