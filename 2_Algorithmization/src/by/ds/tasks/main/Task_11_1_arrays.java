package by.ds.tasks.main;

/* 
 * 11.1 Дана матрица. Вывести на экран все нечетыне
 * 		столбцы, у которых первый элемент больше последнего.
 */
public class Task_11_1_arrays {
	public static void main(String [] args) {
		int t, i;
		int element[][] = new int [3][9];
		
		//Заполняем матрицу		
		for(t = 0; t < 3; ++t) {
			for(i = 0; i < 9; ++i) {
				element[t][i] = (int) (Math.random()*10);
				System.out.print(element[t][i] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//Находим нужные нам по условию столбцы		
		for(int a = 1; a < 9; a+=2) {
			if(element[0][a] > element[2][a]) {
				System.out.println(element[0][a]);
				System.out.println(element[1][a]);
				System.out.println(element[2][a]);
				System.out.println();
			}	
		}
		
	}
}
