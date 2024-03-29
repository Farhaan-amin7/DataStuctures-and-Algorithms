package SuperPackage.StacksAndQueues;

import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(7);
//        stack.push(45);
//        stack.push(20);
//        stack.push(98);
//       stack.push(6);
//
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        Log 2 base 2;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(54);
        queue.add(4);
        queue.add(45);
        queue.add(44);
        queue.add(84);
        queue.add(94);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        Deque deque = new ArrayDeque<>();
        deque.add(527);
        System.out.println(deque.peek());

    }
}