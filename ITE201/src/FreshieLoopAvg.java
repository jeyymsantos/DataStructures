import java.util.Scanner;

public class FreshieLoopAvg {

	public static void main(String argsp[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of grades => ");
		int numOfGrades = input.nextInt();
		int grades = 0;
		int tempNumOfGrades = numOfGrades;
		
		while(tempNumOfGrades > 0) {
			System.out.print("Enter Grade => ");
			grades += input.nextInt();
			tempNumOfGrades--;
		}
		
		System.out.println("The average is " + (grades /= numOfGrades));
	}
	
}
