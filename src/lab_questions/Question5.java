package lab_questions;

/**
 * Write a Program using copy constructor to copy data of an object to another object.
 */
public class Question5 {
    static class CopyConstructor {
        private int data;

        public CopyConstructor(int data) {
            this.data = data;
        }

        public CopyConstructor(CopyConstructor obj) {
            this.data = obj.data;
        }

        public int getData() {
            return data;
        }
    }

    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor(10);
        CopyConstructor obj2 = new CopyConstructor(obj1);
        System.out.println("obj1.data = " + obj1.getData());
        System.out.println("obj2.data = " + obj2.getData());
    }
}
