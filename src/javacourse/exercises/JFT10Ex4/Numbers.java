/*Create a Java class named Numbers to perform simple mathematical operations. Include the
following methods:
Method Signatures
public int sum(int num1, int num2)
public float divide(float num1, float num2)
public float multiply(int num1, int num2)
public float remainder(float num1, float num2)
public void message() (print the String: This is a class that performs simple, mathematical
operations)

and create a test class:

public class Test{
 public static void main(String[] args){
 Numbers n1 = new Numbers();
System.out.println("Sum: " + n1.sum(5,10));
System.out.println("Divide: " + n1.divide(10,10));
System.out.println("Multiply: " + n1.multiply(15,10));
System.out.println("Remainder: " + n1.remainder(100,90));
n1.message();
 }*/

package javacourse.exercises.JFT10Ex4;

public class Numbers {

    public int sum(int num1, int num2){
        int sumResult = num1 + num2;
        return sumResult;
    }
    public float divide(float num1, float num2){
        float divideResult = num1 / num2;
        return divideResult;
    }
    public float multiply(int num1, int num2){
        float multiplyResult = num1 * num2;
        return multiplyResult;
    }
    public float remainder(float num1, float num2){
        float remainderResult = num1 % num2;
        return remainderResult;
    }

    public void message() {
        String message = "This is a class that performs simple, mathematical operations.";
        System.out.println(message);
    }

}
