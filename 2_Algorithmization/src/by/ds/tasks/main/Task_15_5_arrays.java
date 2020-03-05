package by.ds.tasks.main;
import java.util.Scanner;

/*
 * 	15.5 Сформировать квадрратную матрицу порядка
 * 		 n по заданному образцу (n - четное):
 */

public class Task_15_5_arrays {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Введите размерность матрицы n - (четное) : ");
		int n = in.nextInt();
		System.out.println();
		
		int matrix [][] = new int[n][n];
		int z = n;
		
		// Заполняем матрицу согласно условию
		for(int a = 0; a < matrix.length; a++) {
			for(int b = 0; b < matrix.length; b++) {
				if(b+1 > z) {
					matrix[a][b] = 0;
					System.out.print(matrix[a][b] + " ");
				}else {
				matrix[a][b] = a + 1;
				System.out.print(matrix[a][b] + " ");
				}
			}
			z = z - 1;
			System.out.println();
		}
		System.out.println();
		in.close();
	}
}
