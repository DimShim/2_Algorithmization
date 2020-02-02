package by.ds.tasks.main;

/*
 * 5. Даны целые числа а1, а2,..., аn. Вывести на 
 * 	  печать только те числа, для которых ai > i.
 */
public class Task_05_one_dimen_arrays {
	public static void main(String[] args) {
		
		int [] array1 = {5,2,6,1,4,3,0,-9,10};
		
		for(int i = 0; i < array1.length; i++) {
			System.out.print(" " + i + " ");
		}
		System.out.println("");
		
		for(int i = 0; i < array1.length; i++) {
			System.out.print(" "+ array1[i] + " ");
		}
		System.out.println("");
		
		for (int i = 0; i < array1.length; i++) {
			if(array1[i] > i) {
				System.out.print(" " + array1[i] + " ");
			}else {
				System.out.print(" - ");
			}
			
		}
	}

}
