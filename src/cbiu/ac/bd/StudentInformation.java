package cbiu.ac.bd;

/*
 *Task:
 * 1. user will input 2value as like as username & password
 * 2. We have to print it through a method called dataFromDatabase
 * */

import java.util.Scanner;

public class StudentInformation {

    // this is our main function
    public static void main(String[] args) {

        // user input functionality
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your user name");
//        String userName = scanner.nextLine();
//        System.out.print("Enter your password");
//        String passWord = scanner.nextLine();

        // we initialize a object of showUserInformation Class
//        ShowUserInformation sui = new ShowUserInformation();
//        sui.fetchUserNameAndPassword(userName, passWord);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Value: ");
        int firstvalue = scanner.nextInt();
        System.out.print("Enter Second Value: ");
        int secondvalue = scanner.nextInt();

        Sum sum = new Sum();
        sum.doSum(firstvalue, secondvalue);

    }
}


