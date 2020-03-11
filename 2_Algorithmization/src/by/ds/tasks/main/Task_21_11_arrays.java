package by.ds.tasks.main;

/*
 * 	21.11 Матрицу 10х20 заполнить случайными числами от 0 до 15.
 * 		  Вывести на экран саму матрицу и номера строк, в которых
 * 		  число 5 встречается три и более раз.
 */

public class Task_21_11_arrays {
	public static void main(String [] atgs) {
		
		int matrix[][] = new int[10][20];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				int x = 0, y = 15;
				int number = (int)(Math.random()*((y-x)+1) + x);
				matrix[i][j] = number;
			}
		}
		
		// Для вывода матрицы используем разновидность цикла for-each
		for(int a[] : matrix) {
			for(int b : a) {
				System.out.print(b + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		// Находим 5-ки в каждой строке и выводим
		// ту строку в которой их 3 и больше.
		int counter = 0; // счетчик "5"
		for(int q = 0; q < matrix.length; q++) {
			for(int w = 0; w < matrix[q].length; w++) {
				if(matrix[q][w] == 5) 
					counter ++;
			}
			if(counter >= 3)
				System.out.println("Строка " + q + " имеет три или более 5-ок.");
			counter = 0;	
		}
	}
}
