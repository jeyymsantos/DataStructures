import java.util.Scanner;

public class ProbMidterms {

	static Scanner input = new Scanner(System.in);
	static String line = "----------------------------------";
	
	static void displayArray(int[] arr) {
		for (int x : arr)
			System.out.print(x + " ");
		System.out.println();
	}

	static void getArray(int[] arr) {
		for (int x = 0; x < arr.length; x++) {
			System.out.print("Index[" + x + "] => ");
			arr[x] = input.nextInt();
		}

		System.out.println("Array has been saved!");
	}

	static void sortArray(int[] arr, char order, int index) {
		int lastEl = arr.length - 1;
		for (int x = 0; x < lastEl; x++) {
			for (int y = 0; y < lastEl - x; y++) {
				if (arr[y + 1] < arr[y] && order == 'a') {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				} else if (arr[y + 1] > arr[y] && order == 'd') {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}
		}
		
		
		if (index == -1) {
			displayArray(arr);
		} else {
			System.out.println(arr[index]);
		}
	}

	static void determineArray(int array[]) {
		int asc = 0, desc = 0, equals = 0;
		for (int x = 0; x < array.length - 1; x++) {
			if (array[x] > array[x + 1])
				desc++;
			else if (array[x] < array[x + 1])
				asc++;
			else if (array[x] == array[x + 1])
				equals++;
		}

		if (asc == array.length - 1)
			System.out.println("The array is in ascending order.");
		else if (desc == array.length - 1)
			System.out.println("The array is in descending order.");
		else if (equals == array.length - 1)
			System.out.println("The array is equals to every element.");
		else
			System.out.println("The array is in random order.");

	}

	static void evenOdd(int array[], int choice) {
		int num = 0;
		for (int x : array) {
			if (x % 2 == 0 && choice == 9) {
				num++;
				System.out.print(x + " ");
			} else if (x % 2 == 0 && choice == 10) {
				num++;
			} else if (x % 2 == 1 && choice == 11) {
				num++;
				System.out.print(x + " ");
			} else if (x % 2 == 1 && choice == 12) {
				num++;
			}
		}
		if (choice == 10 || choice == 12)
			System.out.print(num);
		System.out.println();
	}

	static void countSwaps(int[] array, char order) {
		int swaps = 0;
		int lastEl = array.length - 1;
		for (int x = 0; x < lastEl; x++) {
			for (int y = 0; y < lastEl - x; y++) {
				if (array[y + 1] < array[y] && order == 'a') {
					swaps++;
				} else if (array[y + 1] > array[y] && order == 'd') {
					swaps++;
				}
			}
		}
		System.out.println(swaps);
	}

	static void SearchIndex(int array[]) {
		while (true) {
			System.out.print("\nEnter index => ");
			int index = input.nextInt();

			if (index >= array.length || index < 0) {
				System.out.println("Index out of range!");
			} else {
				System.out.println("Index[" + index + "] is " + array[index]);
				break;
			}
		}
	}
	
	static void SearchValue(int array[]) {
		System.out.print("\nEnter value => ");
		int value = input.nextInt();
		int matches = 0;
		
		for(int x = 0; x < array.length; x++) {
			if(array[x] == value) {
				System.out.print("[" + x + "] ");
				matches++;
			}
		}
		if(matches == 0) {
			System.out.println("No Matches Found!");
		}else {
			System.out.println("\nMatches: " + matches);
		}
	}

	static void displayOptions() {
		System.out.println(line);
		System.out.println("[1] Enter Array");
		System.out.println("[2] Ascending Order");
		System.out.println("[3] Descending Order");
		System.out.println("[4] Highest Value");
		System.out.println("[5] 2nd Highest Value");
		System.out.println("[6] Lowest Value");
		System.out.println("[7] 2nd Lowest Value");
		System.out.println("[8] Determine Array Type");
		System.out.println("[9] Display All Even Numbers");
		System.out.println("[10] Count Even Numbers");
		System.out.println("[11] Display All Odd Numbers");
		System.out.println("[12] Count Odd Numbers");
		System.out.println("[13] Count Number of Swaps Made");
		System.out.println("[14] Search by Index");
		System.out.println("[15] Search by Value (Recursive Method)");
		System.out.println("[16] Display Natural Order");
		System.out.println("[17] Exit");
	}

	public static void main(String[] args) {

		int array[] = { 0 };
		displayOptions();

		while (true) {
			System.out.println(line);
			System.out.print("Enter Choice = ");
			int choice = input.nextInt();

			if (choice < 1 || choice > 17)
				System.out.println("Choice out of range!");
			else if (choice == 1) { // Enter Array
				System.out.print("\nEnter Array Size = ");
				int size = input.nextInt();
				array = new int[size];
				getArray(array);
			} else if (choice == 2) {// Ascending Order
				System.out.println("Ascending Order: ");
				sortArray(array, 'a', -1);
			} else if (choice == 3) {// Descending Order
				System.out.println("Descending Order: ");
				sortArray(array, 'd', -1);
			} else if (choice == 4) {// Highest Value
				System.out.print("Highest Value: ");
				sortArray(array, 'a', array.length - 1);
			} else if (choice == 5) {// 2nd Highest Value
				System.out.print("2nd Highest Value: ");
				sortArray(array, 'a', array.length - 2);
			} else if (choice == 6) {// Lowest Value
				System.out.print("Lowest Value: ");
				sortArray(array, 'a', 0);
			} else if (choice == 7) {// 2nd Lowest Value
				System.out.print("2nd Lowest Value: ");
				sortArray(array, 'a', 1);
			} else if (choice == 8) {// Determine Array Type
				determineArray(array);
			} else if (choice == 9) {// Display All Even Numbers
				System.out.println("Even Numbers:");
				evenOdd(array, choice);
			} else if (choice == 10) {// Count Even Numbers
				System.out.print("Total Even Numbers: ");
				evenOdd(array, choice);
			} else if (choice == 11) {// Display All Odd Numbers
				System.out.println("Odd Numbers:");
				evenOdd(array, choice);
			} else if (choice == 12) {// Count Odd Numbers
				System.out.print("Total Odd Numbers: ");
				evenOdd(array, choice);
			} else if (choice == 13) {// Count Swaps Made
				System.out.print("Total Ascending Swaps Made: ");
				countSwaps(array, 'd');
				System.out.print("Total Descending Swaps Made: ");
				countSwaps(array, 'a');
			} else if (choice == 14) { // Search by Index
				SearchIndex(array);
			} else if (choice == 15) { // Search by Index
				SearchValue(array);
			}
			else if (choice == 16) // Natural Order
				displayArray(array);
			else if (choice == 17) // Exit
				break;

			System.out.println();
		}
		System.out.println("Program has ended. Thank you! :>");

	}

}
