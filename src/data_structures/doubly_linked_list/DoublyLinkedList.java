package data_structures.doubly_linked_list;

public class DoublyLinkedList {
    Node head;
    Node tail;

    int size;

    DoublyLinkedList() {
        this.size = 0;
    }

    public void addFirst(int data){
        Node node = new  Node(data);
        if(head == null){
            head = tail = node;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
            size++;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayBackwards(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public void addLast(int data){
        Node node = new  Node(data);
        if(tail == null){
            tail = head = node;
        }
        else{
            tail.next = node;
            node.prev = tail;
            tail = node;
            size++;
        }
    }
}
