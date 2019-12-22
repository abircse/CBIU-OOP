package com.lab.cbiu;

public class Database {

    // Secure data
    private String pin = "12345";
    private String username = "cbiu";

    public void checkBankInformation(String atmpin, String atmusername)
    {
        if (pin.equals(atmpin) && username.equals(atmusername))
        {
            System.out.println("Now you can widraw money");
        }
        else
        {
            System.out.println("User name & pin code is wrong");
        }
    }
}
