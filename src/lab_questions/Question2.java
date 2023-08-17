package lab_questions;

/**
 * 2.Write a Program which creates & uses array of object of a class.
 * ( for e.g. implementing the list of Managers of a Company having details such as Name, Age, etc.).
 */
public class Question2 {
    public static void main(String[] args) {
        Managers[] managers = new Managers[3];
        managers[0] = new Managers("John", 30, "Sales", 10000);
        managers[1] = new Managers("Jane", 35, "Marketing", 15000);
        managers[2] = new Managers("Jack", 40, "Finance", 20000);

        for (Managers manager : managers) {
            System.out.println("Name: " + manager.getName());
            System.out.println("Age: " + manager.getAge());
            System.out.println("Department: " + manager.getDepartment());
            System.out.println("Salary: " + manager.getSalary());
            System.out.println();
        }
    }

    static class Managers {
        private String name;
        private int age;
        private String department;
        private int salary;

        public Managers(String name, int age, String department, int salary) {
            this.name = name;
            this.age = age;
            this.department = department;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getDepartment() {
            return department;
        }

        public int getSalary() {
            return salary;
        }
    }
}
