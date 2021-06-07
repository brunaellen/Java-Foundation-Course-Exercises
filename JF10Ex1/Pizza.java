/*Question 1
Create a Java application that contains two separate classes:
 Pizza
 Main
The Pizza class will model a Pizza object! Create the following attributes (instance variables) and
methods (actions / behaviours) of a Pizza.
Attributes (Instance Variables)
 A pizza is of a specific size (small, medium, large). A pizza can have toppings such as cheese and
mushrooms. A pizza has a diameter measured in inches, such as 14.00. A pizza has a price such
as €12.
 Create instance variables as per the above underlined text.
 Methods (actions / behaviours)
 Create the following methods to represent the actions / behaviours of a Pizza object.
 A method named eat(), which returns the message, “Eat a pizza slowly, it can choke you if
you eat it too fast!” The return type of the method should be String and not void. Use the
return keyword to return the message.
 A method named toString(), which returns information (a string) about a given instance (an
object) created from the Pizza class.

In the second class of the application (Main), create the main method.
In the main method, create three Pizza objects with the following attributes:
Size Toppings Diameter Price
Small Ham and Pineapple 12.00 €10
Medium Chicken and Mushroom 14.00 €12
Large Tuna and Sweetcorn 16.00 €14
For each object, call the toString() and eat() methods in turn.
 */

package ie.com.certification.topic10.JF10Ex1;

public class Pizza {
    private String size;
    private String toppings;
    private double diameter;
    private double price;

    public Pizza(String size, String toppings, double diameter, double price) {
        this.size = size;
        this.toppings = toppings;
        this.diameter = diameter;
        this.price = price;
    }

    public static String eat() {
        String eatMessage = "Eat a pizza slowly, it can choke you if ";
        eatMessage += "you eat it too fast!";
        return eatMessage;
    }

    public String toString(){
        String toStringMessage = "Size: " + size + "\n" + "Toppings: " + toppings + "\n" + "Diameter: " + diameter +
                "\n" + "Price: " + price;
        return toStringMessage;
    }
}
