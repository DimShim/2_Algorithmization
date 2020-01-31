package by.ds.tasks.main;
import java.util.Scanner;

/*
 * 10. Дан целочисленный массив с количеством элементов  n.
 * 	   Сжать массив, выбросив из него каждый второй элемент
 * 	   (освободившиеся элементы заполнить нулями). Примечание.
 * 	   Дополнительный массив не использовать.
 */

public class Task_10_one_dimen_arrays {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Введите колическо элементов N: ");
		int size = in.nextInt();
		
		int[] array = new int[size];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10);
			System.out.print(" " + array[i] + " ");
		}
		System.out.println(" ");
		
		for(int j = 1; j < array.length; j+=2) {
			array[j] = 0;
		}
		
		for(int z = 0; z < array.length; z++) {
			System.out.print(" " + array[z] + " ");
		}
	}

}
