package lab_questions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * Write a program to read the class object of student info such as name , age ,sex ,height
 * and weight from the keyboard and to store them on a specified file using read()
 * and write() functions. Again the same file is opened for
 * reading and displaying the contents of the file on the screen.
 */
public class Question13 {

    public enum Gender {
        MALE, FEMALE, OTHER
    }

    public static class Student implements Serializable {
        private String name;
        private int age;
        private Gender sex;

        private float height; // in cm
        private float weight; // in kg

        public Student(String name, int age, Gender sex, float height, float weight) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Gender getSex() {
            return sex;
        }

        public void setSex(Gender sex) {
            this.sex = sex;
        }

        public float getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public float getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    ", height=" + height +
                    ", weight=" + weight +
                    '}';
        }
    }

    public static void readFile(String filename) {
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student.getName());
            System.out.println(student.getAge());
            System.out.println(student.getSex());
            System.out.println(student.getHeight());
            System.out.println(student.getWeight());
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void writeFile(String filename, Student student) {
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(filename);
            java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        var student = new Student("Ayaan", 23, Gender.MALE, 176.78f, 60.0f);
        writeFile("student.txt", student);
        readFile("student.txt");
    }
}
