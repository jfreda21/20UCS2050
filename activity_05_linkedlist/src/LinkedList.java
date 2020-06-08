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
    // LinkedList ll = new LinkedList();
    // if (ll.isEmpty())
    //    System.out.println("list is empty");
    // else
    //    System.out.println("list is NOT empty!");

    // TODO: add in front
    // [ 5, 8]
    // head = Node(3)
    // newNode = Node(3)
    public void add(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    // TODO: add at the tail
    // list: [ 5, 8, 3 ]
    // head = Node(5)
    // current = Node(8)
    // newNode = Node(3)
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

    // TODO: return the number of elements of the list
    // hint: do NOT modify the head node!!!
    // hint: instead, use a temp Node reference, name it "current"
    // [ 5, 8, 3 ]
    // head = Node(5)
    // current = null
    // count = 3
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
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

    // TODO: remove the element at the given index location (if the index is invalid, do nothing)
    void remove(int index) {

    }
}
