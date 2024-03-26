package SuperPackage.LinkedLists;


public class PracticeLinkedList {
  Node head; // The first node which refers to the first node that a user will create.
  Node tail; // The initial Node that points to null, it's the last node of a linked list
  int size; // For accessing the specific Node that's why we need size.
  PracticeLinkedList(){
      this.size = 0;
  }

  public void insertAtFirst(int value){
      Node node = new Node(value);
      node.next = head;// This points to null when only one node is created, but
      head = node;// Then the head pointer is updated with the recently created Node.
//      System.out.println(head.value); // Print statement for debugging.
      if(tail == null){
          tail = head;
      }
      size++;
  }
//
  public void display(){
      Node temp = head; // If I want to add a node so basically I don't want to disrupt the structure of the linked List that's why we assign the Newly Created node with the header.
      // Now temp and head are both refrening to the same Node i.e. Head. And I can now manipulate the temp reference variable and head will not be changed.
      while(temp != null){
          System.out.print(temp.value + " -> ");
          temp = temp.next;
      }
      System.out.print("END");
  }
  public void insertAtLast(int value){
      if(tail == null){
          insertAtFirst(value);
          return;
      }
      Node node = new Node(value);
      tail.next = node;
      tail = node;
      size++;
  }

  static public class Node{
      int value;
      Node next;
      Node(int value){
          this.value = value;
      }
      Node(int value, Node next){
          this.value = value;
          this.next = next;
      }
  }
}