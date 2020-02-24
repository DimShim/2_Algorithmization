package by.ds.tasks.main;
import java.util.Scanner;

/*
 * 	13.3 Дана матрица. Вывести К-ю строку
 * 		 и р-й столбец матрицы.
 */

public class Task_13_3_arrays {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Ввести К-ю строку: ");
		int k = in.nextInt();
		
		System.out.print("Ввести P-й столбец: ");
		int p = in.nextInt();
		int a,b;
		
		int matrix [][] = new int[5][5];
		
		//Заполняем квадратную матрицу
		for(a = 0; a < 5; a++) {
			for(b = 0; b < 5; b++) {
				matrix[a][b] = (int)(Math.random()*10);
				System.out.print(matrix[a][b] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// Выводим элемент К-ой строки
		for(int kstring = k, column = 0; column < 5; column++) { 
			System.out.print(matrix[kstring][column] + " ");
		}
		System.out.println();
				
		// Выводим элемент P-ый столбец
		for(int kstring = 0, column = p; kstring < 5; kstring++) { 
			System.out.print(matrix[kstring][column] + " ");
		}
		
		in.close();
	}
}
