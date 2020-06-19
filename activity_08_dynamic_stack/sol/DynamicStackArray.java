/*
 * CS2050 - Computer Science II - Summer 2020
 * Instructor: Thyago Mota
 * Description: Activity 08 - DynamicStackArray
 */

public class DynamicStackArray {

    private int capacity;
    private int data[]; // assume index = 0 is the bottom
    public static final int MIN_CAPACITY = 2;
    public static final int INCREMENT_SIZE = 5;
    private int size;

    public DynamicStackArray() {
        this.capacity = MIN_CAPACITY;
        data = new int[this.capacity];
        size = 0;
    }

    public DynamicStackArray(int capacity) {
        if (capacity < MIN_CAPACITY)
            this.capacity = MIN_CAPACITY;
        else
            this.capacity = capacity;
        data = new int[this.capacity];
        size = 0;
    }

    // TODO: push data onto the stack (if no space is available, increase the capacity of the stack by adding INCREMENT_CAPACITY)
    public void push(int value) {
        if (size == capacity) {
            int newData[] = new int[size + INCREMENT_SIZE];
            for (int i = 0; i < data.length; i++)
                newData[i] = data[i];
            data = newData;
        }
        data[size++] = value;
    }

    // TODO: peek just returns the element on top of the stack but does not remove it;
    // if the stack is empty, return 0 or throw an exception
    public int peek() {
        if (size > 0)
            return data[size - 1];
        return 0;
    }

    // TODO: pop returns the element on top of the stack, also removing it
    // if the stack is empty, return 0 or throw an exception
    public int pop() {
        if (size > 0) {
            int data = this.data[size - 1];
            size--;
            return data;
        }
        return 0;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    // TODO: implement isEmpty
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        String out = "(top)";
        for (int i = size - 1; i >= 0; i--)
            out += " " + data[i];
        out += " (bottom)";
        return out;
    }
}