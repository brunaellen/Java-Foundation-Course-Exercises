/*
Exercise 8
Write a Java program that uses an array to store the names of the following colours.
Blue | Orange | Yellow | Green | White | Red | Black
Use an enhanced for loop, to display the contents of the array on separate lines in the
console.
*/

package ie.com.certification.topic8;

public class JFT8Ex8 {
    public static void main (String[] args){
        String [] displayColor;
        displayColor = new String[]{"Blue" , "Orange", "Yellow", "Green", "White", "red", "Black"};
        printMessage(displayColor);

    }

    public static void printMessage (String [] displayColor) {
        for (String output: displayColor){
            System.out.println(output);
        }
    }
}
