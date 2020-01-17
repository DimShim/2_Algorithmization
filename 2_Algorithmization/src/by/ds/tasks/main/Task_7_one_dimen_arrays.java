package by.ds.tasks.main;
import java.util.Scanner;

/*
 * 7. Даны действительные числа а1,а2,..,а2n.
 *    max(a1+a2n, a2+a2n-1,..., an+an+1).
 */

public class Task_7_one_dimen_arrays {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Введите размерность массива: ");
		int size = in.nextInt();
		
		double[] array = new double[2 * size];
		for(int i = 0; i < array.length; i++) {
			array[i] = (double)(Math.random() * 200)-100;
			System.out.print(" " + array[i] + " ");
		}
		
		double max = Double.MIN_VALUE;
		for( int i = 0, j = array.length - 1; i < j; i++, j--) {
			max = Double.max(array[i] + array[j],max);
		}
		System.out.println("");
		System.out.println(max);
		in.close();
		
	}
	
}
