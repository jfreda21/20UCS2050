/*
 * CS2050 - Computer Science II - Summer 2020
 * Instructor: Thyago Mota
 * Description: Activity 05 - Node (of integers)
 */

public class Node {

    private int  data;
    private Node next;

    public Node() {
        data = 0; // set to a default value
        next = null; // does not refer to any particular node
    }

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    // Node a = new Node(5);
    // Node b = new Node(8);
    // a -> b
    // a.setNext(b);
    // which node comes after a?
    // Node temp;
    // temp = a.getNext();

    @Override
    public String toString() {
        return data + "";
    }
}
