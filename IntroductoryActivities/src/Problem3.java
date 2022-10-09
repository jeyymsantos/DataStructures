public class Problem3 {

	public static void main(String[] args) {

		int[] array = { 10, 9, 7, 8, 9, 7, 8, 12 };
		int even = 0;
		int odd = 0;

		for (int num : array) {
			if (num % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}

		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);

		for (int num : array) {
			System.out.println(num);
		}
	}

}



