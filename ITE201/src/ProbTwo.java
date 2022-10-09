public class ProbTwo {

	// Selection 
	public static void main(String args[]) {
		
		int[] arr = {5,  3,  1,  7, 6, 7};
		int a = arr.length;	
 		for(int j = 0; j < a; j++) {
			int arrMin = j;
			for (int i = j+1; i < a; i++) {
				if(arr[i] < arr[arrMin])
					arrMin = i;
			}
			int temp = arr[j];
			arr[j] = arr[arrMin];
			arr[arrMin] = temp;
		}
		
		for(int j = 0; j < a; j++) {
			System.out.print(arr[j] + " ");
		}
	}
}
