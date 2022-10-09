import java.util.Scanner;

public class ExamActivity1 {
	static void printElem(int[] arrP) {
		for (int x : arrP) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	static void sortBubble(int[] arrP) {
		for (int x = 0; x < arrP.length - 1; x++) {
			for (int y = 0; y < arrP.length -1; y++) {
				if (arrP[y] > arrP[y + 1]) {
					int temp = arrP[y];
					arrP[y] = arrP[y + 1];
					arrP[y + 1] = temp;
				}
				printElem(arrP);
			}
		}
	}

	public static void main(String[] args) {
		var scanr = new Scanner(System.in);
		System.out.println("----------------------------------------");
		System.out.println("  Displaying the Steps for Bubble Sort  ");
		System.out.println("----------------------------------------");
		System.out.print("Array Length: ");
		int len = scanr.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Value for Index[" + i + "]: ");
			arr[i] = scanr.nextInt();
		}
		System.out.print("Array's Elements: ");
		printElem(arr);
		System.out.println("----------------------------------------");
		sortBubble(arr);
		System.out.println("----------------------------------------");
		System.out.println("End of Program");
	}

}
