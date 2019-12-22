package com.lab.cbiu;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        /*
        * user define variable for additional functionality
        * */
        int userInputNumber1 = 10;
        int userInputNumber2 = 20;
        int result = userInputNumber1+userInputNumber2;
        System.out.println("Our result is: "+result);

        /*
        * User will input value from keyborad then we will
        * calculate addition
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter you second number: ");
        int secondNumber = scanner.nextInt();
        int result1 = firstNumber+secondNumber;
        System.out.println("Result is:"+result1);
    }




}
