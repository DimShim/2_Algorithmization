package by.ds.tasks.main;
import java.util.Scanner;

/*
 * 	14.4 Сформировать квадратную матрицу порядка n
 * 		 по заданному образцу (n - четное)
 */

public class Task_14_4_arrays {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Введите размерность матрицы n - (четное) : ");
		int n = in.nextInt();
		System.out.println();
		
		int matrix [][] = new int[n][n];
		
		//заполняем марицу согласно заданию
		for(int a = 0; a < matrix.length; a++) {
			for(int b = 0; b < matrix.length; b++) {
				if(a == 0 | a % 2 == 0) {
					matrix[a][b] = b+1;
					System.out.print(matrix[a][b] + " ");
				}else {
					matrix[a][b] = n-b;
					System.out.print(matrix[a][b] + " ");
				}
			}
			System.out.println();		
		}
		in.close();
	}
}
