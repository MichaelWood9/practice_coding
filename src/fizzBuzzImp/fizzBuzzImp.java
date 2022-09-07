package fizzBuzzImp;

import java.util.Scanner;

public class fizzBuzzImp {
    public static void main(String[] args) {

        int num;

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Enter a number ");
            num = scanner.nextInt();
            if(num >= 1 && num <= 100)
                break;
            System.out.println("Enter a number between 1-100");
        }
        for(int i = 1; i <= num; i++ ){
            if(i%3 == 0 && i%5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else
                System.out.println(i);
        }
    }
}
