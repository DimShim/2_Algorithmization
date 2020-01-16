package by.ds.tasks.main;
import java.util.Scanner;

/*
 * 6. Задана последовательность N вещественных чисел.
 *    Вычислить сумму чисел, порядковые номера которых
 *    являются простыми числами.
 */
public class Task_6_one_dimen_arrays {
	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Введите размерность последовательности N: ");
		int size = in.nextInt();
		
		int[] array1 = new int [size];
		
		for(int i = 0; i < array1.length; i++) {
			array1[i] = (int)(Math.random()*200)-100;
			System.out.print(" " + array1[i] + " ");
			if(i == 0 || i == 1)
				continue;
			if(simplicity_test(i)) 
				sum += array1[i];
		}
		System.out.println("");
		System.out.println("Summa: "+sum);
		in.close();
	}
	
	static boolean simplicity_test(int i) {  		// проверки числа на простоту
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if(i % j == 0)
				return false;
		}
		return true;
	}
}
