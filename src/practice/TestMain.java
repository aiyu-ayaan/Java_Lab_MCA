package practice;

class Test {
    static int d;

    void display() {
        System.out.println(d);
    }

    static void show() {
        System.out.println(d);
    }
}

public class TestMain {
    final int s = 0;

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.display();
        Test.show();
    }
}
