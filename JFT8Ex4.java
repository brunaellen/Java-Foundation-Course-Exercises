/*
Exercise 4
Create a for loop that executes only once. Set the value of the counter to 0. The loop should
run one time.
*/

package ie.com.certification.topic8;


public class JFT8Ex4 {
    public static void main (String[] args){
        Integer number = 0;
        printNumbers(number);
    }
    public static void printNumbers (Integer number) {
        for (number = 0; number < 1; number++){
            System.out.println(number);
        }
    }
}
