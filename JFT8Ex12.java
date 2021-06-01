/*
Exercise 12:
Write a Java program which determines if a person is entitled to vote. A person is entitled to
vote if they are aged 18 years or over.
Create an array named ‘ages’ to store the following ages.
34, 16, 31, 19, 30, 19, 32, 11, 12, 13
Create a second array to store the corresponding names.
John Welsh, Frank Hayes, Anna Davis, Jennifer Burns, Francis Burke, Fred Smith, Phillipa Smith, Jason Button, Ian Hayes, Derva Conway.
Use a for loop to iterate through the ‘ages’ array. Check the value of the age stored in each
array index position. If age is less than 18, no message should be displayed. In this case, use
the continue keyword to move on to the next iteration of the loop.
However, if age is greater than 18, display the name of the person along with the message,
“You are eligible to vote. Proceed to your polling station”.
*/

package ie.com.certification.topic8;


public class JFT8Ex12 {
    public static void main (String[] args){
        Integer [] ages = new Integer[]{34, 16, 31, 19, 30, 19, 32, 11, 12, 13};
        String [] names = new String[]{"John Welsh", "Frank Hayes", "Anna Davis", "Jennifer Burns", "Francis Burke",
                "Fred Smith", "Phillipa Smith", "Jason Button", "Ian Hayes", "Derva Conway"};
        printMessage(ages, names);
    }
    public static void printMessage(Integer[] ages, String[] names) {
        int minimumAge = 18;
        String message;
        int counter = 0;
        for (Integer age: ages){
            if(age >= minimumAge){
                message = names[counter] + ". You are "+ ages[counter] + " old, therefore, you are eligible to vote. Proceed to your polling station";
                System.out.println(message);
            } else if (age < minimumAge){
                counter++;
                continue;

            }
            counter++;
        }
    }
}
