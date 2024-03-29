package SuperPackage.StacksAndQueues;

public class Main {
    public static void main(String[] args) throws StackException{
        CustomStack customStack = new DynamicStack(5);
        customStack.push(6);
        customStack.push(5);
        customStack.push(4);
        customStack.push(3);
        customStack.push(9);
        customStack.push(3);


        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());


    }
}