package class_question;

/**
 * Root of a quadratic equation where the coefficients are taken from the command
 */
public class ClassQuestion2 {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Invalid number of arguments.");
            return;
        }
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("No real roots.");
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }
    }
}