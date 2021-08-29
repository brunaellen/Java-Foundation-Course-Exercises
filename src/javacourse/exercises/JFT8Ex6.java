/*
Exercise 6
Using a for loop, display the following sequence of numbers on the same line.
5 10 15 20 25 30
*/

package javacourse.exercises;

public class JFT8Ex6 {
    public static void main (String[] args){
        Integer displayNumber = 5;
        printMessage(displayNumber);
    }

    public static void printMessage (Integer displayNumber) {
        for (displayNumber = 5; displayNumber < 31; displayNumber+=5){
            System.out.print(displayNumber + " ");
        }
    }
}