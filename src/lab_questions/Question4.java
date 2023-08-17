package lab_questions;

import java.util.Scanner;

/**
 * Write an inline function to find largest of three number
 */
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(), num2 = scanner.nextInt(), num3 = scanner.nextInt();
        int max = (num1 < num2) ? (num2 < num3) ? num3 : num2 : (num1 < num3) ? num3 : num1;
        System.out.println("Largest is " + max);
    }
}
