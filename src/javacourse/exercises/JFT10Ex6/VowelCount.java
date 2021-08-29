/*Question 6
Write a Java program to determine the number of vowels found in a piece of text.
Create a class named VowelCount.
The class should include a method also named vowelCount(). One method parameter
should be specified, a String named message.
The method should return a String detailing the total number of vowels and breakdown (a,
e, i, o, u) found in the message.
Create a second class named Test. In this class create an object of type VowelCount from
within the main method. Call the method, vowelCount() and pass the String, “Walking on
the moon”, to the method.
 Hint: Investigate the String class in the API to find the following methods:
o A method to return the length of a String.
o A method to extract a character at a specific index of a String.*/

package javacourse.exercises.JFT10Ex6;


import java.util.Arrays;

public class VowelCount {
    public String vowelCount(String message) {
        int[] counts = new int[5];
        for(char character : message.toUpperCase().toCharArray()) {
            if (character == 'A') counts[0] += 1;
            if (character == 'E') counts[1] += 1;
            if (character == 'I') counts[2] += 1;
            if (character == 'O') counts[3] += 1;
            if (character == 'U') counts[4] += 1;
        }

        String messageToPrint = "No. of vowels: " + Arrays.stream(counts).sum();
        messageToPrint += "\nA count: " + counts[0];
        messageToPrint += "\nE count: " + counts[1];
        messageToPrint += "\nI count: " + counts[2];
        messageToPrint += "\nO count: " + counts[3];
        messageToPrint += "\nU count: " + counts[4];

        return messageToPrint;
    }
}
