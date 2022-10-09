
import java.util.Scanner;

public class DynamicSearch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of elements => ");
		int n = input.nextInt();
		
		int array[] = new int[n];
		for(int x = 0; x < n; x++) {
			System.out.printf("Enter value of element %d => ", x);
			array[x] = input.nextInt();
		}
		
		System.out.println("Natural Order");
		for(int x: array) {
			System.out.print(x + " ");
		}
		
		// 1, 2, 3, 4, 5
		
		System.out.print("\nEnter value to search => ");
		int value = input.nextInt();
				
//		int LinearResult = LinearSearch(array, value);
//		if(LinearResult == -1) 
//			System.out.println("Element not found!");
//		else
//			System.out.printf("%d is found in index %d", value, LinearResult);
		
		int IterativeResult = Iterative(array, value, 0, n-1);
		if(IterativeResult == -1) 
			System.out.println("Element not found!");
		else
			System.out.printf("%d is found in index %d", value, IterativeResult);
		
	}
	
	static int LinearSearch(int[] array, int value) {
		for(int x = 0; x < array.length; x++) {
			if(value == array[x]) {
				return x;
			}
		}
		return -1;
	}
		// 1, 2, 3, 4, 5
							//				4	//    3        4
	static int Iterative(int[] array, int value, int low, int high) {
		
		while(low <= high) {
			
			// mid = 2;
			int mid = (high + low) / 2;
			
			// 3 == 4
			if(array[mid] == value) {
				return mid;
			}
			
			// 4 < 3
			if(value < array[mid]) {
				high = mid - 1;
			}
			
			// low = 3;
			else {
				low = mid + 1;
			}	
		}
		
		return -1;
		
	}
	
}
