package SuperPackage.LinkedLists;



import java.util.LinkedList;

public class LinkedList1 {
    private Node head;
    private Node tail;
    private int size;
    public LinkedList1() {
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size+=1;
    }
    public Node find(int value){
        Node node = head;
        while (node!= null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void insertLast(int value){
        if(tail == null){
          insertFirst(value);
          return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail =  node;
        size++;
    }
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if( index == size - 1){
            return deleteLast();
        }
        Node prev = get(index = 1);
        int value = prev.next.value;
       prev.next =  prev.next.next;
        return value;
    }


    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node  = node.next;

        }
        return node;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}