package lab_questions;

/**
 * Write a Program illustrating how the constructors are implemented and the order in which
 * they are called when the classes are inherited. Use three classes named alpha, beta,
 * gamma such that alpha, beta are base class and gamma is derived class inheriting alpha & beta.
 */
public class Question11 {

    static class Alpha {
        Alpha() {
            System.out.println("Alpha");
        }
    }

    static class Beta extends Alpha {
        Beta() {
            System.out.println("Beta");
        }
    }

    static class Gamma extends Beta {
        Gamma() {
            System.out.println("Gamma");
        }
    }

    public static void main(String[] args) {
        Gamma gamma = new Gamma();
    }
}
