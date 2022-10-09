import java.util.Scanner;
import java.util.Random;

public class Problem2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("High Low Game");
		
		int attempts = 0;
		int random = (int) (Math.random() * 25);
		System.out.println(random);
		int num;
		
		do {
			attempts++;
			
			System.out.print("Enter number [1-25]: ");
			num = input.nextInt();
			
			if(num > 25 || num < 1) {
				System.out.println("Out of Range!");
			}
			else if(num == random) {
				System.out.println("You got it right!");
				System.out.println(attempts + " attempt(s) made...");
				break;
			}else if(num > random) {
				System.out.println("Number is too high");
			}else {
				System.out.println("Number is too low");
			}	
			
			System.out.println();
		}while(true);
	}
	
}


