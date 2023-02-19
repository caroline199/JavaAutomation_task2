package Lesson5.src.main.java.org.example;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");

        double numberOne = sc.nextDouble();
        System.out.println("Select operation:");
        char operation = sc.next().charAt(0);
        System.out.println("Enter number 2:");
        double numberTwo = sc.nextDouble();

        Numbers numbers = new Numbers(numberOne, numberTwo);
        String error = numbers.errorsCheck(operation);
        if(error.isEmpty()) {
            System.out.println("Your result " + numbers.getResult(operation));
        } else {
            System.out.println(error);
        }
    }
}