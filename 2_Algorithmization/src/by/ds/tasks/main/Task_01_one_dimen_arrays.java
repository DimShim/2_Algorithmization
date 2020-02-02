package by.ds.tasks.main;
import java.util.Scanner;

/*
 * 1. В массив A[N] занесены натуральные числа.
 *    Найти сумму тех элементов, которые кратны данному К.
 */

public class Task_1_one_dimen_arrays {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = in.nextInt();
		int[] A = new int[n];
		System.out.print("Enter K: ");
		int k = in.nextInt();
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			A[i] = (int)(Math.random() * 100);
			System.out.print(A[i] + " ");
			if (A[i] % k == 0)
				sum += A[i];
		}
		System.out.println(" ");
		System.out.print("Sum is: " + sum);
		in.close();
	}
}
