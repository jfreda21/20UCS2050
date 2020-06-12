/*
 * CS2050 - Computer Science II - Summer 2020
 * Instructor: Thyago Mota
 * Description: Activity 04 - ArrayList (of integers)
 */

public class ArrayList {

    private static int data[];
    private int size;
    private static final int INCREMENT_SIZE = 5;

    public ArrayList() {
        data = new int[INCREMENT_SIZE];
        size = 0;
    }

    public void add(int value) {
        if (size == data.length) {
            System.out.println("Capacity increase...");
            int newData[] = new int[size + INCREMENT_SIZE];
            for (int i = 0; i < data.length; i++)
                newData[i] = data[i];
            data = newData;
        }
        data[size++] = value;
    }

    public int get(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();
        return data[index]; // random access!!!
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void remove(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();
        for (int i = index + 1; i < size; i++)
            data[i - 1] = data[i];
        size--;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < size; i++)
            str += data[i] + " ";
        return str;
    }
}
