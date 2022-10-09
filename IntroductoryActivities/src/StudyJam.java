import java.util.Scanner;

public class StudyJam {

	static Scanner input = new Scanner(System.in);

	static void displayArray(int values[]) {
		for (int x : values) {
			System.out.print(x + " ");
		}
	}

	static void getArray(int values[]) {
		for (int x = 0; x < values.length; x++) {
			System.out.printf("Index[%d] => ", x);
			values[x] = input.nextInt();
		}
	}

	static void copyArray(int values[], int temp[]) {
		for(int x = 0; x < values.length; x++) {
			temp[x] = values[x];
		}
	}
	
	static void sortArray(int values[], int order) {	
		int len = values.length;
		for (int x = 0; x < len; x++) {
			int min = x;
			for (int y = x + 1; y < len; y++) {
				if (values[y] > values[min] && order == 9) {
					min = y;
				}else if(values[y] < values[min] && order == 0) {
					min = y;
				}
			}
			int temp = values[x];
			values[x] = values[min];
			values[min] = temp;
		}
		displayArray(values);
	}

	public static void main(String[] Jeyym) {

		String dashed = "---------------------------";
		System.out.println(dashed);
		System.out.println("[1] Enter Array");
		System.out.println("[2] Ascending Order");
		System.out.println("[3] Descending Order");
		System.out.println("[4] Natural Order");
		System.out.println("[5] Exit");
		System.out.println(dashed);

		int choice = 0;
		int values[] = {0};
		int temp[] = {0};

		while (true) {
			System.out.print("Enter choice => ");
			choice = input.nextInt();

			if (choice == 1) {
				System.out.print("Enter # of Elements => ");
				int len = input.nextInt();
				values = new int[len];
				temp = new int[len];
				getArray(values);
				copyArray(values, temp);
			} else if (choice == 2) {
				sortArray(values, 0);
			} else if (choice == 3) {
				sortArray(values, 9);
			} else if (choice == 4) {
				displayArray(temp);
			} else if (choice == 5) {
				break;
			} else {
				System.out.println("Invalid Selection!");
			}
			
			System.out.println();
		}
		System.out.println("The Program has ended.");
	}
}
