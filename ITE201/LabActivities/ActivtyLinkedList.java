import java.util.LinkedList;
public class ActivtyLinkedList {
	public static void main(String[] args) {		
		LinkedList<String> myList = new LinkedList<>();
		myList.addLast("Sam");
		myList.addLast("Espino");
		myList.addLast("ITE201");
		myList.addFirst("ITE203");
		myList.remove(3);
		System.out.println(myList);
		myList.clear();
		System.out.println(myList);
		myList.add(0, "First");
		myList.add(1, "Second");
		myList.add(2, "Third");
		myList.add(0, "Forth");
		System.out.println(myList);
		System.out.println(myList.size());
		System.out.println(myList.contains("Third"));
		System.out.println(myList.indexOf("Third"));
	}
}