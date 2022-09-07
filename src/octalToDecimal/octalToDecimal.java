package octalToDecimal;

import java.util.Scanner;

public class octalToDecimal {
    public static void main(String[] args) {
        String octal;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an octal number");
        octal = scanner.next();
        System.out.println("This is the decimal conversion  "+convertToDecimal(octal));

    }
    public static int convertToDecimal(String oct){
        int conversion = 1;
        int result = 0;


        for(int i  = 1; i <= oct.length(); i++){

            result = result + ((Character.getNumericValue(oct.charAt(oct.length() - i)))* conversion);
            conversion = conversion*8;


        }

        return result;
    }
}
