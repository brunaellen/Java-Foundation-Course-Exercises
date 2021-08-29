/*
Exercise 3
Create a for loop that executes five times starting from six and ending at 10.
Display the value of the counter for each iteration of the loop.
*/

package javacourse.exercises;

public class JFT8Ex3 {
    public static void main (String[] args){
        Integer number = 6;
        printNumbers(number);

    }

    public static void printNumbers (Integer number) {
        for (number = 6; number < 11; number++){
            System.out.println(number);
        }
    }
}
