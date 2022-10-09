import java.util.Scanner;
public class LeftPyramid {

	public static void main(String[] Jeyym) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of stars => ");
		int star = input.nextInt();
		
		for(int x = 0; x <= star; x++) {
			
			for(int z = star; z > x; z--) {
				System.out.print(" ");
			}
			
			for(int y = 0; y < x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
