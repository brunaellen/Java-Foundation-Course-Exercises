/*Exercise 2:
You work for a travel company and are creating a list of holiday destinations for the coming
summer season.
So far, you have the following destinations confirmed.
 Ibiza
 Gran Canaria
 Nice
 Tropea
Create an ArrayList object to store the names of holiday destinations (strings)
Output the contents of the ArrayList object using a standard for loop (i.e. not an enhanced
for loop).
You will need to determine the size of the ArrayList object. Please refer to the ArrayList class
description in the Java API. Which method will return the size of an ArrayList?
Now answer the following questions.
 Is the ArrayList empty?
 What is the size of the ArrayList?
 At what index position in the ArrayList is item, “Tropea”?
 Add the entry “Fuerteventura” at index position 2 of the array list.
 Remove the entry, “Gran Canaria” from the ArrayList.
 Does the ArrayList contain the string, “Nice”?
*/

package ie.com.certification.topic9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JFT9Ex2 {
    public static void main(String[] args) {
        //the variable (list) was created to store the names of the holidays destinations
        //giving me the possibility to add all holidays destinations into the ArrayList(listHolidayDestinations) in one go!
        List<String> list = Arrays.asList("Ibiza", "Gran Canaria", "Nice", "Tropea");
        List<String> listHolidayDestinations = new ArrayList<>();
        listHolidayDestinations.addAll(list);
        String printMessage = "";

        for (int counter = 0; counter < listHolidayDestinations.size(); counter++) {
            printMessage += listHolidayDestinations.get(counter) + "\n";
        }

        /* ****************** answer the following questions. ****************** */
        //Is the ArrayList empty?
        printMessage += "\nIs the ArrayList empty? ";
        printMessage += listHolidayDestinations.isEmpty()+"\n";

        //What is the size of the ArrayList?
        printMessage += "\nWhat is the size of the ArrayList? ";
        printMessage += listHolidayDestinations.size() +"\n";

        //At what index position in the ArrayList is item, “Tropea”?
        printMessage += "\nAt what index position in the ArrayList is item, “Tropea”? ";
        printMessage += listHolidayDestinations.indexOf("Tropea") +"\n";

        //Add the entry “Fuerteventura” at index position 2 of the array list.
        listHolidayDestinations.add(2, "Fuerteventura");
        printMessage += "\nAdded the entry “Fuerteventura” at index position 2 of the array list.\n";

        //Remove the entry, “Gran Canaria” from the ArrayList.
        listHolidayDestinations.remove("Gran Canaria");
        printMessage += "\nRemoved the entry, “Gran Canaria” from the ArrayList.\n";

        //Does the ArrayList contain the string, “Nice”?
        printMessage += "\nDoes the ArrayList contain the string, “Nice”? ";
        printMessage += listHolidayDestinations.contains("Nice");

        System.out.println(printMessage);
    }
}