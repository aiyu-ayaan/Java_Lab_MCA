package practice;

import java.util.stream.IntStream;

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
        long start = System.currentTimeMillis();
        int sum = IntStream.range(1, 100000)
                .sum();
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }


    static <T> void print(T t) {
        System.out.println(t);
    }
}
