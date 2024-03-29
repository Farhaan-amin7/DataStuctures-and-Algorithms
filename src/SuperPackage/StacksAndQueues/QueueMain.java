package SuperPackage.StacksAndQueues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(2354);
        queue.insert(1);
        queue.insert(2);
        queue.insert(354);
        queue.insert(24);
        queue.display();


        System.out.println(queue.remove());
        queue.display();
    }
}