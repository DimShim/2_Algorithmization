package by.ds.tasks.main;
import java.util.Scanner;

/*
 * 2. Дана последовательность действительных чисел
 *    а1, а2,...,аn. Заменить все ее члены, большие
 *    данного Z, этим числом. Подсчитать количество
 *    замен.
 */
public class Task_2_one_dimen_arrays {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int size = 101;
		int [] array = new int [size];
		System.out.print("Enter number Z: ");
		int z = in.nextInt();
		int sum_zam = 0;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = ((int)(Math.random()* 101) - 50);
			if(array[i] > z) {
				System.out.print(" "+ z + " ");
				sum_zam += 1;
			}else {
				System.out.print("" + array[i] + " ");
			}
			
		}
		System.out.println("");
		System.out.println("Replacement amount: "+ sum_zam);
		in.close();
	}
	

}
