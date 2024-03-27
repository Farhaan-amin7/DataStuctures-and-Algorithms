package SuperPackage.LinkedLists;


public class PracticeLinkedList {
    Node head; // The first node which refers to the first node that a user will create.
    Node tail; // The initial Node that points to null, it's the last node of a linked list
    int size; // For accessing the specific Node that's why we need size.

    PracticeLinkedList() {
        this.size = 0;
    }

    public void insertAt(int value, int index) {
        if(index == 0){
            insertAtFirst(value);
            return;
        }
        if(index == size){
            insertAtLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);// temp.next- which is pointing to the node that is before where we want to insert the new node
// So the we are pointing to the next node which temp was recently pointing to'
// After that we udpate the old node where temp was rested, now
// the old node refers to the newly created node creating a sucessfull linkage.
        temp.next = node;
        size++;
    }

    public void insertAtFirst(int value) {
            Node node = new Node(value);
            node.next = head;// This points to null when only one node is created, but
            head = node;// Then the head pointer is updated with the recently created Node.
//      System.out.println(head.value); // Print statement for debugging.
            if (tail == null) {
                tail = head;
            }
        size++;
    }
    public int deleteFirst(){
        int value = head.value;
        if(head == null){
            tail = null;
        }
        head = head.next;
        size--;
        return value;
    }
    public int delete(int index) {
        if(index == 1){
            return deleteFirst();
        }
        if(index == size - 1)
            return deleteLast();

        Node prev = get(index - 1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        return value;

    }
    public int deleteLast2(){
        if(size <= 1){
            return deleteFirst();
        }
        Node temp = head;
        while(temp.next.next != null) {
             temp = temp.next;
        }
        int val = temp.next.value;
        tail = temp;
        size--;

        tail.next = null;

        return val;
    }
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
       Node secondLast = get(size - 2);
        int value = tail.value;
       tail = secondLast;
       tail.next = null;
       size--;
        return value;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return null;
    }
    public Node find(int value){
        Node temp = head;
        while(temp != null){
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }


    public void display() {
        Node temp = head; // If I want to add a node so basically I don't want to disrupt the structure of the linked List that's why we assign the Newly Created node with the header.
        // Now temp and head are both referring to the same Node i.e. Head. And I can now manipulate the temp reference variable and head will not be changed.
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void insertAtLast(int value) {
        if (tail == null) {
            insertAtFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    static public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}