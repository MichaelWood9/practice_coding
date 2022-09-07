package mortgageCal;

import java.text.NumberFormat;
import java.util.Scanner;

public class morgageCalculator {
    public static void main(String[] args) {
        int monthsInYear = 12;
        int percent = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual interest rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / percent /monthsInYear;

        System.out.println("Period ( Years): ");
        int years = scanner.nextInt();
        int numberOfPayments = years * monthsInYear;

        double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments))/(Math.pow(1 + monthlyInterest,numberOfPayments)-1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
