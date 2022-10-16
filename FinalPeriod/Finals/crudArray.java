import java.util.Scanner;
public class crudArray {
	static int[] addArray(int[] list, int value) {
		int[] newList = new int[list.length+1];
		for(int x = 0; x < list.length; x++) {
			newList[x] = list[x];
		}
		newList[newList.length-1] = value;
		return newList;		
	}
	
	static void display(int[] list) {
		for(int x: list) {
			System.out.print(x + " ");
		}
	}
	
	static int[] removeArray(int[] list, int indx) {
		int[] newList = new int[list.length-1];
		for(int x = 0; x < list.length-1; x++) {
			if(x >= indx) {
				newList[x] = list[x+1];
			}else {
				newList[x] = list[x];
			}
		}
		return newList;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] list = new int[0];
		System.out.println("[1] Add Element");
		System.out.println("[2] Replace Element");
		System.out.println("[3] Remove Element");
		System.out.println("[4] Display Elements");
		while (true) {
			System.out.print("Select option => ");
			int choice = input.nextInt();
			if (choice == 1) {
				System.out.print("Enter Element: ");
				list = addArray(list, input.nextInt());
				System.out.println("Added Successfully!");	
			} else if (choice == 2) {
				System.out.print("Select index to replace => ");
				int indx = input.nextInt();
				
				if(indx > list.length-1 || indx < 0) {
					System.out.println("Index out of bounds!");
				}
				else {
					System.out.print("Enter new element => ");
					list[indx] = input.nextInt();
					System.out.println("Replaced successfully!");
				}
			} else if (choice == 3) {
				System.out.print("Select index to remove => ");
				int indx = input.nextInt();
				
				if(indx > list.length-1 || indx < 0) {
					System.out.println("Index out of bounds!");
				}
				else {
					list = removeArray(list, indx);
					System.out.println("Removed successfully!");
				}
			} else if (choice == 4) {
				display(list);
			} else {
				System.out.println("Invalid Input!");
			}
			System.out.println();
		}
	}
}






























