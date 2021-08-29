/*
Exercise 1
Write a Java program that prints out the message, “Learning Java is truly a rewarding
experience!” ten times. Use a for loop as part of the solution.
 */

package javacourse.exercises;

public class JFT8Ex1 {
    public static void main (String[] args){
        String message = "Learning Java is truly a rewarding experience!";
        printMessage(message);
    }

    public static void printMessage (String message) {
        for (int counter = 1; counter < 11; counter++){
            System.out.println(counter + " " + message);
        }
    }
}
