package lab_questions;

/**
 * Write a Program to swap private data members of
 * classes named as class_1, class_2 using friend function.
 */
public class Question3 {
    static class class_1 {
        private int data1;

        public class_1(int data1) {
            this.data1 = data1;
        }

        void setValue(int data1) {
            this.data1 = data1;
        }

        public int getData1() {
            return data1;
        }
    }

    static class class_2 {
        private int data2;

        public class_2(int data1) {
            this.data2 = data1;
        }

        void setValue(int data1) {
            this.data2 = data1;
        }

        public int getData2() {
            return data2;
        }
    }

    public static void swap(class_1 obj1, class_2 obj2) {
        int temp = obj1.getData1();
        obj1.setValue(obj2.getData2());
        obj2.setValue(temp);
    }

    public static void main(String[] args) {
        class_1 obj1 = new class_1(10);
        class_2 obj2 = new class_2(20);

        System.out.println("Before swap:");
        System.out.println("obj1.data1 = " + obj1.getData1());
        System.out.println("obj2.data2 = " + obj2.getData2());

        swap(obj1, obj2);

        System.out.println("After swap:");
        System.out.println("obj1.data1 = " + obj1.getData1());
        System.out.println("obj2.data2 = " + obj2.getData2());
    }
}
