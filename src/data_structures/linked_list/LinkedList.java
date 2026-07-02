package data_structures.linked_list;

public class LinkedList {

    Node head;
    Node tail;
    int size;

    LinkedList(){
        this.size = 0;
    }

    public void addFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;
        if(tail == null){
            tail = head;
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

    public void addLast(int data){
        Node node = new Node(data);
        if(tail == null){
            addFirst(data);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public Node findByIndex(int index){
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void deleteFirst(){
        head = head.next;
        size--;
    }

    public void deleteLast(){
        if(tail == null){
            System.out.print("List is empty");
            return;
        }
        Node secondLast = findByIndex(size - 2);
        tail = secondLast;
        tail.next = null;
        size--;
    }

    public int findMax(){
        if(head == null){
            throw new RuntimeException("List is empty");
        }
        Node temp = head;
        int max = temp.data;
        while(temp != null){
            if(temp.data > max){
                max = temp.data;
            }
            temp = temp.next;
        }
        return max;
    }

    public void addAtIndex(int index, int data){
        Node node = new Node(data);
        if(index == 0){
            addFirst(data);
            return;
        }
        if(index == size){
            addLast(data);
            return;
        }
        Node prev = findByIndex(index - 1);
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    public void deleteAtIndex(int index){
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == size - 1){
            deleteLast();
            return;
        }
        Node prev = findByIndex(index - 1);
        prev.next = prev.next.next;
        size--;
    }
}
