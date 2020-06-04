/*
 * CS2050 - Computer Science II - Summer 2020
 * Instructor: Thyago Mota
 * Description: Activity 05 - LinkedList (of integers)
 */

public class LinkedList {

    private Node head;

    public LinkedList() {
        head = null;
    }

    // TODO: add in front
    public void add(int data) {

    }

    // TODO: add at the tail
    public void append(int data) {

    }

    // TODOd: toString override
    @Override
    public String toString() {
        String out = "";
        Node current = head;
        while (current != null) {
            out += current.toString() + " ";
            current = current.getNext();
        }
        return out;
    }

    // TODO: return true if the list is empty, false otherwise
    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return 0;
    }

    // TODO: return the element at the given index location (if index is invalid, just return 0)
    public int get(int index) {
        return 0;
    }

    // TODO: change the element at the given index location (if index is invalid, do nothing)
    public void set(int index, int data) {

    }

    // TODO: insert the element at the given index location (if the index is invalid, do nothing)
    void insert(int index, int data) {

    }

    // TODO: remvoe the element at the given index location (if the index is invalid, do nothing)
    void remove(int index) {

    }
}
