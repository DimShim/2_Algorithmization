package by.ds.tasks.main;
import java.util.Scanner;

/*
 * 	20.10 Найти положительные элементы главной
 * 		  диагонали квадратной матрицы.
 */

public class Task_20_10_arrays {
	public static void main(String [] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.print("Введите размерность квадратной марицы: ");
		int n = in.nextInt();
		
		int matrix[][] = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int y = 0; y < n; y++) {
				matrix[i][y] = (int) ((Math.random()*100)-51);
				System.out.print(matrix[i][y] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.print("Положительные элементы главной диагонали: ");
		for(int a = 0, b = 0; a < n; a++, b++) {
			if(matrix[a][b] > 0)
				System.out.print(matrix[a][b] + "\t");
		}
		in.close();
	}
}
