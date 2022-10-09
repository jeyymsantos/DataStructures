import java.util.Scanner;

public class MultiAct {
	static Scanner input = new Scanner(System.in);

	static void displayArray(int[] arrP) {
		for (int arr : arrP)
			System.out.print(arr + " ");
	}

	static void getArray(int[] arrP) {
		for (int x = 0; x < arrP.length; x++) {
			System.out.printf("Index[%d]: ", x);
			arrP[x] = input.nextInt();
		}
	}

	public void arrayOrder(int[] arrP, int ord) {
		int len = arrP.length;
		for (int x = 0; x < len; x++) {
			int min = x;
			for (int y = x + 1; y < len; y++) {
				if (arrP[y] > arrP[x] && ord == 0)
					min = y;
				else if (arrP[y] < arrP[x] && ord == 9)
					min = y;
			}
			int temp = arrP[x];
			arrP[x] = arrP[min];
			arrP[min] = temp;
		}

		displayArray(arrP);
	}

	public void getIndex(int[] arrP) {
		while (true) {
			System.out.printf("Enter Index[0-%d]: ", arrP.length - 1);
			int index = input.nextInt();

			if (index < 0 || index > arrP.length - 1) {
				System.out.println("The value is out of index range.");
			} else {
				System.out.println("The value is " + arrP[index]);
				break;
			}
		}
	}

	public static void main(String[] args) {

		var scanr = new Scanner(System.in);
		var maObj = new MultiAct();
		int len;

		System.out.println("--------------------------------------------------------");
		System.out.println(" Review on Class Mathod with Sort and Search Algorithms ");
		System.out.println("--------------------------------------------------------");

		System.out.print("Array Length: ");
		len = scanr.nextInt();
		int[] arrN = new int[len];
		int[] temp = new int[len];
				
		// Method
		getArray(arrN);
		for(int x = 0; x < len; x++) 
			temp[x] = arrN[x];

		System.out.println("--------------------------------------------------------");
		System.out.println("[1] Display Array Elements     [4] Display Index Value");
		System.out.println("[2] Descending Order           [5] Exit");
		System.out.println("[3] Ascending Order			   [6] Retain Array");

		while (true) {
			System.out.print("Select Transaction: ");
			int tran = scanr.nextInt();
			if (tran == 1) {
				System.out.println("Display Array Elements");
				displayArray(arrN);
			} else if (tran == 2) {
				System.out.println("Descending Order");
				maObj.arrayOrder(arrN, 0);
			} else if (tran == 3) {
				System.out.println("Ascending Order");
				maObj.arrayOrder(arrN, 9);
			} else if (tran == 4) {
				System.out.println("Displaying Index Value");
				maObj.getIndex(arrN);
			} else if (tran == 5) {
				break;
			} else if (tran == 6) {
				displayArray(temp);
			}else
				System.out.println("Invalid selection!");
			System.out.println("\n");
		}
		System.out.println("End of Program");
	}
}
