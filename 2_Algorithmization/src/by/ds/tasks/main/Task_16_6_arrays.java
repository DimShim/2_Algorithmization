package by.ds.tasks.main;
import java.util.Scanner;
 
/*
 * 	16.6 Сформировать квадратную матрицу порядка
 * 		 n по заданному образцу (n - четное):
 */

public class Task_16_6_arrays {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Введите размерность матрицы n (четное): ");
		int n = in.nextInt();
		System.out.println();
		
		int matrix [][] = new int[n][n];
		
		// Заполняем матрицу согласно условию
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if ((j >= i && j + i < n ) || ( j <= i && j + i >= n - 1)){
					matrix[i][j] = 1;
					System.out.print(matrix[i][j] + " ");
				}else {
					matrix[i][j] = 0;
					System.out.print(matrix[i][j] + " ");
				}
				/*if(i == 0 || i == n-1 || j == n/2-1 ||j == n/2) {
					matrix[i][j] = 1;
					System.out.print(matrix[i][j] + " ");
				}else {
					matrix[i][j] = 0;
					System.out.print(matrix[i][j] + " ");
				}*/
			}
			System.out.println(" ");
		}
		in.close();
	}
}
