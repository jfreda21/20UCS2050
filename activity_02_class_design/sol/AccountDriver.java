/*
 * CS2050 - Computer Science II - Summer 2020
 * Instructor: Thyago Mota
 * Description: Activity 02 - AccountDriver
 */

public class AccountDriver {

    public static void main(String[] args) {

        Account acc = new Account(123, "Thyago");
        acc.deposit(100);
        System.out.println(acc);
    }
}
