/*Question 2
Create a Java application to model a Jelly class. Jelly objects will be instantiated (created) from the
Jelly class.
A Jelly should have the following attributes:
manufacturer String
price float
flavour String
noCalories float
expiryDate String
A Jelly should have the following methods:
 setInstructions() – a method that returns the message, “Leave Jelly to set in a cool
environment for 1hr”.
 toString() – a method that returns a string, capturing the values held in the instance
variables / attributes of a Jelly object, created from the Jelly class.
In the second class of the application (Main), create the main method.
In the main method, create three Jelly objects with the following attributes:
manufacturer price flavour noCalories expiryDate
Chivery 3.50 Strawberry 24 25/06/2016
Nestles 3.42 Banana 26 27/07/2016
Danones 3.00 Lemon 28 28/06/2015
For each object, call the setInstructions() and toString() methods in turn.*/

package ie.com.certification.topic10.JFT10Ex2;

import java.util.ArrayList;
import java.util.List;

public class Jelly {
    private String manufacturer;
    private float price;
    private String flavour;
    private float noCalories;
    private String expiryDate;

    public Jelly(String manufacturer, float price, String flavour, float noCalories, String expiryDate) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.flavour = flavour;
        this.noCalories = noCalories;
        this.expiryDate = expiryDate;
    }

    public String setInstructions() {
        String message = "Leave Jelly to set in a cool environment for 1hr";
        return message;
    }

    @Override
    public String toString() {
        return "manufacturer: " + manufacturer + "\n" +
                "price: " + price +
                "\nflavour: " + flavour +
                "\nnoCalories: " + noCalories +
                "\nexpiryDate: " + expiryDate;
    }
}
