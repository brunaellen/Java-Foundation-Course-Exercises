/*Question 8
Write a Java class to model a Student (Student.java).
The class should have the following instance variables.
public String firstName;
public String lastName;
public byte age;
public String className;
public float gradeAverage;
public String address;
The class should also have the following instance methods.
 toString()
Create a second class named Test.java. In the main method, create three Student objects
with the following attributes.
First Name: Last Name: Age: Class Name: Grade Average: Address:
Billy Davis 17 Leaving Cert 1 70.50 12 High Street,
Dublin
Anna Smith 18 Leaving Cert 1 80.00 19 Lower
Street, Dublin
Georgina Moriarty 17 Leaving Cert 1 90.00 5 Middle Street,
Dublin
Call the toString() method on each object in turn.
Using static (class) variables and methods, answer the following questions:
 How many student objects have been created?
 What is the average student grade for the class?*/

package javacourse.exercises.JFT10Ex8;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student firstStudent = new Student("Billy", "Davis", (byte) 17,
                "Leaving Cert 1 ",
                70.50F, "12 High Street, Dublin");

        Student secondStudent = new Student("Anna", "Smith", (byte) 18,
                "Leaving Cert 1 ",
                80.00F, "19 Lower Street, Dublin");

        Student thirdStudent = new Student("Georgina", "Moriarty", (byte) 17,
                "Leaving Cert 1 ",
                90.00F, "5 Middle Street, Dublin");

        List<Student> arrayListStudents = new ArrayList<>();
        arrayListStudents.add(firstStudent);
        arrayListStudents.add(secondStudent);
        arrayListStudents.add(thirdStudent);

        for (Student students: arrayListStudents) {
            System.out.println(students.toString() + "\n");
            Student.sumOfGrades += students.getGradeAverage();
        }
        Student.noOfStudents = arrayListStudents.size();

        System.out.println("There are: " + Student.noOfStudents + " students.");
        System.out.println("The grade average is: " + Student.averageStudentGrade());
    }
}
