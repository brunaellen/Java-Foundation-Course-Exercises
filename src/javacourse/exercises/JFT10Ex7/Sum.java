/*Question 7
Write a Java class named Sum and include the following overloaded methods. The methods
should return the sum of the values passed.
public int sumTwoValues(int num1, int num2)
public float sumTwoValues(float num1, float num2)
public double sumTwoValues(double num1, double num2)
public int sumTwoValues(byte num1, byte num2)
public int sumTwoValues(byte num1, int num2)
Create a second class named Test and include the main method. Create an object of class
type Sum and call each of the overloaded methods in turn, passing appropriate values.
For example:
 System.out.println(s1.sumTwoValues(4,5)); // call the int method version*/

package javacourse.exercises.JFT10Ex7;

public class Sum {
    public int sumTwoValues(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
    public float sumTwoValues(float num1, float num2){
        float result = num1 + num2;
        return result;
    }
    public double sumTwoValues(double num1, double num2){
        double result = num1 + num2;
        return result;
    }
    public int sumTwoValues(byte num1, byte num2){
        int result = num1 + num2;
        return result;
    }
    public int sumTwoValues(byte num1, int num2){
        int result = num1 + num2;
        return result;
    }
}
