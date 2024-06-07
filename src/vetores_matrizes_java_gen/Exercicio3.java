package vetores_matrizes_java_gen;

import java.util.*;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [][] matrix = new int[3][3];
		int mainSum = 0,
		secondarySum = 0;
		
		System.out.println("Digite os elementos da matriz: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Elementos da Diagonal Principal: ");
		for (int i = 0; i < 3; i++) {
			System.out.println(matrix[i][2 - i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			mainSum += matrix[i][i];
			secondarySum += matrix[i][2 - i];
		}
		
		System.out.println("Soma dos elementos da Diagonal Principal: " + mainSum);
		System.out.println("Soma dos elementos da Diagonal Principal: " + secondarySum);
		
		scan.close();
	}
}
