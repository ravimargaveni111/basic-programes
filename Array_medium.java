
import java.util.Arrays;
import java.util.Collections;

//import com.sun.tools.javac.util.ArrayUtils;

public class Array_medium {

	public static void main(String[] args) {
		// sum of all the array elements
		int arraysum[] = { 2, 1, 2, 55, 4, 7, 8, 78, 7, 8, 7, 6, 9, 99 };
		int sum = 0;
		for (int i = 1; i < arraysum.length; i++) {
			sum = arraysum[i] + sum;
		}

		System.out.println("sum of all the array element  " + sum);

		// Reverse elements inside Array
		System.out.println("Revers elements inside Array");
		int[] array = { 2, 1, 2, 55, 4, 7, 6, 9, 99 };
		for (int i = array.length - 1; i >= 0; i--)
			System.out.print(" " + array[i] + " ");

		// duplicate elements in array
		System.out.println("\n" + "duplicate elements in array ");
		int[] arr = { 1, 2, 5, 5, 4, 7, 8, 21, 1 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] == arr[j]) && (i != j)) {
					System.out.print(" " + arr[j] + " ");
				}
			}

		}
		// finding prime numbers in array

		int[] ravi = { 1, 2, 3, 6, 5, 4, 7, 8, 9, 11, 16, 17, 112, 13, 26, 13 };
		System.out.println("\n" + "prime numbers in array are ");
		for (int i = 0; i < ravi.length; i++) {
			int a = 0;
			for (int j = 2; j <= ravi[i] / 2; j++) {
				if (ravi[i] % j == 0) {
					a++;
				}
			}
			if (a == 0) {
				if (ravi[i] != 1)
					System.out.print(" " + ravi[i] + " ");
			}

		}
		// copying elements from one array to another array
		int rav[] = { 1, 2, 3, 4, 56, 7, 89 };
		System.out.println("\n" + "elements in ram after copying from rav");
		int[] ram = new int[rav.length];
		ram = Arrays.copyOf(rav, ram.length);
		for (int i = 0; i < ram.length; i++)
			System.out.print(" " + ram[i] + " ");

		// Find largest and smallest number in array
		System.out.println("\n" + "largest element in array");
		int[] rams = { 1, 2, 3, 6, 5, 4, 7, 8, 9, 9, 96, 5, 5, 4, 2, 5, 5, 44, 5, 65, 5, 56 };
		int j = Arrays.stream(rams).max().getAsInt();
		System.out.println(j);
		System.out.println("smallest element in array");
		int k = Arrays.stream(rams).min().getAsInt();
		System.out.println(k);
		// or

		// printing second largest element in array
		int[] ar = { 12, 11, 1, 11, 111 };
		System.out.println("second largest element in array");
		Arrays.sort(ar);
		//Arrays.toString(ar);
		int jj = ar.length - 1;
		System.out.println(ar[jj - 1]);

		// Array in an Ascending Order
		int[] arrr = { 4, 5, 66, 3, 2, 1, 45, 8, 7, 5, 8, 7, 45, 78, 1 };
		System.out.println("array elements in ascending order");
		Arrays.sort(arrr);
		for (int i = 0; i < arrr.length; i++) {
			System.out.print(" " + arrr[i] + " ");

		}
		// array in descending order
		Integer[] arrrr = { 13, 7, 6, 45, 1, 9, 2, 100, 11, 25, 36, 54, 58, 69 };
		System.out.println("\n" + "array elements in descending order");
		Arrays.sort(arrrr, Collections.reverseOrder());
		for (int i = 0; i < arrrr.length; i++) {

			System.out.print(" " + arrrr[i] + " ");
		}

		int[] myArray = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

		System.out.println("\n" + "Original Array : " + Arrays.toString(myArray));

		int removeIndex = 5;

		for (int i = removeIndex; i < myArray.length - 2; i++) {
			myArray[i] = myArray[i + 1];
		}
		System.out.println("\n" + "After removing the second element: " + Arrays.toString(myArray));

		// sort Names in an Alphabetical Order

		String[] a = { "ravi", "kiran", "koti", "uma" };
		System.out.println("original array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i] + " ");
		}
		Arrays.sort(a);
		System.out.println("\n" + "After sort :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i] + " ");

		}

	}
}
