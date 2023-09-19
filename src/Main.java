/**
 * Management has 4 things
 * 1.hrm
 * 2.freelance
 * 3.IT
 * 4. marketing
 * Student only take 2 things from management
 * Using OPS concept
 */
public class Main {
    static class Management {
        void hrm() {
            System.out.println("HRM");
        }

        void freelance() {
            System.out.println("Freelance");
        }

        void IT() {
            System.out.println("IT");
        }

        void marketing() {
            System.out.println("Marketing");
        }
    }

    static class Student extends Management {
        void hrm() {
            System.out.println("HRM");
        }

        void freelance() {
            System.out.println("Freelance");
        }

    }

    public static void main(String[] args) {
        Student student = new Student();
        student.hrm();
        student.freelance();
    }
}