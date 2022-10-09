import java.util.Scanner;

public class RecursiveSearch {
	                                   
	static int binarySearch(int array[], int x, int low, int high) {
		if (low <= high) {
			int mid = low + (high - low) / 2;
			if (array[mid] == x)
				return mid;
			if (array[mid] < x)
				return binarySearch(array, x, mid + 1, high);
			return binarySearch(array, x, low, mid - 1);
		}
		return -1;
	}

	public static void main(String args[]) {
		int array[] = { 3, 4, 5, 6, 7, 8, 9 };
		int n = array.length;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number to search => ");
		int x = input.nextInt();
		
		int result = binarySearch(array, x, 0, n - 1);
		if (result == -1)
			System.out.println("Not found");
		else
			System.out.println("Element found at index " + result);
	}
}
