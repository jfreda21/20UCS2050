/*
 * CS2050 - Computer Science II - Summer 2020
 * Instructor: Thyago Mota
 * Description: Activity 08 - DynamicStackLinkedList
 */

public class DynamicStackLinkedList {

    private Node top;

    public DynamicStackLinkedList() {
        top = null;
    }

    // TODO: push data onto the stack (assume the top is the head)
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.setNext(top);
        top = newNode;
    }

    // TODO: pop returns the element on top of the stack, also removing it
    public int pop() {
        if (isEmpty())
            return 0;
        int data = top.getData();
        Node temp = top;
        top = top.getNext();
        temp.setNext(null);
        return data;
    }

    // TODO: peek returns the element on top of the stack, but does not remove it
    public int peek() {
        if (isEmpty())
            return 0;
        return top.getData();
    }

    public int size() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public boolean isEmpty() {
        return top == null;
    }

    // top to bottom (left to right)
    @Override
    public String toString() {
        String out = "(top)";
        Node current = top;
        while (current != null) {
            out += " " + current.toString();
            current = current.getNext();
        }
        out += " (bottom)";
        return out;
    }
}
