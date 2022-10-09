
public class ProbThree {

	// 
	public static void main(String[] args) {
		
		int[] arr = {1,   2,   3,   4,  5, 6, 7}; // 5
		// 7 / 2 = 3
		
		int a = arr.length;
		for(int i = 1; i < a; i++) {
			int j = i;
			while(j > 0 && arr[j-1] > arr[j]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
		}
		
		for (int j = 0; j < a; j++) {
			System.out.print(arr[j] + " ");
		}
	}
}
