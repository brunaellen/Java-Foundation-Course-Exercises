/*Exercise 7
Using a for loop, display the following sequence of numbers on the same line:
300 250 200 150 100 50
*/

package ie.com.certification.topic8;

public class JFT8Ex7 {
    public static void main (String[] args){
        Integer displayNumber = 300;
        printMessage(displayNumber);
    }

    public static void printMessage (Integer displayNumber) {
        for (displayNumber = 300; displayNumber > 49; displayNumber-=50){
            System.out.print(displayNumber + " ");
        }
    }
}
