package by.ds.tasks.main;

/*
 * 4. Даны действительные числа а1, а2, а3,..., аn.
 * 	  Поменять местами наибольший и наименьший элементы.
 */

public class Task_4_one_dimen_arrays {
	public static void main(String[] args) {
		
		int maximum;
		int minimum;
		
		int[] array1 = new int[6]; //создал массив
		
		array1[0] = 1;  // заполнил массив
		array1[1] = 10;
		array1[2] = -5;
		array1[3] = 21;
		array1[4] = 7;
		array1[5] = 31;
		
		for(int i = 0; i < array1.length; i++) {  // вывел в консоль, перебором
			System.out.print(" "+ array1[i] + " ");
		}
		System.out.println("");
		
		maximum = array1[0]; //инициализировал переменные, array1[0] - взял за точку опоры
		minimum = array1[0];
		
		for(int i = 0; i < array1.length; i++) { // нашел максимальный элемент
			if(array1[i] > maximum)
				maximum = array1[i];
		}
		for(int i = 0; i < array1.length; i++) { // нашел минимальный элемент
			if(array1[i] < minimum)
				minimum = array1[i];
		}
		for(int i = 0; i < array1.length; i++) { //заменил макс на мин в массиве
			if (array1[i] == maximum) {
				array1[i] = minimum;
				break;
			}
		}
		for(int i = 0; i < array1.length; i++) { // заменил мин на макс в массиве
			if(array1[i] == minimum) {
				array1[i] = maximum;
				break;
			}
		}
		for(int i = 0; i < array1.length; i++) { // вывел итоговый вариант в консоль
			System.out.print(" "+ array1[i] + " ");
		}

		System.out.println("");
		System.out.println("Maximum is: " + maximum);
		System.out.println("Minimum is: " + minimum);
}
}
