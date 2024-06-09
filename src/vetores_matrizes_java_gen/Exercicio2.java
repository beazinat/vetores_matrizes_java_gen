package vetores_matrizes_java_gen;

import java.util.*;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[10];
		
		System.out.println("Digite 10 números inteiros: ");
		for (int i = 0; i < 10; i++) {
			numbers[i] = scan.nextInt();
		}
		
		System.out.println("\nElementos ímpares: ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();
		
		System.out.println("\nElementos pares: ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();
		
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("\nA Soma de todos os elementos do vetor: " + sum);
		
		double average = (double) sum / numbers.length;
		System.out.println("\nA Média de todos os elementos do vetor: " + average);
		
		scan.close();
	}
}