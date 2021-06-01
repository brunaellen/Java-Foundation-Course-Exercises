/*
Exercise 2
Write a Java program that uses a for loop to display the numbers from 0-9 (inclusive).
 */

package ie.com.certification.topic8;

public class JFT8Ex2 {
    public static void main (String[] args){
        Integer number = 0;
        printNumbers(number);

    }

    public static void printNumbers (Integer number) {
        for (number = 0; number < 10; number++){
            System.out.println(number);
        }
    }
}
