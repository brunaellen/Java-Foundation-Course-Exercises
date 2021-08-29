package javacourse.exercises;

public class JFT8Ex17 {
    public static void main (String[]args){
        Integer number = 30;
        Integer minimumNumber = 5;
        printNumbers(number, minimumNumber);
    }
    public static void printNumbers (Integer number, Integer minimumNumber){
        while (number >= minimumNumber){
            System.out.print(number + " ");
            number-=5;
        }
    }
}
