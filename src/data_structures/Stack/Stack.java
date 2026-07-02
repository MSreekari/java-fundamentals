package data_structures.Stack;

public class Stack {
    private Node top;
    public int size;

    Stack() {
        this.size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        return top.data;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
        size++;
    }

    public void pop() {
        top = top.next;
        size--;
    }
}
