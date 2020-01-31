package by.ds.tasks.main;
import java.util.Arrays;

public class Task_9_one_dimen_arrays {
 
    public static final int ARRAY_MIN_LENGTH = 5;
    public static final int ARRAY_MAX_LENGTH = 9;
    public static final int ARRAY_ELEMENT_MIN_VALUE = 0;
    public static final int ARRAY_ELEMENT_MAX_VALUE = 9;
    public static final int TEST_COUNT = 5;
    public static final int OVER_9000 = Integer.MAX_VALUE;
 
    public static void main(String[] args) {
        test(TEST_COUNT);
    }
 
    public static int solve(int[] arr) {
        int result = OVER_9000;
        int count = 0;
 
        for (int i = 0; i < arr.length; i++) {
            int curCount = 1;
 
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    curCount++;
                }
            }
 
            if (curCount > count) {
                count = curCount;
                result = arr[i];
            } else if (curCount == count) {
                result = Math.min(result, arr[i]);
            }
        }
 
        return result;
    }
 
    public static int[] generateInputData(int n) {
        int[] res = new int[n];
        int diff = ARRAY_ELEMENT_MAX_VALUE - ARRAY_ELEMENT_MIN_VALUE + 1;
        for (int i = 0; i < n; i++) {
            res[i] = ARRAY_ELEMENT_MIN_VALUE + (int) (Math.random() * diff);
        }
        return res;
    }
 
    public static void test(int testCount) {
        for (int i = 1; i <= testCount; i++) {
            System.out.printf("Test #%03d\n", i);
 
            int diff = ARRAY_MAX_LENGTH - ARRAY_MIN_LENGTH + 1;
            int n = ARRAY_MIN_LENGTH + (int) (Math.random() * diff);
            int[] arr = generateInputData(n);
            int res = solve(arr);
 
            System.out.println(Arrays.toString(arr));
            System.out.println(res);
            System.out.println();
        }
    }
 
}


//package by.ds.tasks.main;
//import java.util.Scanner;

/*
 * 9. В массиве целых чисел с количесвом элементов n
 *    найти наиболее часто встречающееся число.
 *    Если таких чисел несколько, то определить
 *    наименьшее из нах.
 */
/*
public class Task_9_one_dimen_arrays {
	public static void main(String[] args) {
		
		//Scanner in = new Scanner(System.in);
		//System.out.print("Enter size array, n = ");
		//int size = in.nextInt();
		
		int[] array = {-9,1,2,3,0,2,3,1,2,-9,-9};
		//int[] array = new int[size];
		for(int i = 0; i < array.length; i++) {
			//array[i] = (int) (Math.random()* 200)-100;
			System.out.print(" " + array[i] + " ");
		}
		System.out.println("");
		
		int a = 1;
		int count = 1;
		int b = array[0];
		
			for(int j = 0; j < array.length; j++) {
				for(int z = 0; z < array.length; z++) { 
					if(j == z) continue;
					if(array[j] == array[z]) {
						count++;
					}
				}
				if(count > a) {
					b = array[j];
					a = count;
				}else if (count == a) {
					if(array[j] < b) {
						b = array[j];
					}
				}
				count = 1;
			}
			
			System.out.printf("%nНаиболее часто встречающееся наименьшее число: " +
					" %d.%nОно встречается %d раз(а)", b, a);
	}
}
*/