package by.ds.tasks.main;
import java.util.Scanner;

/*
 * 	17.7 Сформировать квадратную матрицу порядка 
 * 		 N  по правилу:
 * 
 * 						A[I,J]=sin((I^2 - J^2)/N)
 * 
 * 		 и подсчитать количество положительных
 * 		 элементов в ней.
 */

public class Task_17_7_arrays {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Введите размерность матрицы N (четное): ");
		int n = in.nextInt();
		System.out.println();
		
		double matrix[][] = new double[n][n]; // double из-зa sin
		int a = 0; // Количество положительных элементов в матрице
		
		// Заполняем матрицу согласно правилу
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = Math.sin((double)(i * i - j * j) / n);
				System.out.printf("%.2f  ", matrix[i][j]);
				if(matrix[i][j] > 0)
					a++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("Количество положительных элементов в матрице: " + a);
		in.close();
	}

}
