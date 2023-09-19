package lab_questions;

/**
 * Write a program to compute area of right angle triangle, equilateral triangle, isosceles triangle using function overloading concept.
 * Objective: To Understand and Implement the concept of Inheritance
 */
public class Question9 {
    static abstract class Shape {
        abstract double area();
    }

    static class RightAngleTriangle extends Shape {
        double base, height;

        RightAngleTriangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double area() {
            return 0.5 * base * height;
        }
    }

    static class EquilateralTriangle extends Shape {
        double side;

        EquilateralTriangle(double side) {
            this.side = side;
        }

        @Override
        public double area() {
            return Math.sqrt(3) / 4 * side * side;
        }
    }

    static class IsoscelesTriangle extends Shape {
        double base, height;

        IsoscelesTriangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double area() {
            return 0.5 * base * height;
        }
    }

    public static void main(String[] args) {

        Shape rightAngleTriangle = new RightAngleTriangle(3, 4);
        Shape equilateralTriangle = new EquilateralTriangle(3);
        Shape isoscelesTriangle = new IsoscelesTriangle(3, 4);
        System.out.println("Area of right angle triangle: " + rightAngleTriangle.area());
        System.out.println("Area of equilateral triangle: " + equilateralTriangle.area());
        System.out.println("Area of isosceles triangle: " + isoscelesTriangle.area());
    }
}
