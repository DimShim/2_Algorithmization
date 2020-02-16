package by.ds.tasks.main;

/*
 * 12.2 Дана квадратная матрица. Вывести на 
 * 		экран элементы, стоящие по диагонали.
 */

public class Task_12_2_arrays {
	public static void main(String [] args) {
		
		int a,b;
		int matrix[][] = new int [4][4];
		
		//Заполняем квадратную матрицу
		for(a = 0; a < 4; a++) {
			for(b = 0; b < 4; b++) {
				matrix[a][b] = (int)(Math.random()*10);
				System.out.print(matrix[a][b] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// Выводим элементы по диагонали
		int t,h;
		for(h = 0, t = 0; h < 4; h++, t++) {
			System.out.print(matrix[t][h] + " ");
			
			
		}
	}
}
