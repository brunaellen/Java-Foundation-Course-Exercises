/*Exercise 1:
Create a Java program to store the names of your favourite pop albums. Over time, you
intend to add further titles to your list. For this reason, you decide to use an ArrayList object
to store album names, as its size can dynamically grow.
 Thriller
 The Dark Side of the Moon
 Bat Out of Hell
 Back in Black
 Come On Over
 Led Zeppelin IV
 Jagged Little Pill
Create an ArrayList object that will store strings. Add the
names of the albums above to the ArrayList.
Once you have populated the ArrayList, display its contents, using an enhanced for loop.
*/

package javacourse.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JFT9Ex1 {
    public static void main(String[] args) {
        //the variable (list) was created to store the names of the albums
        //giving me the possibility to add all names of the albums into the ArrayList(favoritePopAlbums) in one go!
        List<String> list = Arrays.asList("Thriller", "The Dark Side of the Moon",
                "Bat Out of Hell", "Back in Black", "Come On Over", "Led Zeppelin IV", "Jagged Little Pill");
        List <String> favoritePopAlbums = new ArrayList<>();
        favoritePopAlbums.addAll(list);
        for (String printAllFavoritePopAlbums: favoritePopAlbums) {
            System.out.println(printAllFavoritePopAlbums);
        }
    }
}