/*Exercise 2
You have saved up an amount of money, €500. Being a kind person, you like to help your friends by giving them small loans.
Your friends have asked if they can borrow the following amounts from you. 60,20,100,80,40,300,200,100.
Loans will be granted on a first come, first served basis.
Write a Java program, which processes these loan request amounts.
If there is enough money remaining in the kitty, the full amount of the loan request should be granted.
If, however, the amount of the loan request exceeds the amount of money remaining:
• Whatever amount of money is left in the kitty should be given out.
For example, if the balance remaining is €200 and the loan request is for €300, the balance remaining of €200 should be given out.
Any outstanding loan request amounts should then be displayed in the console.*/

package javacourse.exercises;
import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        Double [] loanRequests = {60D, 20D, 100D, 80D, 40D, 300D, 200D, 100D};
        Double currentBalance = 500D;
        Double minimumBalance = 0D;

        checkBalanceForLoanRequests(loanRequests, currentBalance, minimumBalance);
    }

    private static void checkBalanceForLoanRequests (Double[] loanRequests, Double currentBalance, Double minimumBalance) {
        List<Double> loanRequestsDenied = new ArrayList<>();
        String message = "";
        String loanRequestsMessage = "Cash in the pot: %s";
        loanRequestsMessage += "\nLoan amount requested: %s %s\n";

        for (Double loanRequest: loanRequests) {
            if (loanRequest <= currentBalance && currentBalance > minimumBalance) {
                message += String.format(loanRequestsMessage, currentBalance, loanRequest, " - Loan amount granted\n");
                currentBalance -= loanRequest;
            } else if (loanRequest > currentBalance && currentBalance > minimumBalance) {
                String text = "\nThe exact loan request amount cannot be processed in full (insufficient funds available).";
                text += "\nHowever, we will give you what we can..."+currentBalance + "\n";
                message += String.format(loanRequestsMessage, currentBalance, loanRequest, text);
                currentBalance -= loanRequest;
            } else if (currentBalance <= minimumBalance) {
                loanRequestsDenied.add(loanRequest);
            }
        }
        if (currentBalance <= minimumBalance) {
            message += "Cash remaining in the pot: 0\n";
            message += "The following loan requests could not be facilitated!\n";

            String amountsDeniedToPrint = "";
            for(Double amount : loanRequestsDenied) {
                String amountAsString = amount.toString();
                amountsDeniedToPrint += amountAsString + "\n";
            }
            message += amountsDeniedToPrint;

        }
        System.out.println(message);
    }
}
