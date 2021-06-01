/*
Exercise 5
Create a for loop that counts down the USA Billboard Top 5 music artists of the 1980s!
Store the names of the groups / artists in an array.
Here are the artists and their positions:
No 5: Michael Jackson
No 4: Frankie Goes To Hollywood
No 3: Queen
No 2: Simple Minds
No 1: Rick Astley
*/

package ie.com.certification.topic8;

public class JFT8Ex5 {
    public static void main (String[] args){
        String [] displayMusicArtistsName;
        displayMusicArtistsName = new String[]{"Michael Jackson" , "Frankie Goes To Hollywood", "Queen", "Simple Minds", "Rick Astley"};
        printMessage(displayMusicArtistsName);
    }

    public static void printMessage (String [] displayMusicArtistsName) {
        int counter = 5;
        for (String output: displayMusicArtistsName){
            System.out.println("No " + counter + ": " + output);
            counter--;
        }
    }
}
