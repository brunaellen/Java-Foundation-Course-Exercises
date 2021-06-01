/*
Exercise 10
Write a Java program that stores user passwords in an array. The passwords are shown
below.
oxymoran
poxedfox
kingfisher
cruiseshipper
Create a variable to store the name of a user’s password. Assign it the value, cruiseshipper.
Using an enhanced for loop, search the array for the password. If the password is found,
display the message, “Log-On Successful”. Use the break keyword to leave the looping
construct early, if so.
After searching the array, if the password is not found, display a single error message to the
user. “You cannot be logged on using the specified password.”
*/


package ie.com.certification.topic8;


public class JFT8Ex10 {
    public static void main (String[] args){
        String [] passwords;
        passwords = new String[]{"oxymoran" , "poxedfox", "kingfisher", "cruiseshipper"};
        printMessage(passwords);
    }

    public static void printMessage (String [] passwords) {
        String userPassword = "cruiseshipper";
        boolean foundPassword = false;
        for (String password : passwords) {
            if (userPassword.equals(password)) {
                System.out.println("Log-On Successful");
                foundPassword = true;
                break;
            }
        }
        if(!foundPassword) {
            System.out.println("You cannot be logged on using the specified password.");
        }
    }
}
