package by.ds.tasks.main;
import java.util.Scanner;

/*
 * 8. Дана последовательность целых чисел а1,а2,...,аn. 
 *    Образовать новую последовательность, выбросив из
 *    исходной те члены, которые равны min(a1,a2,...,an).
 */

public class Task_8_one_dimen_arrays {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Введите размер последовательности: ");
		int size = in.nextInt();
		System.out.println("");
		
		//Создал массив и заполнил его
		int[] array = new int[size]; 
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*200)-100;
			System.out.print(" " + array[i] + " ");
		}
		
		// Нашел минимальное число в массиве
		int min = array[0];
		for(int t = 0; t < array.length; t++) {
			if(array[t] < min) 
				min = array[t];
		}
		
		System.out.println("");
		System.out.println("Min is: " + min);
		
		// Новая последовательность без min
		int[] array1 = new int[size];
		for(int j = 0; j < array.length; j++) {
			if(array[j] != min) {
				array1[j] = array[j];
				System.out.print(" " + array1[j] + " ");
			}else {
				continue;
			}
		}
	
		in.close();
	}
}
