/*
 * CS2050 - Computer Science II - Summer 2020
 * Instructor: Thyago Mota
 * Student Names:
 * Description: Activity 12 - DynamicQueueLinkedList Class
 */

import java.util.NoSuchElementException;

public class DynamicQueueLinkedList<T> extends Queue<T> {

    private Node<T> front, rear;

    public DynamicQueueLinkedList() {
        front = rear = null;
    }

    // TODO: implement the method
    @Override
    public void push(T data) {

    }

    // TODO: implement the method
    @Override
    public T pop() throws NoSuchElementException {
        return null; // placeholder
    }

    @Override
    public T peek() throws NoSuchElementException {
        return null; // placeholder
    }

    @Override
    public int size() {
        int count = 0;
        Node<T> current = front;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public String toString() {
        String out = "(front)";
        Node current = front;
        while (current != null) {
            out += " " + current.toString();
            current = current.getNext();
        }
        out += " (rear)";
        return out;
    }
}
