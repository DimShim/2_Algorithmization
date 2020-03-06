package by.ds.tasks.main;
import java.util.Scanner;

/*
 * 	18.8 В числовой матрице поменять местами два столбца,
 * 		 любых столбца, т.е. все элементы одного столбца
 * 		 поставить на соответствующие им позиции другого,
 * 		 а его элементы второго переместить в первый. 
 * 		 Номера столбцов вводит пользователь с клавиатуры.
 */

public class Task_18_8_arrays {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Введите количество строк: ");
		int n = in.nextInt();
		System.out.print("Введите количество столбцов: ");
		int m = in.nextInt();
		System.out.print("Выберите первый столбец: ");
		int c1 = in.nextInt()-1;
		System.out.print("Выберите второй столбец: ");
		int c2 = in.nextInt()-1;
		System.out.println();
		
		int x = 0; // Переменная для временного хранения
			   // значения из первого столбца
		
		int matrix[][] = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				matrix[i][j] = (int)(Math.random() * 100);
				System.out.print(matrix[i][j] + "\t");
			}
		System.out.println();	
		}
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			x = matrix[i][c1];
			matrix[i][c1] = matrix[i][c2];
			matrix[i][c2] = x;
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
		System.out.println();
		}
		in.close();
	}
}
