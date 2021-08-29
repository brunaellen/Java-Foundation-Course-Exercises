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
First Name: Last Name: Age: Class Name: Grade
Average:
Address:
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

public class Student {
    public String firstName;
    public String lastName;
    public byte age;
    public String className;
    public float gradeAverage;
    public String address;
    public static int noOfStudents;
    public static float sumOfGrades;

    //constructor
    public Student(String firstName, String lastName, byte age, String className, float gradeAverage, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.className = className;
        this.gradeAverage = gradeAverage;
        this.address = address;
    }

    //methods
    public String toString() {
        return "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Age: " + age + "\n" +
                "Class Name: " + className + "\n" + "Grade Average: " + gradeAverage + "\n" + "Address: " + address;
    }

    public static float averageStudentGrade() {
        float calculateAverageStudentGrade =  Student.sumOfGrades / Student.noOfStudents;
        return calculateAverageStudentGrade;
    }

    public float getGradeAverage() {
        return gradeAverage;
    }
}
