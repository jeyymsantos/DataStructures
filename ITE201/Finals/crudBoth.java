import java.util.Scanner;
import java.util.LinkedList;

public class crudBoth {

	static class Array {
		int[] list = new int[0];

		void add(int value) {
			int size = list.length;
			int[] newList = new int[size + 1];
			for (int x = 0; x < size; x++) {
				newList[x] = list[x];
			}
			newList[size] = value;
			list = newList;
		}

		void set(int indx, int value) {
			list[indx] = value;
		}

		int size() {
			return list.length;
		}

		void remove(int indx) {
			int size = list.length;
			int[] newList = new int[size - 1];
			for (int x = 0; x < size - 1; x++) {
				if (x >= indx) {
					newList[x] = list[x + 1];
				} else {
					newList[x] = list[x];
				}
			}
			list = newList;
		}
		
		void add(int indx, int value) {
			int size = list.length;
			int[] newList = new int[size + 1];
			for (int x = 0; x < size; x++) {
				if (x >= indx) {
					newList[x+1] = list[x];
				} else {
					newList[x] = list[x];
				}
			}
			newList[indx] = value;
			list = newList;
		}
		
		void display() {
			System.out.print("[");
			for (int x = 0; x < list.length; x++) {
				if (x + 1 == list.length) {
					System.out.print(list[x]);
				} else {
					System.out.print(list[x] + ", ");
				}
			}
			System.out.println("]");
		}
	
		void addFirst(int value) {
			int[] newList = new int[list.length+1];
			for(int x = 0; x < list.length; x++) {
				newList[x+1] = list[x];
			}
			newList[0] = value;
			list = newList;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String dashes = "--------------------------";
		LinkedList<Integer> LinkedList = new LinkedList<>();
		Array myArray = new Array();

		while (true) {
			System.out.println(dashes);
			System.out.println("[1] Array");
			System.out.println("[2] LinkedList");
			System.out.println("[0] Exit");
			System.out.println(dashes);
			System.out.print("Enter Choice => ");
			int type = input.nextInt();
			System.out.println();

			if (type == 1) {
				System.out.println("CRUD using Array");
				System.out.println(dashes);
				System.out.println("[1] Add First");
				System.out.println("[2] Add Last");
				System.out.println("[3] Edit");
				System.out.println("[4] Insert");
				System.out.println("[5] Delete by Index");
				System.out.println("[6] Display");
				System.out.println("[0] Back to Main Menu");
				System.out.println(dashes);

				while (true) {
					System.out.print("Enter choice => ");
					int choice = input.nextInt();

					if (choice == 1) {
						System.out.print("Enter element => ");
						myArray.addFirst(input.nextInt());
						System.out.println("Element added successfully!");
					}else if (choice == 2) {
						System.out.print("Enter element => ");
						myArray.add(input.nextInt());
						System.out.println("Element added successfully!");
					} else if (choice == 3) {
						if (myArray.size() == 0) {
							System.out.println("No elements found!");
						} else {
							while (true) {
								System.out.print("Enter index => ");
								int indx = input.nextInt();

								if (indx < 0 || indx >= myArray.size()) {
									System.out.println("Out of bounds!");
								} else {
									System.out.print("Enter new value => ");
									myArray.set(indx, input.nextInt());
									System.out.println("Element edited successfully!");
									break;
								}
								System.out.println();
							}
						}
					} else if (choice == 4) {
						if (myArray.size() == 0) {
							System.out.println("No elements found!");
						} else {
							while (true) {
								System.out.print("Enter index => ");
								int indx = input.nextInt();

								if (indx < 0 || indx >= myArray.size()) {
									System.out.println("Out of bounds!");
								} else {
									System.out.print("Enter value => ");
									myArray.add(indx, input.nextInt());
									System.out.println("Element inserted successfully!");
									break;
								}
								System.out.println();
							}
						}
					} else if (choice == 5) {
						if (myArray.size() == 0) {
							System.out.println("No elements found!");
						} else {
							while (true) {
								System.out.print("Enter index => ");
								int indx = input.nextInt();

								if (indx < 0 || indx >= myArray.size()) {
									System.out.println("Out of bounds!");
								} else {
									myArray.remove(indx);
									System.out.println("Element removed successfully!");
									break;
								}
								System.out.println();
							}
						}
					} else if (choice == 6) {
						myArray.display();
					} else if (choice == 0) {
						break;
					} else {
						System.out.println("Invalid Input!");
					}
					System.out.println();
				}
			} else if (type == 2) {
				System.out.println("CRUD using LinkedList");
				System.out.println(dashes);
				System.out.println("[1] Add");
				System.out.println("[2] Edit");
				System.out.println("[3] Insert");
				System.out.println("[4] Delete");
				System.out.println("[5] Display");
				System.out.println("[0] Back to Main Menu");
				System.out.println(dashes);

				while (true) {
					System.out.print("Enter Choice => ");
					int choice = input.nextInt();

					if (choice == 1) {
						System.out.print("Enter element => ");
						LinkedList.add(input.nextInt());
						System.out.println("Element added successfully!");
					} else if (choice == 2) {
						if (LinkedList.size() == 0) {
							System.out.println("No elements found!");
						} else {
							while (true) {
								System.out.print("Enter index => ");
								int indx = input.nextInt();

								if (indx < 0 || indx >= LinkedList.size()) {
									System.out.println("Out of bounds!");
								} else {
									System.out.print("Enter new value => ");
									LinkedList.set(indx, input.nextInt());
									System.out.println("Element edited successfully!");
									break;
								}
								System.out.println();
							}
						}
					} else if (choice == 3) {
						if (LinkedList.size() == 0) {
							System.out.println("No elements found!");
						} else {
							while (true) {
								System.out.print("Enter index => ");
								int indx = input.nextInt();

								if (indx < 0 || indx >= LinkedList.size()) {
									System.out.println("Out of bounds!");
								} else {
									System.out.print("Enter value => ");
									LinkedList.add(indx, input.nextInt());
									System.out.println("Element inserted successfully!");
									break;
								}
								System.out.println();
							}
						}
					} else if (choice == 4) {
						if (LinkedList.size() == 0) {
							System.out.println("No elements found!");
						} else {
							while (true) {
								System.out.print("Enter index => ");
								int indx = input.nextInt();

								if (indx < 0 || indx >= LinkedList.size()) {
									System.out.println("Out of bounds!");
								} else {
									LinkedList.remove(indx);
									System.out.println("Element removed successfully!");
									break;
								}
								System.out.println();
							}
						}
					} else if (choice == 5) {
						System.out.println(LinkedList);
					} else if (choice == 0) {
						break;
					} else {
						System.out.println("Invalid input!");
					}

					System.out.println();
				}
			} else if (type == 0) {
				break;
			} else {
				System.out.println("Invalid input!");
			}

			System.out.println("");
		}

		System.out.println("Program has ended");
	}

}
