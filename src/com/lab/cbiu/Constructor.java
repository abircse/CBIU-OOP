package com.lab.cbiu;

import java.util.Scanner;

public class Constructor {

    public static void main(String[] args) {

        Database db = new Database();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you pin: ");
        String pin = sc.nextLine();
        System.out.println("Enter you username: ");
        String username = sc.nextLine();
        db.checkBankInformation(pin,username);

    }

    // this method is for login
    private static void loginUser(String successMessage)
    {
        System.out.println(successMessage);
    }

}
