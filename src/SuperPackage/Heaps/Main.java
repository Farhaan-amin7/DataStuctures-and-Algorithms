package SuperPackage.Heaps;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
    Heap<Integer> heap = new Heap<>();
        heap.insert(37);
        heap.insert(7);
        heap.insert(4);
        heap.insert(31);
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
//        ArrayList list = new heap.heapSort();
//        System.out.println(list);
    }
}