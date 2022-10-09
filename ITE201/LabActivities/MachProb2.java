import java.util.Scanner;

public class MachProb2 {

	static Scanner input = new Scanner(System.in);

	static void getArray(int[] arrP) {
		for (int x = 0; x < arrP.length; x++) {
			System.out.print("Index[" + x + "]: ");
			arrP[x] = input.nextInt();
		}
	}

	static void displayArray(int[] arrP) {
		for (int x : arrP)
			System.out.println(x + " ");
	}

	public static void main(String[] args) {
		var scanr = new Scanner(System.in);
		int len;
		System.out.println("---------------------");
		System.out.println("  Element Checking  ");
		System.out.println("---------------------");
		System.out.print("Array Length: ");
		len = scanr.nextInt();
		int[] arrN = new int[len];
		getArray(arrN);
		int asc = 0, desc = 0;
		for (int x = 0; x < len - 1; x++) {
			if (arrN[x] < arrN[x + 1])
				asc++;
			else if (arrN[x] > arrN[x + 1])
				desc++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		if (asc == len - 1)
			System.out.println("Ascending");
		else if (desc == len - 1)
			System.out.println("Descending");
		else if (asc == 0 || desc == 0)
			System.out.println("Same Values");
		else
			System.out.println("Random");
	}
}
