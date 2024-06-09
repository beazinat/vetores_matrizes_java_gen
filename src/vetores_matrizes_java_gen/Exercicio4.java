package vetores_matrizes_java_gen;

import java.util.*;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double [][] grades = new double [10][4];
		double [] average = new double [10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite as notas do " + (i + 1) + "º participante: ");
			double sum = 0;
			
			for (int j = 0; j <4; j++) {
				System.out.print("Nota do " + (j + 1) + "º bimestre: ");
				grades [i][j] = scan.nextDouble();
				sum += grades[i][j];
			}
			average[i] = sum / 4; 
		}
		System.out.println("Médias dos participantes:");
		for (int i = 0; i < 10; i++) {
			System.out.println("Participante " + (i + 1) + ": " + average[i]);
		}
		scan.close();
	}
}