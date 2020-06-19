/*
 * CS2050 - Computer Science II - Summer 2020
 * Instructor: Thyago Mota
 * Description: Activity 10 - "generic" Node
 */

public class Node<K> {

    private K    data;
    private Node next;

    public Node() {
        data = null;
        next = null;
    }

    public Node(K data) {
        this.data = data;
        next      = null;
    }

    public K getData() {
        return data;
    }

    public Node<K> getNext() {
        return next;
    }

    public void setData(K data) {
        this.data = data;
    }

    public void setNext(Node<K> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
