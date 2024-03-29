package SuperPackage.StacksAndQueues;

public class CircularQueue {
    protected int [] data;
    private static final int DEFAULT_SIZE = 10;
    int size = 0;
    int font = 0;
    int end = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
    boolean isFull(){
        return size == data.length; // ptr is at last index.
    }
    private boolean isEmpty(){
        return  size == 0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }
    public int remove() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[font];
        font = font % data.length;
        font++;
        size--;
        return removed;
    }
    public int front() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[font];
    }
    public void display(){
       if(isEmpty()){
           System.out.println("empty");
       }
       int i = font;
       do {
           System.out.print(data[i] + " -> ");
           i++;
           i %= data.length;
       }while(i != end);{
            System.out.println("END");
        }
    }
}