package cbiu.ac.bd;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        // creating a class for get value from user
        Scanner sc = new Scanner(System.in);
        //showing a user define message
        System.out.println("Enter your first value: ");
        // now we will get a value from user to sc object
        int data1 = sc.nextInt();

        //showing a user define message
        System.out.println("Enter your Second value: ");
        // now we will get a value from user to sc object
        int data2 = sc.nextInt();
        // creating this value for store result of user input values
        int sum;
        // show a message
        System.out.println("Select a operator");
        // receiving operator from user
        Scanner sc1 = new Scanner(System.in);
        String operator = sc1.nextLine();

        switch (operator)
        {
            case "+":
                sum = data1+data2;
                System.out.println("Result is: "+sum+" for opertor"+operator);
                break;

            case "-":
                sum = data1-data2;
                System.out.println("Result is: "+sum+" for opertor"+operator);
                break;

            case "*":
                sum = data1*data2;
                System.out.println("Result is: "+sum+" for opertor"+operator);
                break;

            case "/":
                sum = data1/data2;
                System.out.println("Result is: "+sum+" for opertor"+operator);
                break;

            default:
                System.out.println("user input wrong operator or operator not match");
                break;

        }



    }
}
