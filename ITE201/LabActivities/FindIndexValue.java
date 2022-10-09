import java.util.Scanner;

public class FindIndexValue {
	static Scanner scanr = new Scanner(System.in);

	public static void main(String[] args) {

		int arr[] = { 100, 150, 500, 560, 45, 100, 90, 45, 100, 78, 500 };

		int ar;
		System.out.println("========================================");
		System.out.println("<<       Array [Index] or Value       >>");
		System.out.println("========================================");

		for (ar = 0; ar < arr.length; ar++)
			System.out.print("[" + ar + "]" + arr[ar] + " ");

		System.out.println("\n");

		while (true) {
			System.out.print("Search by (1) Index or (2) Value: ");
			int choice = scanr.nextInt();
			System.out.println("========================================");

			if (choice == 1)
				SearchIndex(arr);
			else if (choice == 2)
				SearchValue(arr);
			else {
				System.out.println("Invalid Selection - End of Program!");
				break;
			}
		}

	}

	public static void SearchValue(int[] array) {

		System.out.print("Enter Value: ");
		int value = scanr.nextInt();
		int ctr = 0;

		for (int x : array) {
			if (x == value)
				ctr++;
		}

		int store[] = new int[ctr];
		int y = 0;
		for (int x = 0; x < array.length; x++) {
			if (array[x] == value) {
				store[y] = x;
				y++;
			}
		}

		if (store.length == 0)
			System.out.println("Index: No Match Found! \n");
		else {
			System.out.print("Index: ");
			for (int x : store)
				System.out.print(x + " ");

			System.out.println("\n" + ctr + " Match/es Found \n");
		}

	}

	public static void SearchIndex(int[] array) {
		while (true) {
			System.out.print("Enter index [0-" + (array.length - 1) + "]: ");
			int index = scanr.nextInt();

			if (index < 0 || index >= array.length)
				System.out.println("Value out of index range.\n");
			else {
				System.out.println("The value is " + array[index] + "\n");
				break;
			}
		}

	}

}
