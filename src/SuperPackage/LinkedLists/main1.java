package SuperPackage.LinkedLists;

public class main1 {
    public static void main(String[] args) {

        PracticeLinkedList list = new PracticeLinkedList();
//        list.insertAtFirst(10);
//        list.insertAtFirst(200);
//        list.insertAtFirst(49);
//        list.insertAtFirst(48);
//
//        list.insertAtFirst(98);
//
//        list.insertAtFirst(354);
        list.insertAtFirst(8);
        list.insertAtFirst(6);
        list.insertAtFirst(4);
        list.insertAtFirst(2);
//        System.out.println(list.deleteLast2());
//        System.out.println(list.deleteLast2());
//        System.out.println(list.deleteLast2());
//        System.out.println(list.deleteLast2());
        PracticeLinkedList.Node node = list.find(8);
        System.out.println(node.value);
        node = list.find(245);
//        Node node;
//        node = list.get(2);
//        System.out.println(node.value);
//        list.deleteLast();

//        System.out.println(list.deleteLast());
//        System.out.println(list.delete(3));
        list.display();

    }

}