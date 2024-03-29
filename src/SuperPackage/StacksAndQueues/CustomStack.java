package SuperPackage.StacksAndQueues;

public class CustomStack {
    protected  int [] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    CustomStack(int size){
        this.data = new int[size];
    }
    CustomStack(){
        this(DEFAULT_SIZE);// Calling the constructor
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("cannot pop from an empty stack!!");
        }
//        int removed = data[ptr];
//        ptr--; // This is the long form. Simply do this instead->
        return data[ptr--];
    }
    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("cannot pop from an empty stack!!");
        }
        return data[ptr];
    }
    boolean isFull(){
        return ptr == data.length - 1; // ptr is at last index.
    }
    private boolean isEmpty(){
        return ptr == -1;
    }

}