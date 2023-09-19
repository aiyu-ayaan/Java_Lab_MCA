package lab_questions;

/**
 * Write a Program to design a student class representing student roll no. and a test class (derived class of student)
 * representing the scores of the student in various subjects and sports class representing the score in sports.
 * The sports and test class should be inherited by a result class having the functionality to add the
 * scores and display the final result for a student.
 */
public class Question10 {

    static class Student {
        int rollNo;

        Student(int rollNo) {
            this.rollNo = rollNo;
        }
    }

    interface Result {
        void totalMarks();
    }

    static class Test extends Student implements Result {
        int[] scores;

        Test(int rollNo, int[] scores) {
            super(rollNo);
            this.scores = scores;
        }

        @Override
        public void totalMarks() {
            int total = 0;
            for (int score : scores)
                total += score;
            System.out.println("Total Marks: " + total);
        }
    }

    static class Sports extends Student implements Result {
        int score;

        Sports(int rollNo, int score) {
            super(rollNo);
            this.score = score;
        }

        @Override
        public void totalMarks() {
            System.out.println("Sports Score: " + score);
        }
    }


    public static void main(String[] args) {

        Result result = new Test(1, new int[]{10, 20, 30});
        result.totalMarks();
        result = new Sports(1, 40);
        result.totalMarks();

    }
}

