
public class ProbOne {
	// Bubble Sort
	public static void main(String[] args) {

		int[] arr = {5,   3,   2,   7};
		
		int size = arr.length - 1;
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size - i; j++)
			{
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int x: arr) {
			System.out.print(x + " ");
		}
	}
}
