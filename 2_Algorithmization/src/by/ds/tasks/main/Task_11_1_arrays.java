package by.ds.tasks.main;

/* 
 * 11.1 Дана матрица. Вывести на экран все нечетыне
 * 		столбцы, у которых первый элемент больше последнего.
 */
public class Task_11_1_arrays {
	public static void main(String [] args) {
		int t, i;
		int table[][] = new int [3][9];
								//Заполняем матрицу		
		for(t = 0; t < 3; ++t) {
			for(i = 0; i < 9; ++i) {
				table[t][i] = (int) (Math.random()*10);
				System.out.print(table[t][i] + " ");
			}
			System.out.println();
		}
		System.out.println();
								//Находим нужный нам по условию столбец		
		for(int a = 1; a < 9; a+=2) {
			if(table[0][a] > table[2][a]) {
				System.out.println(table[0][a]);
				System.out.println(table[1][a]);
				System.out.println(table[2][a]);
				System.out.println();
			}	
		}
		
	}
}
