/*
Exercise 14
Write a Java program, which prints out the numbers 5 10 15 20 25 30 one
number per line using a while loop.
*/
package ie.com.certification.topic8;


public class JFT8Ex14 {
    public static void main (String[]args){
        Integer number = 5;
        Integer maximumNumber = 30;
        printNumbers(number, maximumNumber);
    }
    public static void printNumbers (Integer number, Integer maximumNumber){
        while (number <= maximumNumber){
            System.out.print(number + " ");
            number+=5;
        }
    }
}
