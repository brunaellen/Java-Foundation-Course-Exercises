/*
Exercise 13
Write a Java program, which prints out the numbers from 1-5 using a while
loop.
*/

package ie.com.certification.topic8;

public class JFT8Ex13 {
    public static void main (String[]args){
        Integer number = 1;
        Integer maximumNumber = 5;
        printNumbers(number, maximumNumber);
    }
    public static void printNumbers (Integer number, Integer maximumNumber){
        while (number <= maximumNumber){
            System.out.println(number);
            number++;
        }
    }
}
