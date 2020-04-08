package by.ds.tasks.main;
import java.util.Scanner;

/*
 * 	23.13 Отсотрировать стобцы матрицы по 
 * 		  возрастанию и убыванию значений элементов
 * 
 */

public class Task_23_13_arrays {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Введите количество строк матрицы: ");
		int a = in.nextInt();
		System.out.print("Введите количество столбцов матрицы: ");
		int b = in.nextInt();
		System.out.println();
		
		int matrix[][] = new int [a][b];
		
		// Заполняем массив числами
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random()*100);
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		// Применяем "Пузырьковую" сортировку для 
		// сортировки столбцов матрицы по возрастанию
		int number1;
		for(int i = 0; i < b; i++) {
			for(int r = 0; r < a-1; r++) {
				for(int w = 0; w < a-1-r; w++) {
					if(matrix[w][i] > matrix[w+1][i]) {
						number1 = matrix[w+1][i];
						matrix[w+1][i] = matrix[w][i];
						matrix[w][i] = number1;
					}
				}
			}
		}
	
		// Выводим матрицу используя цикл for-each
		for(int z[] : matrix) {
			for(int x : z) {
				System.out.print(x + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		// Применяем "Пузырьковую" сортировку для 
		// сортировки столбцов матрицы по убыванию
		int number2;
		for(int i = 0; i < b; i++) {
			for(int r = 0; r < a-1; r++) {
				for(int w = 0; w < a-1-r; w++) {
					if(matrix[w][i] < matrix[w+1][i]) {
						number2 = matrix[w+1][i];
						matrix[w+1][i] = matrix[w][i];
						matrix[w][i] = number2;
					}
				}
			}
		}
			
		// Выводим матрицу используя цикл for-each
		for(int z[] : matrix) {
			for(int x : z) {
				System.out.print(x + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		in.close();
	}
}
