import java.util.*;
public class Problem1 {
	public static void main(String[] Jeyym) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[3];
		String[] names = {"1st", "2nd", "3rd"};
		
		for(int x = 0; x < num.length; x++) {
			System.out.print("Enter " +  names[x] +" Number => ");
			num[x] = input.nextInt();
		}
	
		int highest = num[0], lowest = num[0];
		int highIndex = 0, lowIndex = 0;
		for(int x = 0; x < num.length; x++) {
			if(num[x] > highest) {
				highest = num[x];
				highIndex = x;
			}
			if(num[x] < lowest) {
				lowest = num[x];
				lowIndex = x;
			}
		}
		System.out.println(names[highIndex] + " is the highest: " + highest);
		System.out.println(names[lowIndex] + " is the lowest: " + lowest);
	}
}



