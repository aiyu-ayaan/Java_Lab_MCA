package lab_questions;

/**
 * 6.Write a program to perform addition of two complex numbers using constructor overloading.The first constructor which takes no argument is used to create objects which are not initialized, second which takes one argument is used to initialize
 * real and imag parts to equal values and third
 * which takes two argument is used to initialized real and
 * imag to two different values.
 */


public class Question6 {

   static class Complex {
        private int real, imag;

        Complex() {
            real = 0;
            imag = 0;
        }

        Complex(int real) {
            this.real = real;
            this.imag = real;
        }

        Complex(int real, int imag) {
            this.real = real;
            this.imag = imag;
        }

        public void display() {
            System.out.println(real + " + " + imag + "i");
        }

        public Complex add(Complex obj) {
            Complex temp = new Complex();
            temp.real = this.real + obj.real;
            temp.imag = this.imag + obj.imag;
            return temp;
        }
    }
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex(10);
        Complex c3 = new Complex(10, 20);
        Complex c4 = c2.add(c3);
        c1.display();
        c2.display();
        c3.display();
        c4.display();
    }
}
