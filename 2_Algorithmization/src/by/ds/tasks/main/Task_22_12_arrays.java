package by.ds.tasks.main;
import java.util.Scanner;

/*
 * 	22.12 Отсортировать строки матрицы по возрастанию
 * 		  и убыванию значений элементов.
 */

public class Task_22_12_arrays {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Введите количество строк матрицы: ");
		int a = in.nextInt();
		System.out.print("Введите количество столбцов матрицы: ");
		int b = in.nextInt();
		System.out.println();
		
		int matrix[][] = new int[a][b];
		
		// Заполняем массив
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random()*100);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// Применяем "Пузырьковую" сортировку для
		// сортировки строк матрицы по возрастанию
		int number1;
		for(int i = 0; i < matrix.length; i++) {
			for(int r = 1; r < matrix[i].length; r++) {
				for(int t = matrix[i].length - 1; t >= r; t--) {
					if(matrix[i][t-1] > matrix[i][t]) {
						number1 = matrix[i][t-1];
						matrix[i][t-1] = matrix[i][t];
						matrix[i][t] = number1;
					}
				}
			}
		}
		
		// Для вывода матрицы используем разновидность цикла for-each
		for(int z[] : matrix) {
			for(int q : z) {
				System.out.print(q + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// Применяем "Пузырьковую" сортировку для
		// сортировки строк матрицы по убыванию
		int number2;
		for(int i = 0; i < matrix.length; i++) {
			for(int r = 1; r < matrix[i].length; r++) {
				for(int t = matrix[i].length - 1; t >= r; t--) {
					if(matrix[i][t-1] < matrix[i][t]) {
						number2 = matrix[i][t-1];
						matrix[i][t-1] = matrix[i][t];
						matrix[i][t] = number2;
					}
				}
			}
		}
		
		// Для вывода матрицы используем разновидность цикла for-each
		for(int w[] : matrix) {
			for(int d : w) {
				System.out.print(d + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		in.close();
		
	}
}
