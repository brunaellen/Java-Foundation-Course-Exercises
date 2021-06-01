/*
Exercise 11
Imagine that a fishing trip will only go ahead if there are seven positive responses.
Create an array to store the following character values (the data type of the array should be
char, and the size / length of the array, 10).
Determine if the fishing trip will go ahead.
*/
package ie.com.certification.topic8;

public class JFT8Ex11 {
    public static void main (String[] args){
        char [] answer;
        answer = new char[]{'Y', 'Y','Y','Y','Y','Y','N','Y', 'N', 'N'};
        checkAnswer(answer);
    }
    public static void checkAnswer (char [] answer) {
        char yes = 'Y';
        int counterYes = 0;
        int counterNo = 0;
        String message;
        for (char answers : answer) {
            if (answers == yes) {
                counterYes++;
            } else {
                counterNo++;
            }
        }
        int minimumPositiveResponses = 7;
        if (counterYes >= minimumPositiveResponses) {
            message = "Fishing trip will go ahead!";
            message += "\nThe number of positive responses was " + counterYes;
            System.out.println(message);
        } else {
            message = "Fishing trip will not go ahead!";
            message += "\nThe number of negative responses was " + counterNo;
            System.out.println(message);
        }
    }
}
