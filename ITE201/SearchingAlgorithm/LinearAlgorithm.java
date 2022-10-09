import java.util.Scanner;

public class LinearAlgorithm {
	
	public static int search(int array[], int x) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == x)
				return i;
		}
		return -1;
	}

	public static void main(String args[]) {
		int array[] = {2, 4, 0, 1, 9};
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number to search => ");
		int x = input.nextInt();
		
		// x = 25;
		int result = search(array, x);
		// result = -1;
		if (result == -1)
			System.out.print("Element not found");
		else
			System.out.print("Element found at index: " + result);
	}

}
