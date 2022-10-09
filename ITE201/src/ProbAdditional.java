
import java.util.Scanner;

public class ProbAdditional {

		// static : never changed / constant
		// dynamic :
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of array => ");
		int numArr = input.nextInt();
		
		int[] values = new int[numArr];
		for(int x = 0; x < numArr; x++) {
			System.out.print("Enter array value " + x + ": ");
			values[x] = input.nextInt();
		}
		
		System.out.println("\nNatural Order: ");
		for(int j = 0; j < numArr; j++) {
			System.out.print(values[j] + " ");
		}
		
		for(int j = 0; j < numArr; j++) {
			int arrMin = j;
			for (int i = j+1; i < numArr; i++) {
				if(values[i] < values[arrMin])
					arrMin = i;
			}
			if( arrMin != j) {
				int temp = values[j];
				values[j] = values[arrMin];
				values[arrMin] = temp;
			}
		}
		
		System.out.println("\nReverse Order: ");
		for(int x = numArr-1; x >= 0; x--) {
			System.out.print(values[x] + " ");
		}
	}

}
