package cbiu.ac.bd;

import java.util.Scanner;

public class ConditionalStatement {

    public static void main(String[] args) {


        Scanner sr = new Scanner(System.in);

        System.out.println("ENter first value");
        int value1 = sr.nextInt();
        System.out.println("Enter Second VALUE");
        int value2= sr.nextInt();

        if (value1 == value2)
        {
            System.out.println("both value are equal");
        }
        else if (value1 < value2)
        {
            System.out.println("value1 is less then value2");

        }
        else if (value1 > value2)
        {
            System.out.println("value1 is grater then value2");
        }
        else
        {
            System.out.println("Something like error");
        }
    }
}
