package by.ds.tasks.main;
import java.util.Scanner;

/*
 * 3. Дан массив действительных чисел, размерность
 * 	  которого N. Подсчитать, сколько в нем отрицательных,
 *    положительных и нулевых элементов.
 */

public class Task_03_one_dimen_arrays {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter array size N: ");
		int size = in.nextInt();
		
		int[] array1 = new int [size];
		
		int posi_elem = 0;
		int negat_elem = 0;
		int zero_elem = 0;
		
		for(int i = 0; i <array1.length; i++) {
			array1[i] = (int)(Math.random()*200) - 100;
			System.out.print(" " + array1[i] + " ");
			if (array1[i] > 0) 
				posi_elem++;
			if(array1[i] < 0)
				negat_elem++;
			if(array1[i] == 0)
				zero_elem++;
		}
		
		System.out.println("");
		System.out.println("Positive:"+ posi_elem);
		System.out.println("Negative:"+ negat_elem);
		System.out.println("Zero:"+ zero_elem);
		in.close();
	}

}
