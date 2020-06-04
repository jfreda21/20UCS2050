/*
 * CS2050 - Computer Science II - Summer 2020
 * Instructor: Thyago Mota
 * Description: Activity 02 - Sandwich
 */

/* TODO: A sandwich is defined by a name, number of calories (integer is fine), and price. Users should be able to create a sandwich given its name, number of calories, and price. If informed number of calories or price is negative, make sure those values are initialized to zero. Define “toString” and a method called “isHealthy” that returns true if the number of calories is less than 250, false otherwise.
 */
public class Sandwich {

    private String name;
    private int    calories;
    private double price;

    static final int MIN_CALORIES = 0;
    static final int HEALTHY_CALORIES_THRESHOLD = 250;
    static final double MIN_PRICE = 0;

    public Sandwich(String name, int calories, double price) {
        this.name = name;
        if (calories < MIN_CALORIES)
            this.calories = MIN_CALORIES;
        else
            this.calories = calories;
        if (price < 0)
            this.price = MIN_PRICE;
        else
            this.price = price;
    }

    public boolean isHealth() {
        return calories < HEALTHY_CALORIES_THRESHOLD;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
