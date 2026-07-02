package data_structures.linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.display();
        list.addLast(50);
        list.display();
        list.findByIndex(2);
        list.deleteFirst();
        list.deleteLast();
        list.display();
        System.out.println(list.findMax());
        list.addAtIndex(1, 60);
        list.display();
        list.deleteAtIndex(2);
        list.display();
    }
}
