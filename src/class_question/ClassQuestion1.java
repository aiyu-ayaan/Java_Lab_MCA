package class_question;

//34 56 67

/**
 * Find the max and min from the command line arguments.
 */
public class ClassQuestion1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided.");
            return;
        }
        int max = 0, min = 0;
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (i == 0) {
                max = num;
                min = num;
            } else {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
