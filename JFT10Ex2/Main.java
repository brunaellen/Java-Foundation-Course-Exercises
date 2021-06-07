package ie.com.certification.topic10.JFT10Ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Jelly firstJelly = new Jelly("Chivery", 3.50F, "Strawberry", 24F, "25/06/2016");
        Jelly secondJelly = new Jelly("Nestles", 3.42F, "Banana", 26F, "27/07/2016");
        Jelly thirdJelly = new Jelly("Danones", 3.00F, "Lemon", 28F, "28/06/2015");

        List<Jelly> storeAllJellys = new ArrayList<>();
        storeAllJellys.add(firstJelly);
        storeAllJellys.add(secondJelly);
        storeAllJellys.add(thirdJelly);

        storeAllJellys.stream().map(allJellys -> allJellys + "\n" + allJellys.setInstructions() + "\n").forEach(System.out::println);
    }
}
