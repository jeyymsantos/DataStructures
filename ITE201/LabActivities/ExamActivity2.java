import java.util.Scanner;
public class ExamActivity2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("----------------------------------------");
		System.out.println("            Array Evaluation            ");
		System.out.println("----------------------------------------");
		System.out.print("Array Length: ");
		int len = input.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Value for Index[" + i + "]: ");
			arr[i] = input.nextInt();
		}
		System.out.print("Arrangement of Value(s): ");
		int asc = 0, desc = 0, equals = 0;
		for(int x = 0; x < arr.length-1; x++) {
			if(arr[x] < arr[x+1])
				asc++;
			else if(arr[x] > arr[x+1])
				desc++;
			else if(arr[x] == arr[x+1])
				equals++;
		}
		if(asc == arr.length - 1) {
			System.out.println("Ascending");
			System.out.println("Searching Method: Binary");
		}else if(desc == arr.length - 1) {
			System.out.println("Descending");
			System.out.println("Searching Method: Binary");
		}else if(equals == arr.length - 1) {
			System.out.println("Same Values");
			System.out.println("Searching Method: Linear");
		}else {
			System.out.println("Random");
			System.out.println("Searching Method: Linear");
		}
		System.out.println("----------------------------------------");
		System.out.println("End of Program");
	}
}
