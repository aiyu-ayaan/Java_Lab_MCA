package lab_questions;

/**
 * Write a program to raise an
 * exception if any attempt is made to refer to an element whose index is beyond
 * the array size. Objective: To Understand and Implement File Operations
 */
public class Question12 {

        static class ArrayIndexOutOfBoundsException extends Exception {
            ArrayIndexOutOfBoundsException(String message) {
                super(message);
            }
        }

        static class Array {
            int[] arr;

            Array(int[] arr) {
                this.arr = arr;
            }

            int get(int index) throws ArrayIndexOutOfBoundsException {
                if (index >= arr.length)
                    throw new ArrayIndexOutOfBoundsException("Index out of bound");
                return arr[index];
            }
        }

        public static void main(String[] args) {
            Array array = new Array(new int[]{1, 2, 3});
            try {
                System.out.println(array.get(3));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
}
