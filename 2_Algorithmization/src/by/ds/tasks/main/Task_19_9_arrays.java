package by.ds.tasks.main;
import java.util.Scanner;

/*
 * 	19.9 Задана матрица неотрицательных чисел.
 * 		 Посчитать сумму элементов в каждом столбце.
 * 		 Определить, какой столбец содержит
 * 		 максимальную сумму.
 */

public class Task_19_9_arrays {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Введите количество строк матрицы: ");
		int n = in.nextInt();
		System.out.print("Введите количество столбцов матрицы: ");
		int m = in.nextInt();
		System.out.println();
		
		// Заполняем массив
		int matrix[][] = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				matrix[i][j] = (int)(Math.random()*100);
				System.out.print(matrix[i][j] + "\t");
			}
		System.out.println();
		}
		System.out.println();
		
		// Находим суммы столбцов и заносим их в массив
		int[] arraySum = new int[m]; 
		int x = 0; //буфер для значений матрицы
		for(int colum = 0; colum < m; colum++) {
			for(int i = 0; i < n; i++) {
				x += matrix[i][colum];
			}
			arraySum[colum] = x;
			x = 0;
			System.out.print(arraySum[colum] + "\t");
		}
		System.out.println();
		
		// Определяем номер столбца в котором получилась
		// максимальная сумма значений столбца
		int numberColum = 0;
		int maxim = arraySum[0];
		for(int t = 0; t < arraySum.length; t++) {
			if(arraySum[t] > maxim) { 
				maxim = arraySum[t];
				numberColum = t+1;	//t+1 так как массив начинается с 0, а не с 1
			}
		}
		System.out.println();
		System.out.print("Столбец " + numberColum + 
						" содержит максимальную сумму " + maxim);
		in.close();
	}
}
