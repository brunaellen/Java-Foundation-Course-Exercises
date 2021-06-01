/*
Exercise 15
Write a Java program, which prints out all the even numbers from 1 to 100.
Use a while loop as part of the solution.
*/
package ie.com.certification.topic8;

public class JFT8Ex15 {
    public static void main (String[]args){
        Integer number = 2;
        Integer maximumNumber = 100;
        printEvenNumbers(number, maximumNumber);
    }
    public static void printEvenNumbers (Integer number, Integer maximumNumber){
        while (number <= maximumNumber){
            System.out.print(number + " ");
            number+=2;
        }
    }
}
