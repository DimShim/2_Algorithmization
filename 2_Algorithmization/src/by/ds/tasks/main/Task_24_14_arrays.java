package by.ds.tasks.main;

/*
 * 	24.14 Сформировать случайную матрицу m x n, 
 * 		  состоящую из нулей и единиц, причем в 
 *        каждом столбце число единиц равно номеру столбца.
 */

public class Task_24_14_arrays {
	public static void main(String[] args) {
		
		int m = (int)(Math.random()*15);
		int n = m;
		
		int matrix[][] = new int[m][n];
		
		int a;
		for(int j = 0; j < m; j++) {
			a = 0;
			for(int i = 0; i < n; i++) {
				if(a <= j) {
					matrix[i][j] = 1;
					a++;
				}
			}
		}
		
		/*
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i <= j) {
                    matrix[i][j] = 1;
                }
            }
        }
		*/
		// Выводим матрицу используя цикл for-each
		for(int z[] : matrix) {
			for(int x : z) {
				System.out.print(x + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
