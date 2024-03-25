package SuperPackage.LinkedLists;


public class PracticeLinkedList {
  Node head;
  Node tail;
  int size;
  PracticeLinkedList(){
      this.size = 0;
  }

  public void InsertFirst(int value){
      Node node = new Node(value);
      node.next = head;
      head = node;
      if(tail == null){
          tail = head;
      }
      size++;
  }
  public void display(){
      Node temp = head;
      if(temp == null){
          return;
      }
      while (temp != null){
          System.out.print(temp.value + " -> ");
          temp = temp.next;
      }
      System.out.print("END");
  }


  public class Node{
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