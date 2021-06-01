package ie.com.certification.topic8;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        double [] loanRequests = {60D, 20D, 100D, 80D, 40D, 300D, 200D, 100D};
        double currentBalance = 500D;
        double minimumBalance = 0D;

        checkBalanceForLoanRequests(loanRequests, currentBalance, minimumBalance);
    }

    private static void checkBalanceForLoanRequests(double[] loanRequests, double currentBalance, double minimumBalance) {
        List<Double> loanRequestsDenied = new ArrayList<>();
        String message = "";
        String loanRequestsMessage = "Cash in the pot: %s";
        loanRequestsMessage += "\nLoan amount requested: %s %s\n";

        for (double loanRequest: loanRequests) {
            if (loanRequest <= currentBalance && currentBalance > minimumBalance) {
                message = String.format(loanRequestsMessage, currentBalance, loanRequest, " - Loan amount granted");
                System.out.println(message);
                currentBalance -= loanRequest;
            } else if (currentBalance > minimumBalance && loanRequest > currentBalance) {
                String text = "\nThe exact loan request amount cannot be processed in full (insufficient funds available).";
                text += "\nHowever, we will give you what we can..."+currentBalance;
                message = String.format(loanRequestsMessage, currentBalance, loanRequest, text);
                System.out.println(message);
                currentBalance -= loanRequest;
            } else if (currentBalance <= minimumBalance) {
                loanRequestsDenied.add(loanRequest);
            }
        }
        if (currentBalance <= minimumBalance) {
            message = "Cash remaining in the pot: 0\n";
            message += "The following loan requests could not be facilitated!\n" + loanRequestsDenied.toString();
            System.out.println(message);
        }
    }
}
