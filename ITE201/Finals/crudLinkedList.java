import java.util.Scanner;
import java.util.LinkedList;

public class crudLinkedList {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
	
		System.out.println("[1] Add Element");
		System.out.println("[2] Replace Element");
		System.out.println("[3] Remove Element");
		System.out.println("[4] Display Elements");

		while (true) {
			System.out.print("Select option => ");
			int choice = input.nextInt();

			if (choice == 1) {
				System.out.print("Enter Element: ");
				list.add(input.nextInt());
				System.out.println("Added Successfully!");
				
			} else if (choice == 2) {
				System.out.println(list);
				System.out.print("Select index to replace => ");
				int indx = input.nextInt();
				
				if(indx > list.size()-1 || indx < 0) {
					System.out.println("Index out of bounds!");
				}
				else {
					System.out.print("Enter new element => ");
					list.set(indx, input.nextInt());
					System.out.println("Replaced successfully!");
				}
			} else if (choice == 3) {
				System.out.println(list);
				System.out.print("Select index to remove => ");
				int indx = input.nextInt();
				
				if(indx > list.size()-1 || indx < 0) {
					System.out.println("Index out of bounds!");
				}
				else {
					list.remove(indx);
					System.out.println("Removed successfully!");
				}
			} else if (choice == 4) {
				System.out.println(list);
			} else {
				System.out.println("Invalid Input!");
			}
			System.out.println();
		}
	}
}






























