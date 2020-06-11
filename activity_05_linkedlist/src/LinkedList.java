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

    // TODOd: add in frontf
    public void add(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    // TODOd: add at the tail
    public void append(int data) {
        Node newNode = new Node(data);
        if (isEmpty())
            head = newNode;
        else {
            Node current = head;
            while (current.getNext() != null)
                current = current.getNext();
            current.setNext(newNode);
        }
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

    // TODOd: return true if the list is empty, false otherwise
    public boolean isEmpty() {
        return head == null;
    }

    // TODOd: return the number of elements of the list
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    // TODOd: return the element at the given index location (if index is invalid, just return 0 or throw an exception)
    public int get(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size()) {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.getNext();
                i++;
            }
            return current.getData();
        }
        throw new IndexOutOfBoundsException();
    }

    // TODOd: change the element at the given index location (if index is invalid, do nothing or throw an exception)
    public void set(int index, int data) {
        if (index >= 0 && index < size()) {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.getNext();
                i++;
            }
            current.setData(data);
        }
        else
            throw new IndexOutOfBoundsException();
    }

    // TODOd: insert the element at the given index location (if the index is invalid, do nothing)
    void insert(int index, int data) {
        if (index > 0 && index < size()) {
            Node newNode = new Node(data);
            Node current = head;
            int i = 0;
            while (i < index - 1) {
                current = current.getNext();
                i++;
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        else if (index == 0)
            add(data);
        else
            throw new IndexOutOfBoundsException();
    }

    // TODO: remove the element at the given index location (if the index is invalid, do nothing)
    void remove(int index) {

    }
}
