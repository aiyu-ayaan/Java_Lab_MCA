package lab_questions;

/**
 * 1.Write a Program to design a class having static member
 * function named showCount() which has the
 * property of displaying the number of objects created of the class.
 */
public class Question1 {
    public static void main(String[] args) {
        Count c1 = new Count();
        Count c2 = new Count();
        Count.showCount();
    }

    static class Count {
        static int count = 0;

        Count() {
            count++;
        }

        static void showCount() {
            System.out.println("Number of objects created: " + count);
        }
    }
}
