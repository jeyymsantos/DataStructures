// Linked list implementation in Java
import java.util.LinkedList;
class LinkedListSingly {
  // Creating a node
  Node head;

  static class Node {
    int value;
    Node next;

    Node(int d) {
      value = d;
      next = null;
    }
  }

  public static void main(String[] args) {
    LinkedListSingly linkedList = new LinkedListSingly();

    // Assign value values
    linkedList.head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);

    // Connect nodes
    linkedList.head.next = second;
    second.next = third;

    // Printing
    while (linkedList.head != null) {
      System.out.print(linkedList.head.value + " ");
      linkedList.head = linkedList.head.next;
    }
  }
}