package mortgageCalImp;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalImp {
    public static void main(String[] args) {
        int monthsInYear = 12;
        int percent = 100;

        float monthlyInterest;
        int principal;
        float annualInterest;
        int years;
        int numberOfPayments;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Principal: ");
            principal = scanner.nextInt();
            if (principal>= 1000 && principal<=1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }

        while(true) {
            System.out.println("Annual interest rate: ");
            annualInterest = scanner.nextFloat();
            monthlyInterest = annualInterest / percent / monthsInYear;
            if(annualInterest>=1 && annualInterest<=30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }
        while(true) {
            System.out.println("Period ( Years): ");
            years = scanner.nextInt();
            numberOfPayments = years * monthsInYear;
            if(years>= 5 && years<=30)
                break;
            System.out.println("Enter a value betweeen 5 and 30");
        }
        double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments))/(Math.pow(1 + monthlyInterest,numberOfPayments)-1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
