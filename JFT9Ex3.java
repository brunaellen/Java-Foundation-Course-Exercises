/*Exercise 3:
Create an ArrayList object to store the names of the following ‘big 4’ Premier League
football teams.
 Chelsea
 Manchester City
 Arsenal
 Manchester Utd.
Use a while loop to output the contents of the ArrayList object.
Answer the following questions:
 Does the ArrayList object contain the string, “Leeds Utd”?
 Manchester Utd should be removed from the ArrayList to be replaced with
Liverpool.
 Display the name of the team in the third element of the ArrayList.
 What is the index position of the team, Liverpool?*/

package ie.com.certification.topic9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JFT9Ex3 {
    public static void main(String[] args) {
        //the variable (list) was created to store  the names of the Premier League football teams.
        //giving me the possibility to add all football teams into the ArrayList(footballTeams) in one go!
        List<String> list = Arrays.asList("Chelsea", "Manchester City", "Arsenal", "Manchester Utd");
        List<String> footballTeams = new ArrayList<>();
        footballTeams.addAll(list);
        String printMessage = "";
        int counter = 0;

        while (counter < footballTeams.size()) {
            printMessage += footballTeams.get(counter) + "\n";
            counter++;
        }

        /* ****************** answer the following questions. ****************** */
        //Does the ArrayList object contain the string, “Leeds Utd”?
        printMessage += "\nDoes the ArrayList object contain the string, “Leeds Utd”? ";
        printMessage += footballTeams.contains("Leeds Utd") + "\n";

        //Manchester Utd should be removed from the ArrayList to be replaced with Liverpool.
        footballTeams.set(3, "Liverpool");
        printMessage += "\nManchester Utd was removed from the ArrayList and replaced with Liverpool.\n";

        //Display the name of the team in the third element of the ArrayList.
        printMessage += "\nDisplay the name of the team in the third element of the ArrayList: ";
        printMessage += footballTeams.get(2) + "\n";

        //What is the index position of the team, Liverpool?
        printMessage += "\nWhat is the index position of the team, Liverpool? ";
        printMessage += footballTeams.indexOf("Liverpool");

        System.out.println(printMessage);
    }
}
