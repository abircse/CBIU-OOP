package com.lab.cbiu;

public class ExceptionHandle {

    public static void main(String[] args) {

        try {

            int number1 = 10;
            int number2 = 0;
            int result = number1/number2;
            System.out.println(result);
        }
        catch (Exception e)
        {
            System.out.println("Problem for "+e.getMessage());
        }

    }
}
