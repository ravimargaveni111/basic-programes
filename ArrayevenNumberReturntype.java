
public class ArrayevenNumberReturntype {

	public static void main(String[] args) {
		int x[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 8, 9, 5, 4, 2, 54 };
		even(x);
	}

	public static int[] even(int[] x) {
		System.out.println("even numbers in array");
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				System.out.print(" " + x[i] + " ");

			}
		}
		return x;
	}

}