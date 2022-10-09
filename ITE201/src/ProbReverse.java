
public class ProbReverse {

	public static void main(String args[]) {
		int[] arr = {5, 3, 2, 7};
		
		// 4
		// a = length
		// arrMin = gets the index of the smallest
		int a = arr.length;
		
		for(int j = 0; j < a; j++) {
			int arrMin = j;
			for (int i = j+1; i < a; i++) {
				if(arr[i] < arr[arrMin])
					arrMin = i;
			}
			// 1 != 0
			if( arrMin != j) {
				int temp = arr[j];
				arr[j] = arr[arrMin];
				arr[arrMin] = temp;
			}
		}
		
		for(int j = 0; j < a; j++) {
			System.out.print(arr[j] + " ");
		}
		
		System.out.println();
		
		for(int x = a-1; x >= 0; x--) {
			System.out.print(arr[x] + " ");
		}
		
		
	}

}
