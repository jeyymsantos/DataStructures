import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		int[] numbers = new int[5];
		
		for(int x = 0; x < numbers.length; x++) {
			System.out.print("Index " + x + ": ");
			numbers[x] = input.nextInt();
		}
	
		int highest = numbers[0];
		int secHigh = numbers[0];		
		
		// highest
		for(int num: numbers) {	
			if(num > highest) {
				highest = num;
			}
		}
		
		// 2nd
		for(int num: numbers) {	
			if(num > secHigh && num < highest) {
				secHigh = num;
			}
		}
		
		System.out.println("The highest number is " + highest);
		System.out.println("The 2nd highest number is " + secHigh);
	}

}
